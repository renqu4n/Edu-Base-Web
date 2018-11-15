package com.hk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hk.bean.User;
import com.hk.dao.LoginDao;
@Service
public class LoginServiceImpl implements LoginService{
	@Autowired
	private LoginDao dao;
	


	@Override
	public boolean addUser(User user) {
		
	int	r =  dao.addUser(user);
		return r>0;
	}

	@Override
	public User userLogin(String name, String pwd) {
		User user = dao.userLogin(name, pwd);
		return user;
	}



	
	
}
