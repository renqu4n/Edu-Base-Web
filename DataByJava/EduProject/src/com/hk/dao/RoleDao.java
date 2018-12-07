package com.hk.dao;

import java.util.List;

import com.hk.bean.News;
import com.hk.bean.Page;
import com.hk.bean.Role;

public interface RoleDao {
	
	public boolean insertRole(Role role);
	public Role selectRole(Role role);
	public void deleteRole(int key);
	public List<News> getAllRoles(Page page);
	public int selectRoleCount();
	
	public List<Role> getAllRole();
}
