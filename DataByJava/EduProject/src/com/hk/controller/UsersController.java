package com.hk.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hk.bean.User;
import com.hk.service.UserService;

@Controller
public class UsersController {
	@Autowired
	private UserService service;
	
	
	@RequestMapping(value="/addStudent.do")
	public String addStudent(HttpServletRequest request,HttpServletResponse response,User user) {

		User  is = service.selectUser(user);
		System.out.println(is);
	if (is!=null) {
		if (is.getRole_id()!=2) {
			service.updateStudent(is);
			request.setAttribute("message", "添加成功-------");

		}
		
	} else {
		request.setAttribute("message", "该学员不是普通用户-------！！！");
		
	}
		
		
		

		return "addStudents";
	}
	
	@RequestMapping(value="/addTeacher.do")
	public String addTeacher(HttpServletRequest request,HttpServletResponse response,User user) {

		User  is = service.selectUser(user);
		System.out.println(is);
	if (is!=null) {
		if (is.getRole_id()!=3) {
			service.updateTeacher(is);
			request.setAttribute("message", "添加成功-------");

		}
		
	} else {
		request.setAttribute("message", "该教师不是普通用户-------！！！");
		
	}
		
		
		

		return "addTeacher";
	}
	
	
	
}
