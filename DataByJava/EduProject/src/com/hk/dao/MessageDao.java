package com.hk.dao;

import java.util.List;

import com.hk.bean.News;
import com.hk.bean.Page;
import com.hk.bean.Role;

public interface MessageDao {
	
	public void deleteMessage(int key);
	public List<News> getAllMessages(Page page);
	public int selectMessageCount();
}
