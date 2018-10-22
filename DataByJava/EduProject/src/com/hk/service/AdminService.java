package com.hk.service;

import java.util.List;

import com.hk.bean.Admin;

public interface AdminService {
	List<Admin> findAdmin();
	
	Admin  checkAdmin(String admin_user,String admin_pwd);
}
