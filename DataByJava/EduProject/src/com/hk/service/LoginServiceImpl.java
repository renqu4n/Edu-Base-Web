package com.hk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hk.bean.Admin;
import com.hk.bean.Regist;
import com.hk.dao.LoginDao;
@Service
public class LoginServiceImpl implements LoginService{
	@Autowired
	private LoginDao dao;
	
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

	@Override
	public boolean addUser(Regist regist) {
		
	int	r =  dao.addUser(regist);
		return r>0;
	}

	@Override
	public Regist userLogin(String user, String pwd) {
		Regist regist = dao.userLogin(user, pwd);
		return regist;
	}



	
	
}
