package com.hk.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hk.bean.StudentsThink;
import com.hk.bean.User;
import com.hk.service.StudentThinkService;
import com.hk.tools.Json;


@Controller
public class StudentThinkController {
	@Autowired
     private StudentThinkService service;
	
	@RequestMapping(value="/getStudentThink.do",produces="text/json;charset=UTF-8")
	@ResponseBody
	public String getStudentThink(HttpServletRequest request, HttpServletResponse response){
		List<StudentsThink> studentsThink= service.findStudent();
	    String studentsJson= Json.toJSONString(studentsThink);
	    
	  //  User user=(User) request.getSession().getAttribute("user");
	   // System.out.println( user.getUser_name());
	    
	   // Map<String, String> map=new HashMap<String, String>();
	   
	  //  map.put("json", studentsJson);
	  //  map.put("student_name",user.getUser_name());
	    //System.out.println(studentsJson);
	  //  String mapjson=Json.toJSONString(map);
	  //  System.out.println(mapjson);
	    System.out.println(studentsThink);
		return studentsJson;
		
	}
	 
}
