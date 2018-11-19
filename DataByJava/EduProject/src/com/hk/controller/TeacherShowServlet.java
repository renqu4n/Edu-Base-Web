package com.hk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hk.bean.TeacherShow;
import com.hk.service.teacherShowService;

@Controller
public class TeacherShowServlet {
	
	@Autowired
	private teacherShowService teaservice;
	
	@RequestMapping("teacherShow.do")
	public ModelAndView teacherShowList(){
		System.out.println("接收到请求");
		List<TeacherShow> list = teaservice.findTeacherShow();
		System.out.println(list);
		return null;
		
	}
	

}
