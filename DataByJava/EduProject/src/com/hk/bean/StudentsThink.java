package com.hk.bean;


public class StudentsThink {
  private int mid;
  private String user_name;
  private String message_content;
public int getMid() {
	return mid;
}
public void setMid(int mid) {
	this.mid = mid;
}
public String getUser_name() {
	return user_name;
}
public void setUser_name(String user_name) {
	this.user_name = user_name;
}
public String getMessage_content() {
	return message_content;
}
public void setMessage_content(String message_content) {
	this.message_content = message_content;
}
@Override
public String toString() {
	return "StudentsThink [mid=" + mid + ", user_name=" + user_name
			+ ", message_content=" + message_content + "]";
}

	
	
	
}
