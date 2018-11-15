package com.hk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

}
