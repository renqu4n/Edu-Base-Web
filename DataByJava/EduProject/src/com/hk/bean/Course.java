package com.hk.bean;

public class Course {
	private int id;
	private String course_name;
	private String course_introduce;
	private int teacher_id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCourse_name() {
		return course_name;
	}
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	public String getCourse_introduce() {
		return course_introduce;
	}
	public void setCourse_introduce(String course_introduce) {
		this.course_introduce = course_introduce;
	}
	public int getTeacher_id() {
		return teacher_id;
	}
	public void setTeacher_id(int teacher_id) {
		this.teacher_id = teacher_id;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", course_name=" + course_name
				+ ", course_introduce=" + course_introduce + ", teacher_id="
				+ teacher_id + "]";
	}
	
	

}
