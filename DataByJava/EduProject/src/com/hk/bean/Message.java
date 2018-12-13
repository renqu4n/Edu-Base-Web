package com.hk.bean;

public class Message {
	
	private int id;
	private String message_content;
	private int role_id;
	private int student_id;
	private int check;
	public int getCheck() {
		return check;
	}
	public void setCheck(int check) {
		this.check = check;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMessage_content() {
		return message_content;
	}
	public void setMessage_content(String message_content) {
		this.message_content = message_content;
	}
	public int getRole_id() {
		return role_id;
	}
	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	@Override
	public String toString() {
		return "Message [id=" + id + ", message_content=" + message_content
				+ ", role_id=" + role_id + ", student_id=" + student_id
				+ ", check=" + check + "]";
	}
	
	

}
