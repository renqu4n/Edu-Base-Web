package com.hk.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hk.bean.News;
import com.hk.bean.Page;
import com.hk.bean.Role;
import com.hk.service.RoleService;

@Controller
public class RoleController {
	@Autowired
	private RoleService service;
	
	
	@RequestMapping(value="/addRole.do")
	public String addStudent(HttpServletRequest request,HttpServletResponse response,Role role) {
		Role isRole = service.selectRole(role);
		if (isRole!=null) {
			request.setAttribute("message", "该角色已经存在-------！！！");
		} else {
			boolean isSuccess = service.insertRole(role);
			if (isSuccess) {
				request.setAttribute("message", "添加成功-------");
				
			} else {
				request.setAttribute("message", "添加失败-------！！！");

			}

		}

		return "addRole";
	}
	
	@RequestMapping(value="/roleShow.do")
	public String roleShow(HttpServletRequest request,HttpServletResponse response,Page page,HttpSession session) {

		int currentPage = 1;
		int pageCount = 10;
		
		
		String c = request.getParameter("currentPage");
		if (c != null) {
			currentPage = Integer.valueOf(c);
		}
		int start = (currentPage - 1) * pageCount;
		
		page.setPageCount(pageCount);
		page.setStart(start);
		List<News> Roles = service.getAllRoles(page);
		int  RoleCount = service.selectRoleCount();
		System.out.println(Roles);
		System.out.println(RoleCount);
		//session.setAttribute("Roles", Roles);
		//int pageCount = page.getPageCount();
		 int   totalPageCount = RoleCount / pageCount;
			if(RoleCount % pageCount != 0) {
				totalPageCount = totalPageCount + 1;
			}
		Map<String, Object> pages = new HashMap<String, Object>();
		
		pages.put("Roles", Roles);
		pages.put("totalPageCount",totalPageCount);
		pages.put("RoleCount",RoleCount);
		pages.put("pageCount",pageCount);
		
        request.setAttribute("pages", pages);
		request.setAttribute("currentPage", currentPage);
        
        
		
		return "forward:/roleManage.jsp";
	}
	
	
	@RequestMapping(value="/deleteRole.do")
	public void deleteRole(HttpServletRequest request,HttpServletResponse response) throws IOException {
		
		String type = request.getParameter("method");
		if ("delete".equals(type)) {
		String key = request.getParameter("key");
		
		service.deleteRole(Integer.parseInt(key));

		}
	
		response.sendRedirect("roleShow.do");
	
	}
}
