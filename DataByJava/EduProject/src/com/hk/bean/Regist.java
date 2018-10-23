package com.hk.bean;

public class Regist {
	
	private int id;
	private String regist_name;
	private String regist_user;
	private String regist_pwd;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRegist_name() {
		return regist_name;
	}
	public void setRegist_name(String regist_name) {
		this.regist_name = regist_name;
	}
	public String getRegist_user() {
		return regist_user;
	}
	public void setRegist_user(String regist_user) {
		this.regist_user = regist_user;
	}
	public String getRegist_pwd() {
		return regist_pwd;
	}
	public void setRegist_pwd(String regist_pwd) {
		this.regist_pwd = regist_pwd;
	}
	@Override
	public String toString() {
		return "Regist [id=" + id + ", regist_name=" + regist_name
				+ ", regist_user=" + regist_user + ", regist_pwd=" + regist_pwd
				+ "]";
	}
	
	
}
