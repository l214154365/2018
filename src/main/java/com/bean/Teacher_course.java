package com.bean;

public class Teacher_course {
private String teacher_id;
private int course_id;
public String getTeacher_id() {
	return teacher_id;
}
public void setTeacher_id(String teacher_id) {
	this.teacher_id = teacher_id;
}
public int getCourse_id() {
	return course_id;
}
public void setCourse_id(int course_id) {
	this.course_id = course_id;
}
public Teacher_course(String teacher_id, int course_id) {
	super();
	this.teacher_id = teacher_id;
	this.course_id = course_id;
}
public Teacher_course() {
	super();
	// TODO Auto-generated constructor stub
}

}
