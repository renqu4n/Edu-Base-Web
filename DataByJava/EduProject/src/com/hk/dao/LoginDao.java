package com.hk.dao;

import java.util.List;

import com.hk.bean.Admin;
import com.hk.bean.Regist;

public interface LoginDao {
	List<Admin> selectAdmin();
	Admin  checkAdmin(String admin_user,String admin_pwd);
	int addUser(Regist regist);
	Regist userLogin(String user,String pwd);
}
