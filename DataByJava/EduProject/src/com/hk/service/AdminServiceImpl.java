package com.hk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hk.bean.Admin;
import com.hk.dao.AdminDao;
@Service
public class AdminServiceImpl implements AdminService{
	@Autowired
	private AdminDao dao;
	
	@Override
	public List<Admin> findAdmin() {
		// TODO Auto-generated method stub
		return dao.selectAdmin();
	}

	@Override
	public Admin checkAdmin(String admin_user, String admin_pwd) {
		Admin admin = dao.checkAdmin(admin_user, admin_pwd);
		
	      return admin;
		
		
		
	}



	
	
}
