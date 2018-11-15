package com.hk.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.hk.bean.News;
import com.hk.service.NewService;
import com.hk.tools.Json;

//创建控制器对象
@Controller
public class NewController {
	@Autowired
	private NewService service;
	
//	当使用注解方式的时候，是一个URL对应一个方法，方法可以自定义
	@RequestMapping(value="/getNew.do")
	@ResponseBody
	public String getNew() {
		
		List<News> news = service.findNew();
		String   newsjson = Json.toJSONString(news);
		System.out.println(news);

		return newsjson;
	}
	
	

		

	@RequestMapping(value="/addNew.do")
	public String addNew(HttpServletRequest request,HttpServletResponse response,News news) throws IOException, ServletException {
			
			System.out.println(news);

			//PrintWriter out = response.getWriter();
			boolean is = service.addNew(news);
			
			if(is==true){
                
				request.setAttribute("message", "添加成功-------");
				return "addnew";
				
                
            }else{
            	
            	request.setAttribute("message", "添加失败-------");
            	return "addnew";
            }
	
		}
	
	
	@RequestMapping({"/other.do","/abc.do","123.do"})
	public ModelAndView doOther() {
		
		System.out.println("doOther-------");
		
		return null;
	}
}
