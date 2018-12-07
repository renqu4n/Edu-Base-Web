package com.hk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hk.bean.News;
import com.hk.bean.Page;
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
	public List<User> selectUser(String name) {
		
		return dao.selectUser(name);
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

	@Override
	public List<User> getAllStudent(Page page) {
	
		return dao.getAllStudent(page);
	}

	@Override
	public int selectCount() {
		
		return dao.selectCount();
	}

	@Override
	public void deleteStudent(int key) {
		dao.deleteStudent(key);
		
	}

	@Override
	public List<User> getAllTeachs(Page page) {
		
		return dao.getAllTeachs(page);
	}

	@Override
	public int selectTeachCount() {
		
		return dao.selectTeachCount();
	}

	@Override
	public User selectUserByEmail(User user) {
		// TODO Auto-generated method stub
		return dao.selectUserByEmail(user);
	}

	@Override
	public Boolean updateUserPassword(User user) {
		// TODO Auto-generated method stub
		Boolean r = dao.updateUserPassword(user);
		return r;
	}

	@Override
	public void deleteUser(int key) {
		// TODO Auto-generated method stub
		dao.deleteUser(key);
	}

	@Override
	public List<User> getAllUsers(Page page) {
		// TODO Auto-generated method stub
		return dao.getAllUsers(page);
	}

	@Override
	public int selectUserCount() {
		// TODO Auto-generated method stub
		return dao.selectUserCount();
	}

}
