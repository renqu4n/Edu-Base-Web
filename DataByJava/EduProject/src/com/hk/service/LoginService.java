package com.hk.service;

import java.util.List;

import com.hk.bean.Admin;
import com.hk.bean.Regist;

public interface LoginService {
	List<Admin> findAdmin();
	
	Admin  checkAdmin(String admin_user,String admin_pwd);
	
	boolean addUser(Regist regist);
	
	Regist  userLogin(String user,String pwd);
	
}
