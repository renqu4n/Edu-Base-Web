package com.hk.dao;

import java.util.List;

import com.hk.bean.News;

public interface NewDao {
	
	List<News> selectNew();
	public  boolean addNew(News news);
	
}
