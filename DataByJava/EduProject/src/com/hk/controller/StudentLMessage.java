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
		System.out.println("插入留言页面");
		String message=request.getParameter("input");
		User user=(User) request.getSession().getAttribute("user");
		int user_rid=user.getRole_id();
		System.out.println(user_rid);
		if (user_rid==2) {
			if (message==null || message.trim().isEmpty() ) {
				//System.out.println("empty");
				String nullworning="留言空了！";
				request.setAttribute("nullworning", nullworning);//将警告返回前端提示
			}else {
				System.out.println(111);
				StudentsThink stk=new StudentsThink();
				System.out.println(222);
				stk.setMessage_content(message);//留言内容
				System.out.println(333);
				stk.setStudent_id(user.getId());
				System.out.println(444);
			    Date date = new Date();
			    SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		       // System.out.println(sdf.format(date));
			   	stk.setData(sdf.format(date));//留言时间
			   	System.out.println(555);
			   	String student_name=user.getUser_name();
			   	request.setAttribute("student_name", student_name);
			   	//System.out.println(user.getUser_name());
				//stk.setStudent_name(user.getUser_name());//留言学生名字
				System.out.println("这是"+stk);
			   	boolean b=service.insertmessage(stk);
			   	request.setAttribute("isSuccess", b);//插入成功是否的提示 ，需要返回前端
			}
		} else {
			String studentworning="不是学员！";
			request.setAttribute("studentworning", studentworning);//将警告返回前端提示
		}
		
		return "forward:/index.html";
	}
	
	 
}
