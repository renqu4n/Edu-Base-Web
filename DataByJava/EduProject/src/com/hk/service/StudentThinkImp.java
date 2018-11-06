package com.hk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hk.bean.New;
import com.hk.bean.StudentsThink;
import com.hk.dao.StudentThinkDao;

@Service
public class StudentThinkImp  implements StudentThinkService{
      @Autowired
      private StudentThinkDao dao;
      
  	@Override
  	public List<StudentsThink> findStudent() {
  		
  		return dao.selectstudent();
  	}
      
      
      
	
}
