package com.bean;

public class KeBiao {
private int course_id;
private String course_name;
private int clazz_id;
private String clazz_name;
private int teacher_id;
private String t_name;
public int getCourse_id() {
	return course_id;
}
public void setCourse_id(int course_id) {
	this.course_id = course_id;
}
public String getCourse_name() {
	return course_name;
}
public void setCourse_name(String course_name) {
	this.course_name = course_name;
}
public int getClazz_id() {
	return clazz_id;
}
public void setClazz_id(int clazz_id) {
	this.clazz_id = clazz_id;
}
public String getClazz_name() {
	return clazz_name;
}
public void setClazz_name(String clazz_name) {
	this.clazz_name = clazz_name;
}
public int getTeacher_id() {
	return teacher_id;
}
public void setTeacher_id(int teacher_id) {
	this.teacher_id = teacher_id;
}
public String getT_name() {
	return t_name;
}
public void setT_name(String t_name) {
	this.t_name = t_name;
}
public KeBiao(int course_id, String course_name, int clazz_id, String clazz_name, int teacher_id, String t_name) {
	super();
	this.course_id = course_id;
	this.course_name = course_name;
	this.clazz_id = clazz_id;
	this.clazz_name = clazz_name;
	this.teacher_id = teacher_id;
	this.t_name = t_name;
}
public KeBiao() {
	super();
	// TODO Auto-generated constructor stub
}


}
