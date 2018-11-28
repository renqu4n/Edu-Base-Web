package com.hk.bean;

import java.util.List;

public class User {
	private int id;
	private String user_name;
	private String user_password;
	private String user_email;
	private String user_think;
	private int role_id;
	private List<Url> urls;
	
	
	
	
	
	public List<Url> getUrls() {
		return urls;
	}
	public void setUrls(List<Url> urls) {
		this.urls = urls;
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_password() {
		return user_password;
	}
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public String getUser_think() {
		return user_think;
	}
	public void setUser_think(String user_think) {
		this.user_think = user_think;
	}
	public int getRole_id() {
		return role_id;
	}
	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", user_name=" + user_name
				+ ", user_password=" + user_password + ", user_email="
				+ user_email + ", user_think=" + user_think + ", role_id="
				+ role_id + "]";
	}

	
	
	
	
}
