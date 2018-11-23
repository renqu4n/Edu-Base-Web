package com.hk.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hk.bean.Page;
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
	
	
	@RequestMapping(value="/studentShow.do")
	public String studentShow(HttpServletRequest request,HttpServletResponse response,Page page) {

		int currentPage = 1;
		int pageCount = 10;
		
		
		String c = request.getParameter("currentPage");
		if (c != null) {
			currentPage = Integer.valueOf(c);
		}
		int start = (currentPage - 1) * pageCount;
		
		page.setPageCount(pageCount);
		page.setStart(start);
		List<User> student = service.getAllStudent(page);
		int  Count = service.selectCount();
		System.out.println(student);
		System.out.println(Count);
		
		//int pageCount = page.getPageCount();
		 int   totalPageCount = Count / pageCount;
			if(Count % pageCount != 0) {
				totalPageCount = totalPageCount + 1;
			}
		Map<String, Object> pages = new HashMap<String, Object>();
		
		pages.put("student", student);
		pages.put("totalPageCount",totalPageCount);
		pages.put("Count",Count);
		pages.put("pageCount",pageCount);
		
        request.setAttribute("pages", pages);
		request.setAttribute("currentPage", currentPage);
        
        
		
		return "forward:/studentsManage.jsp";
	}
	
	
	@RequestMapping(value="/deleteStudent.do")
	public void deleteStudent(HttpServletRequest request,HttpServletResponse response) throws IOException {
		
		String type = request.getParameter("method");
		if ("delete".equals(type)) {
		String key = request.getParameter("key");
		
		service.deleteStudent(Integer.parseInt(key));

		}
	
		response.sendRedirect("studentShow.do");
	
	}
	
	@RequestMapping(value="/teachShow.do")
	public String thinkShow(HttpServletRequest request,HttpServletResponse response,Page page) {

		int currentPage = 1;
		int pageCount = 10;
		
		
		String c = request.getParameter("currentPage");
		if (c != null) {
			currentPage = Integer.valueOf(c);
		}
		int start = (currentPage - 1) * pageCount;
		
		page.setPageCount(pageCount);
		page.setStart(start);
		List<User> Teach = service.getAllTeachs(page);
		int  TeachCount = service.selectTeachCount();
		System.out.println(Teach);
		System.out.println(TeachCount);
		
		//int pageCount = page.getPageCount();
		 int   totalPageCount = TeachCount / pageCount;
			if(TeachCount % pageCount != 0) {
				totalPageCount = totalPageCount + 1;
			}
		Map<String, Object> pages = new HashMap<String, Object>();
		
		pages.put("Teach", Teach);
		pages.put("totalPageCount",totalPageCount);
		pages.put("TeachCount",TeachCount);
		pages.put("pageCount",pageCount);
		
        request.setAttribute("pages", pages);
		request.setAttribute("currentPage", currentPage);
        
        
		
		return "forward:/teachManage.jsp";
	}
	
	
	@RequestMapping(value="/deleteTeach.do")
	public void deleteTeach(HttpServletRequest request,HttpServletResponse response) throws IOException {
		
		String type = request.getParameter("method");
		if ("delete".equals(type)) {
		String key = request.getParameter("key");
		
		service.deleteStudent(Integer.parseInt(key));

		}
	
		response.sendRedirect("teachShow.do");
	
	}
	
	
	
}
