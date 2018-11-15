package com.hk.dao;

import com.hk.bean.User;

public interface UserDao {
	public  Boolean addStudent(User user);
	public  User selectTeacher(User user);
	public  User selectUser(User user);
	public  void updateStudent(User user);
	public  void updateTeacher(User user);
}
