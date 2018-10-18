package com.hk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.hk.bean.New;
import com.hk.service.NewService;
import com.hk.tools.Json;

//创建控制器对象
@Controller
@RequestMapping("new")
public class NewController {
	@Autowired
	private NewService service;
	
//	当使用注解方式的时候，是一个URL对应一个方法，方法可以自定义
	@RequestMapping(value="/getNew.do")
	@ResponseBody
	public String getNew() {
		
		List<New> news = service.findNew();
		String   newsjson = Json.toJSONString(news);
		System.out.println(news);

		return newsjson;
	}
	
	@RequestMapping({"/other.do","/abc.do","123.do"})
	public ModelAndView doOther() {
		
		System.out.println("doOther-------");
		
		return null;
	}
}
