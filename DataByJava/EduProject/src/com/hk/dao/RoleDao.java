package com.hk.dao;

import com.hk.bean.Role;

public interface RoleDao {
	
	public boolean insertRole(Role role);
	public Role selectRole(Role role);
}
