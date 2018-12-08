package com.hk.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hk.bean.Menu;
import com.hk.bean.Role;
import com.hk.bean.Url;
import com.hk.bean.User;
import com.hk.service.LoginService;
import com.hk.service.MenuService;
import com.hk.service.RoleService;
import com.hk.service.UrlService;


@Controller
public class LoginController{
	@Autowired
	private LoginService service;
	@Autowired
	private UrlService Urlservice;
	@Autowired
	private MenuService menuService;
	@Autowired
	private RoleService roleservice;

	@RequestMapping(value="/regist.do")
	public String regist(HttpServletRequest request,HttpServletResponse response,HttpSession session,User user) throws IOException{
	
		
		String checkcode = request.getParameter("checkcode");
		String checkcode_session = (String) request.getSession().getAttribute(
				"checkcode_session");
		
		
		System.out.println(checkcode_session);
		// 删除session中验证码
		request.getSession().removeAttribute("checkcode_session");

		if (checkcode_session == null || !checkcode_session.equals(checkcode)) {
			// 验证码无效 -- 跳回login.jsp
			// response.sendRedirect("/Login/Session/demo/login.jsp");

			// 传递错误信息给jsp
			request.setAttribute("msg", "验证码错误");
			return "forward:/regist.jsp";
		}
		
		
		System.out.println(user);
		boolean isSuccess=service.addUser(user);
		if (isSuccess) {
			response.getWriter().write("注册成功！2秒钟跳到登录页面，请登录.......");  
            //设置2秒钟跳转  
            response.setHeader("refresh", "2;url=/Edu-ssm/login.html");
		}else {
			response.getWriter().write("输出密码不一致或已存在该用户，请重新输入！！！！");  
            //设置2秒钟跳转  
			response.setHeader("refresh", "2;url=/Edu-ssm/regist.html");

		}

		return null; 
	
	}

	@RequestMapping(value="/userLogin.do")
	public String userLogin(HttpServletRequest request,HttpServletResponse response,HttpSession session) throws ServletException, IOException{
		System.out.println("进来了");

		String name=request.getParameter("admin");
		String pwd=request.getParameter("password");
		User users = service.userLogin(name, pwd);
		System.out.println(users);
		if (users!=null) {
			System.out.println("用户登陆成功");
			
			System.out.println(users.getRole_id());
			List<Url> allurl = Urlservice.showAll();
			users.getRole_id();
			users.setUrls(Urlservice.selByRid(users.getRole_id()));
			session.setAttribute("allurl",allurl);
			
			
			System.out.println(allurl);
			
			users.setMenus(menuService.showMenu(users.getRole_id()));
			System.out.println(users);
			session.setAttribute("user", users);
			
			//request.setAttribute("user", loginUser);
			//List<Role> roles = roleservice.getAllRoles();
			//request.setAttribute("roles", roles);
			//request.getRequestDispatcher("/WEB-INF/jsp/back_manager.jsp").forward(request, response);
			int   rid=users.getRole_id();
			if (rid==1||rid==4) {
				
				return "forward:/back_manager.jsp";
			}else{



				return "forward:/index.html";

			}
		} else {
			System.out.println("用户登录失败，用户名或密码错误");
		
			return "redirect:/login.html";

		}
	
	}
	
	
	
	
	
}
