package com.hk.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hk.bean.Role;
import com.hk.service.RoleService;

@Controller
public class RoleController {
	@Autowired
	private RoleService service;
	
	
	@RequestMapping(value="/addRole.do")
	public String addStudent(HttpServletRequest request,HttpServletResponse response,Role role) {
		Role isRole = service.selectRole(role);
		if (isRole!=null) {
			request.setAttribute("message", "该角色已经存在-------！！！");
		} else {
			boolean isSuccess = service.insertRole(role);
			if (isSuccess) {
				request.setAttribute("message", "添加成功-------");
				
			} else {
				request.setAttribute("message", "添加失败-------！！！");

			}

		}

		return "addRole";
	}
}
