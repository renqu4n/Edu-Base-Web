package com.hk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hk.bean.News;
import com.hk.bean.Page;
import com.hk.bean.Role;
import com.hk.dao.RoleDao;

@Service
public class RoleServiceImpl implements RoleService {
	@Autowired
	private RoleDao dao;
	

	@Override
	public boolean insertRole(Role role) {
		
		return dao.insertRole(role);
	}


	@Override
	public Role selectRole(Role role) {
		
		return dao.selectRole(role);
	}


	@Override
	public void deleteRole(int key) {
		dao.deleteRole(key);
		
	}


	@Override
	public List<News> getAllRoles(Page page) {
		// TODO Auto-generated method stub
		return dao.getAllRoles(page);
	}


	@Override
	public int selectRoleCount() {
		// TODO Auto-generated method stub
		return dao.selectRoleCount();
	}


	@Override
	public List<Role> getAllRoles() {
		// TODO Auto-generated method stub
		return dao.getAllRole();
	}

}
