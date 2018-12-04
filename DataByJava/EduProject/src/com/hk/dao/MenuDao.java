package com.hk.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hk.bean.Menu;

public interface MenuDao {
	List<Menu> selByRid(@Param("rid") int rid ,@Param("pid")int pid);
}
