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
		
		
		
		
		
		String radio = request.getParameter("role");
		System.out.println(radio);
		
		
		
		

		
		return "forward:/singleUserPerManager.do";
	}
	
}
