package com.hk.bean;

public class News {
	private int id;
	private String new_title;
	private String new_content;
	private String new_author;
	private String release_time;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNew_title() {
		return new_title;
	}
	public void setNew_title(String new_title) {
		this.new_title = new_title;
	}
	public String getNew_content() {
		return new_content;
	}
	public void setNew_content(String new_content) {
		this.new_content = new_content;
	}
	public String getNew_author() {
		return new_author;
	}
	public void setNew_author(String new_author) {
		this.new_author = new_author;
	}
	public String getRelease_time() {
		return release_time;
	}
	public void setRelease_time(String release_time) {
		this.release_time = release_time;
	}
	@Override
	public String toString() {
		return "New [id=" + id + ", new_title=" + new_title + ", new_content="
				+ new_content + ", new_author=" + new_author
				+ ", release_time=" + release_time + "]";
	}
	
	


}
