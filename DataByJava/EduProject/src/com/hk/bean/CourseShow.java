package com.hk.bean;

public class CourseShow {
	private int id;
	private String course_image;
	private String course_name;
	private String course_description;
	private String course_video;
	
	public CourseShow() {
		super();
	}
	
	public CourseShow(int id, String course_image, String course_name,
			String course_description, String course_video) {
		super();
		this.id = id;
		this.course_image = course_image;
		this.course_name = course_name;
		this.course_description = course_description;
		this.course_video = course_video;
	}

	public int getCourse_id() {
		return id;
	}
	public void setCourse_id(int id) {
		this.id = id;
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
	

	public String getCourse_video() {
		return course_video;
	}

	public void setCourse_video(String course_video) {
		this.course_video = course_video;
	}

	@Override
	public String toString() {
		return "CourseShow [course_id=" + id + ", course_image="
				+ course_image + ", course_name=" + course_name
				+ ", course_description=" + course_description
				+ ", course_video=" + course_video + "]";
	}


}
