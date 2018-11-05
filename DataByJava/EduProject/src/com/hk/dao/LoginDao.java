package com.hk.dao;

import com.hk.bean.User;

public interface LoginDao {

	
	int addUser(User user);
	User userLogin(String name,String pwd);
}
