package com.hk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hk.bean.User;
import com.hk.dao.UserDao;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao dao;

	@Override
	public Boolean addStudent(User user) {
		boolean	r = dao.addStudent(user);
		return r;
	}

	public UserDao getDao() {
		return dao;
	}

	public void setDao(UserDao dao) {
		this.dao = dao;
	}

	@Override
	public User selectUser(User user) {
		
		return dao.selectUser(user);
	}

	@Override
	public void updateStudent(User user) {
		dao.updateStudent(user);
		
	}

	@Override
	public void updateTeacher(User user) {
		dao.updateTeacher(user);
		
	}

	@Override
	public User selectTeacher(User user) {
		
		return dao.selectTeacher(user);
	}

}
