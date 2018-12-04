package com.hk.controller;

import java.util.Properties;

import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hk.bean.User;

@Controller
public class SendEmailController {

	@RequestMapping(value="/SendEmail.do")
	public void SendEmail(HttpServletRequest request,HttpServletResponse response,User user) throws MessagingException {
			System.out.println("这是发送邮件的用户：");
		    System.out.println(user);
			 Properties props = new Properties();  
		        // 开启debug调试  
		        props.setProperty("mail.debug", "true");  
		        // 发送服务器需要身份验证  
		        props.setProperty("mail.smtp.auth", "true");  
		        // 设置邮件服务器主机名  
		        props.setProperty("mail.host", "smtp.qq.com");  
		        // 发送邮件协议名称  
		        props.setProperty("mail.transport.protocol", "smtp");  
		        // 设置环境信息  
		        Session session = Session.getInstance(props);  
		        session.setDebug(true); 
		        // 创建邮件对象  
		        Message msg = new MimeMessage(session);  
		        try {
					msg.setSubject("JavaMail测试");
				} catch (MessagingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}  
		        // 设置邮件内容  
		        msg.setText("测试邮件");  
		        // 设置发件人  
		        msg.setFrom(new InternetAddress("惠科集团----"));  
		          
		        Transport transport = session.getTransport();  
		        // 连接邮件服务器     xzbbrvnlsjpdbfei
		        transport.connect("296435342@qq.com", "gxhmfkzrbrxtcafj");  
		        // 发送邮件  
		        user.getUser_email();
		        System.out.println(user.getUser_email());
		        transport.sendMessage(msg, new Address[] {new InternetAddress(user.getUser_email())});  
		        // 关闭连接  
		        transport.close();  
		    }  
	
	
}
