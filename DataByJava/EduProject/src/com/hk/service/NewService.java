package com.hk.service;

import java.util.List;

import com.hk.bean.News;

public interface NewService {
	
	List<News> findNew();
	public  Boolean addNew(News news);  

}
