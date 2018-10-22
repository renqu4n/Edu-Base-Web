package com.hk.dao;

import java.util.List;

import com.hk.bean.Admin;

public interface AdminDao {
	List<Admin> selectAdmin();
	Admin  checkAdmin(String admin_user,String admin_pwd);
}
