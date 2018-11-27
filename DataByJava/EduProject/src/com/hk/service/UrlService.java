package com.hk.service;

import java.util.List;

import com.hk.bean.Url;

public interface UrlService {
	List<Url> selByRid(int rid);
	
	List<Url> showAll();
}
