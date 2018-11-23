package com.hk.dao;

import java.util.List;

import com.hk.bean.Page;
import com.hk.bean.User;

public interface UserDao {
	public  Boolean addStudent(User user);
	public  User selectTeacher(User user);
	public  User selectUser(User user);
	public  void updateStudent(User user);
	public  void updateTeacher(User user);
	public List<User> getAllStudent(Page page);
	public int selectCount();
	public void deleteStudent(int key);
	public List<User> getAllTeachs(Page page);
	public int selectTeachCount();
}
