package com.hk.dao;

import java.util.List;

import com.hk.bean.Url;

public interface UrlDao {
	List<Url> selByRid(int rid);
	
	List<Url> showAll();
}
