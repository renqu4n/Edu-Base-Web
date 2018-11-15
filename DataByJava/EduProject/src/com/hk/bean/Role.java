package com.hk.bean;

public class Role {

	private int id;
	private String name;
	private String role_descreption;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole_descreption() {
		return role_descreption;
	}
	public void setRole_descreption(String role_descreption) {
		this.role_descreption = role_descreption;
	}
	@Override
	public String toString() {
		return "Role [id=" + id + ", name=" + name + ", role_descreption="
				+ role_descreption + "]";
	}
	
	
	
	
	
}
