package com.hk.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hk.bean.Admin;
import com.hk.service.AdminService;


@Controller
public class AdminController {
	@Autowired
	private AdminService service;
	
	
	@RequestMapping(value="/checkAdmin.do")
	public String checkAdmin(HttpServletRequest request,HttpServletResponse response,HttpSession session) throws ServletException, IOException{
		
		
		
		List<Admin> admins = service.findAdmin();
		
		
		String admin_user=request.getParameter("admin");
		String admin_pwd=request.getParameter("password");
		System.out.println(admin_user);
		System.out.println(admin_pwd);
		Admin admin = service.checkAdmin(admin_user, admin_pwd);
		System.out.println(admin);
		if (admin!=null) {
			System.out.println("登陆成功");
			session.setAttribute("admin_user", admin_user); 
			session.setAttribute("admin_pwd", admin_pwd);
			//request.getRequestDispatcher("/WEB-INF/jsp/back_manager.jsp").forward(request, response);
			return "redirect:/back_manager.html";
		} else {
			System.out.println("用户名或密码错误");
			return "redirect:/index.html";

		}
		
		
		
/*		for (int i = 0; i < admins.size(); i++) {
			Admin admin2 = admins.get(i);
			
			if (admin2.getAdmin_name().equals(admin_user)) {
				
			} else {

			}
			
		}*/
		
		
		
		
	}

}
