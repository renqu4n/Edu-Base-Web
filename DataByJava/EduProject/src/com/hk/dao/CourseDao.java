package com.hk.dao;

import java.util.ArrayList;
import java.util.List;

import com.hk.bean.Course;
import com.hk.bean.Page;

public interface CourseDao {
	
	public boolean insertCourse(Course course);

	public void deleteCourse(int key);
	public List<Course> getAllCourses(Page page);
	public int selectcourseCount();
	public List selectTeacherName();
}
