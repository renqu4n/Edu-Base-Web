package com.hk.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import com.hk.bean.TeacherShow;
import com.hk.service.TeacherShowService;
import com.hk.tools.Json;

@Controller
@RequestMapping(value="teacher",produces="text/json;charset=UTF-8")
public class TeacherShowController {
	
	@Autowired
	private TeacherShowService teaservice;
	
<<<<<<< HEAD
	@RequestMapping("teacherShow.do")
	public Object teacherShowList(){
=======
	@RequestMapping("/teacherShow.do")
	@ResponseBody
	/*public Object teacherShowList(){
>>>>>>> e579da15acfc4a5a9387dc5aebc2bf1118c8168d
		//调用service的方法
		List<TeacherShow> teaShowList = teaservice.findTeacherShow();
		System.out.print(teaShowList);
		
		String   teaShowLists = Json.toJSONString(teaShowList);
		return teaShowLists;
		
	}*/
	public String  	getTeacherShow(){
		List<TeacherShow> teaShowList = teaservice.findTeacherShow();
		String   teaShowJson = Json.toJSONString(teaShowList);
		return teaShowJson;
		
	}
	

}
