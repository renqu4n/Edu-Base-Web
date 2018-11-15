package com.hk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hk.bean.Course;
import com.hk.dao.CourseDao;

@Service
public class CourseServiceImpl implements CourseService {
	@Autowired
	private CourseDao dao;
	

	@Override
	public boolean insertCourse(Course course) {
		
		return dao.insertCourse(course);
	}

}
