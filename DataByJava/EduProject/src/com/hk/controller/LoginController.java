package com.hk.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hk.bean.Admin;
import com.hk.bean.Regist;
import com.hk.service.LoginService;


@Controller
public class LoginController {
	@Autowired
	private LoginService service;
	
	
	@RequestMapping(value="/checkAdmin.do")
	public String checkAdmin(HttpServletRequest request,HttpServletResponse response,HttpSession session) throws ServletException, IOException{
		
		
		
		List<Admin> admins = service.findAdmin();
		
		
		String admin_user=request.getParameter("admin");
		String admin_pwd=request.getParameter("password");
		System.out.println(admin_user);
		System.out.println(admin_pwd);
		Admin admin = service.checkAdmin(admin_user, admin_pwd);
		
		if (admin!=null) {
			System.out.println("登陆成功");
			session.setAttribute("admin_user", admin_user); 
			session.setAttribute("admin_pwd", admin_pwd);
			//request.getRequestDispatcher("/WEB-INF/jsp/back_manager.jsp").forward(request, response);
			return "redirect:/back_manager.html";
		} else {
			System.out.println("用户名或密码错误");
			return "redirect:/login.html";

		}
	
	}

	@RequestMapping(value="/regist.do")
	public String regist(HttpServletRequest request,HttpServletResponse response,HttpSession session,Regist regist) throws IOException{
	
		System.out.println(regist);
		boolean isSuccess=service.addUser(regist);
		if (isSuccess) {
			response.getWriter().write("注册成功！2秒钟跳到登录页面，请登录.......");  
            //设置2秒钟跳转  
            response.setHeader("refresh", "2;url=/Edu-ssm/login.html");
		}else {
			response.getWriter().write("输出密码不一致或已存在该用户，请重新输入！！！！");  
            //设置2秒钟跳转  
			response.setHeader("refresh", "2;url=/Edu-ssm/regist.html");

		}

		return null; 
	
	}
	
	@RequestMapping(value="/userLogin.do")
	public String userLogin(HttpServletRequest request,HttpServletResponse response,HttpSession session) throws ServletException, IOException{
		System.out.println("进来了");

		String user=request.getParameter("admin");
		String pwd=request.getParameter("password");
		Regist users = service.userLogin(user, pwd);
		
		if (users!=null) {
			System.out.println("用户登陆成功");
			session.setAttribute("user", user); 
			session.setAttribute("pwd", pwd);
			//request.getRequestDispatcher("/WEB-INF/jsp/back_manager.jsp").forward(request, response);
			return "index";
		} else {
			System.out.println("用户登录失败，用户名或密码错误");
			return "redirect:/login.html";

		}
	
	}
	
	
	
	
	
}
