package com.hk.controller;



import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hk.bean.StudentsThink;
import com.hk.bean.User;
import com.hk.service.StudentThinkService;


 
@Controller
public class StudentLMessage{
	@Autowired
    private StudentThinkService service;
	
	@RequestMapping(value="/insertMessage.do")
	public String insertMessage(HttpServletRequest request, HttpServletResponse response) throws Exception{
		
		
		String message=request.getParameter("input");
		if (message==null || message.trim().isEmpty() ) {
			//System.out.println("empty");
			String worning="留言空了！";
			request.setAttribute("worning", worning);//将警告返回前端提示
		}else {
			StudentsThink stk=new StudentsThink();
		   	stk.setMessage_content(message);
		   	
		    Date date = new Date();
		    SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
	       // System.out.println(sdf.format(date));
		   	stk.setData(sdf.format(date));
		   	
		   	User user=(User) request.getSession().getAttribute("users");
		   	//System.out.println(user.getUser_name());
			stk.setStudent_name(user.getUser_name());
			
			
		   	boolean b=service.insertmessage(stk);
		   	request.setAttribute("isSuccess", b);//插入成功是否的提示 ，需要返回前端
		}
		return "index";
	}
	
	 
}
