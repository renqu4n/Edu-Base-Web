package com.hk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JumpTeacherShowController {
	//用控制器来控制转发
	@RequestMapping("jump.do")
	public String jump(String target){
		return "forward:/target";
		
	}

}
