package com.hk.service;

import com.hk.bean.User;

public interface LoginService {
	
	

	
	boolean addUser(User user);
	User  userLogin(String name,String pwd);
	
}
