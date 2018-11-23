package com.hk.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hk.bean.Course;
import com.hk.bean.Page;
import com.hk.bean.User;
import com.hk.dao.CourseDao;

@Service
public class CourseServiceImpl implements CourseService {
	@Autowired
	private CourseDao dao;
	

	@Override
	public boolean insertCourse(Course course) {
		
		return dao.insertCourse(course);
	}


	@Override
	public void deleteCourse(int key) {
		dao.deleteCourse(key);
		
	}


	@Override
	public List<Course> getAllCourses(Page page) {
		
		return dao.getAllCourses(page);
	}


	@Override
	public int selectcourseCount() {
		
		return dao.selectcourseCount();
	}


	@Override
	public List selectTeacherName() {
		
		return dao.selectTeacherName();
	}

}
