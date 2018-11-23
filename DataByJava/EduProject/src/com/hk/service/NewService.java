package com.hk.service;

import java.util.List;

import com.hk.bean.Course;
import com.hk.bean.News;
import com.hk.bean.Page;

public interface NewService {
	
	List<News> findNew();
	public  Boolean addNew(News news); 
	
	public void deleteNew(int key);
	public List<News> getAllNews(Page page);
	public int selectNewCount();

}
