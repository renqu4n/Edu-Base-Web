package com.hk.bean;

public class CourseShow {
	private int course_id;
	private String course_image;
	private String course_name;
	private String course_description;
	
	public CourseShow() {
		super();
	}
	
	public CourseShow(int course_id, String course_image, String course_name,
			String course_description) {
		super();
		this.course_id = course_id;
		this.course_image = course_image;
		this.course_name = course_name;
		this.course_description = course_description;
	}

	public int getCourse_id() {
		return course_id;
	}
	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}
	public String getCourse_image() {
		return course_image;
	}
	public void setCourse_image(String course_image) {
		this.course_image = course_image;
	}
	public String getCourse_name() {
		return course_name;
	}
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	public String getCourse_description() {
		return course_description;
	}
	public void setCourse_description(String course_description) {
		this.course_description = course_description;
	}

	@Override
	public String toString() {
		return "CourseShow [course_id=" + course_id + ", course_image="
				+ course_image + ", course_name=" + course_name
				+ ", course_description=" + course_description + "]";
	}
	
	
	

}
