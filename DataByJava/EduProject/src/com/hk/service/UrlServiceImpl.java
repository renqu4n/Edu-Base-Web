package com.hk.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hk.bean.Url;
import com.hk.dao.UrlDao;

@Service
public class UrlServiceImpl implements UrlService {
	@Resource
	private UrlDao Dao;
	@Override
	public List<Url> selByRid(int rid) {
		return Dao.selByRid(rid);
	}
	@Override
	public List<Url> showAll() {
		return Dao.showAll();
	}

}
