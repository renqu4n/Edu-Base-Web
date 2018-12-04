package com.hk.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hk.bean.Menu;
import com.hk.dao.MenuDao;
@Service
public class MenuServiceImpl implements MenuService{
	@Autowired
	private MenuDao dao;
	
	@Override
	public List<Menu> showMenu(int rid) {
		return dao.selByRid(rid, 0);
	}

}
