package com.hk.dao;

import java.util.List;

import com.hk.bean.News;
import com.hk.bean.Page;

public interface NewDao {
	
	List<News> selectNew();
	public  boolean addNew(News news);
	
	public void deleteNew(int key);
	public List<News> getAllNews(Page page);
	public int selectNewCount();
}
