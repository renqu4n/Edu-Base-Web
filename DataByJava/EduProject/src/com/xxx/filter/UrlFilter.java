package com.xxx.filter;

import java.io.IOException;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hk.bean.Url;
import com.hk.bean.User;
@WebFilter("/*")
public class UrlFilter implements Filter {

	@Override
	public void init(FilterConfig filterconfig) throws ServletException {
		
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain filterchain)
			throws IOException, ServletException {
//		System.out.println("我是拦截器！！");
		
		//js css放行  图片  
		HttpServletRequest request=(HttpServletRequest)req;
		String uri = request.getRequestURI();
		if(uri.endsWith(".js")||uri.endsWith(".css")||uri.endsWith(".html")||uri.endsWith(".jpg")||uri.endsWith(".png")||uri.endsWith(".gif")||uri.endsWith(".map")||uri.endsWith(".java")||uri.endsWith("CheckcodeServlet")||uri.endsWith(".woff")||uri.endsWith(".ttf")){
			filterchain.doFilter(req, res);
			
		}else{
			//if(uri.equals("/Edu-ssm/regist")||uri.equals("/Edu-ssm/regist.jsp")||uri.equals("/Edu-ssm/index.jsp")||uri.equals("/Edu-ssm/index")&&!uri.equals("/Edu-ssm/studentShow.do")&&!uri.equals("/Edu-ssm/teachShow.do")&&!uri.equals("/Edu-ssm/courseShow.do")&&!uri.equals("/Edu-ssm/newShow.do")&&!uri.equals("/Edu-ssm/roleShow.do")&&!uri.equals("/Edu-ssm/messageShow.do")){
			if(uri.endsWith(".do")&&!uri.equals("/Edu-ssm/updateUserPermission.do")&&!uri.equals("/Edu-ssm/singleUserPerManager.do")&&!uri.equals("/Edu-ssm/permissionManager.do")&&!uri.equals("/Edu-ssm/userShow.do")&&!uri.equals("/Edu-ssm/studentShow.do")&&!uri.equals("/Edu-ssm/teachShow.do")&&!uri.equals("/Edu-ssm/courseShow.do")&&!uri.equals("/Edu-ssm/newShow.do")&&!uri.equals("/Edu-ssm/roleShow.do")&&!uri.equals("/Edu-ssm/messageShow.do")){
				
			filterchain.doFilter(req, res);
			}else{
				if (uri.equals("/Edu-ssm/findUser")||uri.equals("/Edu-ssm/findUser.jsp")||uri.equals("/Edu-ssm/regist")||uri.equals("/Edu-ssm/regist.jsp")||uri.equals("/Edu-ssm/index.jsp")||uri.equals("/Edu-ssm/index")) {
					filterchain.doFilter(req, res);
				} else {

				
				HttpSession session = request.getSession();
				//登录验证
				Object obj = session.getAttribute("user");
				if(obj!=null){
					List<Url> listUrl = (List<Url>) session.getAttribute("allurl");
					boolean isExists=false;
					for (Url url : listUrl) {
						
						if(url.getName().equals(uri)){
							isExists = true;
						
						}
					}
				
					
					//如果该url需要进行权限控制
					if(isExists){
						User users = (User) obj;
						boolean isRight = false;
						for (Url url : users.getUrls()) {
							if(url.getName().equals(uri)){
								isRight = true;
							}
						}
						//登录用户对该uri具有访问权限
						if(isRight){
							filterchain.doFilter(req, res);
						}else{
							//清除sessin中内容
							session.removeAttribute("user");
							session.removeAttribute("allurl");
							//((HttpServletResponse)res).sendRedirect("/rbac/login.jsp");
							((HttpServletResponse)res).getWriter().write("没有权限！2秒钟跳到页面，请稍等.......");  
		                    //设置2秒钟跳转  
							((HttpServletResponse)res).setHeader("refresh", "2;url=/Edu-ssm/login.html");
						}
					}else{
						filterchain.doFilter(req, res);
					}
					
				}else{
					//没有登录
					//((HttpServletResponse)res).sendRedirect("/Edu-ssm/login.html");
					((HttpServletResponse)res).getWriter().write("没有登录！2秒钟跳到登录页面，请稍等.......");  
                    //设置2秒钟跳转  
					((HttpServletResponse)res).setHeader("refresh", "2;url=/Edu-ssm/login.html");
					
					}
				
				}
			}
		}
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}
