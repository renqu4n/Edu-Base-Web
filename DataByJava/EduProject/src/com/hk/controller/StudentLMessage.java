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
	
	@RequestMapping(value="/insertMessage.do",produces="text/json;charset=UTF-8")
	public String insertMessage(HttpServletRequest request, HttpServletResponse response) throws Exception{

		String message=request.getParameter("input");
		User user=(User) request.getSession().getAttribute("user");
		int user_rid=user.getRole_id();
		if (user_rid==2) {
			if (message==null || message.trim().isEmpty() ) {
				//System.out.println("empty");
				String nullworning="留言空了！";
				request.setAttribute("nullworning", nullworning);//将警告返回前端提示
			}else {
				
				StudentsThink stk=new StudentsThink();
			   	
				stk.setMessage_content(message);//留言内容
			   	
				stk.setStudent_id(user.getId());
				
			    Date date = new Date();
			    SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		       // System.out.println(sdf.format(date));
			   	stk.setData(sdf.format(date));//留言时间
			   	
			   	String student_name=user.getUser_name();
			   	request.setAttribute("student_name", student_name);
			   	//System.out.println(user.getUser_name());
				//stk.setStudent_name(user.getUser_name());//留言学生名字
					
			   	boolean b=service.insertmessage(stk);
			   	request.setAttribute("isSuccess", b);//插入成功是否的提示 ，需要返回前端
			}
		} else {
			String studentworning="不是学员！";
			request.setAttribute("studentworning", studentworning);//将警告返回前端提示
		}
		
		return "index";
	}
	
	 
}
