package com.bean;

public class Clazz_course {
	private Integer clazz_id;
	private Integer course_id;
	public Integer getClazz_id() {
		return clazz_id;
	}
	public void setClazz_id(Integer clazz_id) {
		this.clazz_id = clazz_id;
	}
	public Integer getCourse_id() {
		return course_id;
	}
	public void setCourse_id(Integer course_id) {
		this.course_id = course_id;
	}
	public Clazz_course(Integer clazz_id, Integer course_id) {
		super();
		this.clazz_id = clazz_id;
		this.course_id = course_id;
	}
	public Clazz_course() {
		super();
	}
	

}
