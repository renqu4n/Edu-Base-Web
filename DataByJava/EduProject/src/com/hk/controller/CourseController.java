package com.hk.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hk.bean.Course;
import com.hk.bean.Page;
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
	
	
	@RequestMapping(value="/courseShow.do")
	public String courseShow(HttpServletRequest request,HttpServletResponse response,Page page) {

		int currentPage = 1;
		int pageCount = 10;
		
		
		String c = request.getParameter("currentPage");
		if (c != null) {
			currentPage = Integer.valueOf(c);
		}
		int start = (currentPage - 1) * pageCount;
		
		page.setPageCount(pageCount);
		page.setStart(start);
		List<Course> courses = service.getAllCourses(page);
		int  CourseCount = service.selectcourseCount();
		System.out.println(courses);
		System.out.println(CourseCount);
		/*ArrayList teacher_ids = new ArrayList();
		for (int i = 0; i < courses.size(); i++) {
			int teacher_id =  courses.get(i).getTeacher_id();
			
			teacher_ids.add(teacher_id);
		}
		
		System.out.println(teacher_ids);
		List  teacher_name = service.selectTeacherName();
		System.out.println(teacher_name);*/
		
		
		//int pageCount = page.getPageCount();
		 int   totalPageCount = CourseCount / pageCount;
			if(CourseCount % pageCount != 0) {
				totalPageCount = totalPageCount + 1;
			}
		Map<String, Object> pages = new HashMap<String, Object>();
		
		pages.put("courses", courses);
		pages.put("totalPageCount",totalPageCount);
		pages.put("CourseCount",CourseCount);
		pages.put("pageCount",pageCount);
		
        request.setAttribute("pages", pages);
		request.setAttribute("currentPage", currentPage);
        
        
		
		return "forward:/courseManage.jsp";
	}
	
	@RequestMapping(value="/deleteCourse.do")
	public void deleteCourse(HttpServletRequest request,HttpServletResponse response) throws IOException {
		
		String type = request.getParameter("method");
		if ("delete".equals(type)) {
		String key = request.getParameter("key");
		
		service.deleteCourse(Integer.parseInt(key));

		}
	
		response.sendRedirect("courseShow.do");
	
	}
	
}
