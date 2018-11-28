package com.hk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hk.bean.StudentsThink;
import com.hk.service.StudentThinkService;
import com.hk.tools.Json;


@Controller
public class StudentThinkController {
	@Autowired
     private StudentThinkService service;
	
	@RequestMapping(value="/getStudentThink.do",produces="text/json;charset=UTF-8")
	@ResponseBody
	public String getStudentThink(){
		List<StudentsThink> studentsThink= service.findStudent();
	    String studentsJson= Json.toJSONString(studentsThink);
	    System.out.println(studentsJson);
		return studentsJson;
		
	}
	 
}
