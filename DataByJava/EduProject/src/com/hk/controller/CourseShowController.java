package com.hk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hk.bean.CourseShow;

import com.hk.service.CourseShowService;
import com.hk.tools.Json;

@Controller
@RequestMapping(value="coshow",produces="text/json;charset=UTF-8")
public class CourseShowController {
	@Autowired
	private CourseShowService coservice;
	
    
	@RequestMapping("courseshow.do")
	@ResponseBody
    public String getCourseShowList(){
    	List<CourseShow> coShowList = coservice.findCourseShow();
    	System.out.println(coShowList);
    	String   coShowJson = Json.toJSONString(coShowList);
		return coShowJson;
		
		
	}
}
