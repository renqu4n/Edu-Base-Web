package com.hk.bean;

public class TeacherShow {
	
	private int teacher_id;
	private String cName;
	private String eName;
	private String teacher_img;
	private String teacher_info;
	
	
	public TeacherShow() {
		super();
	}
	public int getTeacher_id() {
		return teacher_id;
	}
	public void setTeacher_id(int teacher_id) {
		this.teacher_id = teacher_id;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String getTeacher_img() {
		return teacher_img;
	}
	public void setTeacher_img(String teacher_img) {
		this.teacher_img = teacher_img;
	}
	public String getTeacher_info() {
		return teacher_info;
	}
	public void setTeacher_info(String teacher_info) {
		this.teacher_info = teacher_info;
	}
	@Override
	public String toString() {
		return "TeacherShow [teacher_id=" + teacher_id + ", cName=" + cName
				+ ", eName=" + eName + ", teacher_img=" + teacher_img
				+ ", teacher_info=" + teacher_info + "]";
	}
	

}