package com.hk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hk.bean.TeacherShow;
import com.hk.dao.TeacherShowDao;

//创建service对象
@Service(value="TeacherShowService")
public class TeacherShowServiceImp implements TeacherShowService {
	
	//不用创建对象，自动注入，按类型注入
	@Autowired
	private TeacherShowDao teaShowDao;

	
	
	
	
	@Override
	public List<TeacherShow> findTeacherShow() {
		
		return teaShowDao.selectTeacherShow();
	}
	

}
