package com.hk.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hk.bean.Menu;
import com.hk.bean.Role;
import com.hk.bean.User;
import com.hk.service.MenuService;
import com.hk.service.RoleService;
import com.hk.service.UserService;
import com.hk.tools.Json;

@Controller
public class PermissionController {
	@Autowired
	private RoleService service;
	@Autowired
	private UserService userservice;
	@Autowired
	private MenuService menuService;
	
	@RequestMapping(value="/permissionManager.do")
	public String addStudent(HttpServletRequest request,HttpServletResponse response) {
		
		
			//User menu = (User) session.getAttribute("user");
			List<Role> roles = service.getAllRoles();
			request.setAttribute("roles", roles);
			
			//request.setAttribute("user", user);
			
			
			Map<String,Integer> map1 = new HashMap<String,Integer>();
			for (int i = 0; i < roles.size(); i++) {
				
				List<Menu> menu = menuService.showMenu(i);
				
				map1.put(roles.get(i).getName(), roles.get(i).getId());
				
			}
			
			request.setAttribute("map", map1);

		
		
		return "forward:/permissionManager.jsp";
	}
	
	
	@RequestMapping(value="/singleUserPerManager.do")
	public String singleUserPerManager(HttpServletRequest request,HttpServletResponse response) {
		
		
			//User menu = (User) session.getAttribute("user");
			List<Role> roles = service.getAllRoles();
			request.setAttribute("roles", roles);
			
			//request.setAttribute("user", user);
		

		
		
		return "forward:/singleUserPerManager.jsp";
	}
	
	
	
	@RequestMapping(value="/updateUserPermission.do")
	public String updateUserPermission(HttpServletRequest request,HttpServletResponse response,HttpSession session) {
		
		String nameAndEmail = request.getParameter("user_name");
		User is = userservice.selectUserByNameEmail(nameAndEmail);
		if (is!=null) {
			int radio = Integer.parseInt(request.getParameter("role"));
			System.out.println(radio);
			List<Menu> userMenu = menuService.showMenu(is.getRole_id());
			if (radio==0) {
				
				request.setAttribute("message", "请为该用户选择要改变的角色-------！！！");
			} else {
				if (radio==is.getRole_id()) {
					request.setAttribute("message", "请选择与用户角色不一样的角色-------！！！");
					
				} else {
					//登录用户角色权限菜单
					//List<Menu> roleMenu = menuService.showMenu(radio);
					User loginUser = (User) session.getAttribute("user");
					
					if (userMenu.size()>loginUser.getMenus().size()) {
						//用户权限大于登录角色的权限
						request.setAttribute("message", "你的权限不够-------！！！");
						
					} else {
						
						//修改用户的角色，两个参数，一个为用户id，另一个为角色id，即radio
						boolean issuccss = userservice.updataUserRole(is.getId(), radio);
						if (issuccss) {
							request.setAttribute("message", "修改用户角色成功-------！！！");
							
						} else {
							request.setAttribute("message", "修改用户角色失败-------！！！");

						}

					}
				
				}
				
				
			}
			
			
		} else {
			
			request.setAttribute("message", "该用户不存在-------！！！");
		}
		
		
		
		
		
		

		
		return "forward:/singleUserPerManager.do";
	}
	
	@RequestMapping(value="/getRoleMenu.do", produces = "text/html;charset=UTF-8")
	@ResponseBody
	public String getRoleMenu(HttpServletRequest request,HttpServletResponse response) {
			
		 int id = Integer.parseInt(request.getParameter("id"));
		
			
			//User menu = (User) session.getAttribute("user");
			List<Role> roles = service.getAllRoles();
			
			//Map<String,List> map1 = new HashMap<String,List>();
			//for (int i = 0; i < roles.size(); i++) {
				
				List<Menu> menu = menuService.showMenu(id);
				
				//map1.put(roles.get(i).getName(), menu);
				
			
			//System.out.println(map1);
			
			String map = Json.toJSONString(menu);
			
		
		
		return map;
	}
	
	
	
	
}
