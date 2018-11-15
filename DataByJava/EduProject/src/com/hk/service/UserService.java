package com.hk.service;

import com.hk.bean.User;


public interface UserService {

	public  Boolean addStudent(User user);
	public  User selectUser(User user);
	public  User selectTeacher(User user);
	public  void updateStudent(User user);
	public  void updateTeacher(User user);
}
