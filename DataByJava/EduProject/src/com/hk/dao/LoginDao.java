package com.hk.dao;

import org.apache.ibatis.annotations.Param;

import com.hk.bean.User;

public interface LoginDao {

	
	int addUser(User user);
	User userLogin(@Param("name") String name, @Param("pwd") String pwd);
}
