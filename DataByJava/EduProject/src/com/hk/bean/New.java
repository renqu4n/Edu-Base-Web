package com.hk.bean;

public class New {
	private int id;
	private String new_title;
	private String new_content;
	private String new_issuer;
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
	public String getNew_issuer() {
		return new_issuer;
	}
	public void setNew_issuer(String new_issuer) {
		this.new_issuer = new_issuer;
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
				+ new_content + ", new_issuer=" + new_issuer
				+ ", release_time=" + release_time + "]";
	}
	
	


}
