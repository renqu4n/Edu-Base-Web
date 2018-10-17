package com.hk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hk.bean.New;
import com.hk.dao.NewDao;
@Service
public class NewServiceImpl implements NewService {
	@Autowired
	private NewDao dao;
	
	@Override
	public List<New> findNew() {
		
		return dao.selectNew();
	}
	
	
	
	

	public NewDao getDao() {
		return dao;
	}

	public void setDao(NewDao dao) {
		this.dao = dao;
	}
	
	


}
