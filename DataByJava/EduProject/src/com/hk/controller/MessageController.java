package com.hk.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hk.bean.News;
import com.hk.bean.Page;
import com.hk.service.MessageService;
@Controller
public class MessageController {

	@Autowired
	private MessageService service;
	
	@RequestMapping(value="/messageShow.do")
	public String messageShow(HttpServletRequest request,HttpServletResponse response,Page page) {

		int currentPage = 1;
		int pageCount = 10;
		
		
		String c = request.getParameter("currentPage");
		if (c != null) {
			currentPage = Integer.valueOf(c);
		}
		int start = (currentPage - 1) * pageCount;
		
		page.setPageCount(pageCount);
		page.setStart(start);
		List<News> Messages = service.getAllMessages(page);
		int  MessageCount = service.selectMessageCount();
		System.out.println(Messages);
		System.out.println(MessageCount);
		
		
		
		
		 int   totalPageCount = MessageCount / pageCount;
			if(MessageCount % pageCount != 0) {
				totalPageCount = totalPageCount + 1;
			}
		Map<String, Object> pages = new HashMap<String, Object>();
		
		pages.put("Messages", Messages);
		pages.put("totalPageCount",totalPageCount);
		pages.put("MessageCount",MessageCount);
		pages.put("pageCount",pageCount);
		
        request.setAttribute("pages", pages);
		request.setAttribute("currentPage", currentPage);
        
        
		
		return "forward:/messageManage.jsp";
	}
	
	@RequestMapping(value="/deleteMessage.do")
	public void deleteMessage(HttpServletRequest request,HttpServletResponse response) throws IOException {
		
		String type = request.getParameter("method");
		if ("delete".equals(type)) {
		String key = request.getParameter("key");
		
		service.deleteMessage(Integer.parseInt(key));

		}
	
		response.sendRedirect("messageShow.do");
	
	}

}