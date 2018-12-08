package com.hk.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hk.bean.Role;
import com.hk.bean.User;
import com.hk.service.RoleService;
import com.hk.service.UserService;

@Controller
public class PermissionController {
	@Autowired
	private RoleService service;
	@Autowired
	private UserService userservice;
	
	@RequestMapping(value="/permissionManager.do")
	public String addStudent(HttpServletRequest request,HttpServletResponse response) {
		
		
			//User menu = (User) session.getAttribute("user");
			List<Role> roles = service.getAllRoles();
			request.setAttribute("roles", roles);
			
			//request.setAttribute("user", user);
		

		
		
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
	public String updateUserPermission(HttpServletRequest request,HttpServletResponse response) {
		
		String nameAndEmail = request.getParameter("user_name");
		User is = userservice.selectUserByNameEmail(nameAndEmail);
		if (is!=null) {
			int radio = Integer.parseInt(request.getParameter("role"));
			System.out.println(radio);
			if (radio==0) {
				
				request.setAttribute("message", "请为该用户选择要改变的角色-------！！！");
			} else {
				if (radio==is.getRole_id()) {
					request.setAttribute("message", "请选择与用户角色不一样的角色-------！！！");
					
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
			
			
		} else {
			
			request.setAttribute("message", "该用户不存在-------！！！");
		}
		
		
		
		
		
		

		
		return "forward:/singleUserPerManager.do";
	}
	
}
