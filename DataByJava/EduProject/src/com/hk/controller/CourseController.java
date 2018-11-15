package com.hk.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hk.bean.Course;
import com.hk.bean.User;
import com.hk.service.CourseService;
import com.hk.service.UserService;

@Controller
public class CourseController {
	@Autowired
	private CourseService service;
	
	@Autowired
	private UserService Userservice;
	
	
	
	@RequestMapping(value="/addCourse.do")
	public String addStudent(HttpServletRequest request,HttpServletResponse response,Course course,int teacher_id,User user) {
		user.setId(teacher_id);

		User  isTeacher = Userservice.selectTeacher(user);
		if (isTeacher.getRole_id()==3) {
			boolean  is = service.insertCourse(course);
			System.out.println(is);
			if (is) {
				request.setAttribute("message", "添加成功-------");
				
			} else {
				request.setAttribute("message", "添加失败-------！！！");

			}
			
			
			
		} else {
			
			request.setAttribute("message", "该用户不是教师或该教师不存在-------！！");
		}


		return "addCourse";
	}
	
}
