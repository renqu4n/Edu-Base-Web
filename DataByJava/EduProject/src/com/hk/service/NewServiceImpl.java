package com.hk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hk.bean.News;
import com.hk.bean.Page;
import com.hk.dao.NewDao;
@Service
public class NewServiceImpl implements NewService {
	@Autowired
	private NewDao dao;
	
	@Override
	public List<News> findNew() {
		
		return dao.selectNew();
	}
	
	
	
	

	public NewDao getDao() {
		return dao;
	}

	public void setDao(NewDao dao) {
		this.dao = dao;
	}





	@Override
	public Boolean addNew(News news) {
		boolean	r = dao.addNew(news);
		return r;
		
	}





	@Override
	public void deleteNew(int key) {
		dao.deleteNew(key);
		
	}





	@Override
	public List<News> getAllNews(Page page) {
		// TODO Auto-generated method stub
		return dao.selectNew();
	}





	@Override
	public int selectNewCount() {
		// TODO Auto-generated method stub
		return dao.selectNewCount();
	}
	
	


}
