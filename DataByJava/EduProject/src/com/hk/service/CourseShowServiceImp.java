package com.hk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hk.bean.CourseShow;
import com.hk.dao.CourseShowDao;

@Service(value="CourseShowService")
public class CourseShowServiceImp implements CourseShowService {

	@Autowired
	private CourseShowDao coshowdao;
	
	
	
	
	@Override
	public List<CourseShow> findCourseShow() {
		return coshowdao.selectCourse();
	}
	

}
