package com.hk.bean;

public class TeacherShow {
	
	private int teacher_id;
	private String cName;
	private String eName;
	private String teacher_image;
	private String teacher_info;
	
	
	public TeacherShow() {
		super();
	}
	public TeacherShow(int teacher_id, String cName, String eName,
			String teacher_image, String teacher_info) {
		super();
		this.teacher_id = teacher_id;
		this.cName = cName;
		this.eName = eName;
		this.teacher_image = teacher_image;
		this.teacher_info = teacher_info;
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
	public String getTeacher_image() {
		return teacher_image;
	}
	public void setTeacher_image(String teacher_image) {
		this.teacher_image = teacher_image;
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
				+ ", eName=" + eName + ", teacher_image=" + teacher_image
				+ ", teacher_info=" + teacher_info + "]";
	}
}
