package com.bean;

public class Teacher {
private String t_id;
private String t_Name;
private String t_Pass;
private Integer d_id;
private Integer t_type;
public String getT_id() {
	return t_id;
}
public void setT_id(String t_id) {
	this.t_id = t_id;
}
public String getT_Name() {
	return t_Name;
}
public void setT_Name(String t_Name) {
	this.t_Name = t_Name;
}
public String getT_Pass() {
	return t_Pass;
}
public void setT_Pass(String t_Pass) {
	this.t_Pass = t_Pass;
}
public Integer getD_id() {
	return d_id;
}
public void setD_id(Integer d_id) {
	this.d_id = d_id;
}
public Integer getT_type() {
	return t_type;
}
public void setT_type(Integer t_type) {
	this.t_type = t_type;
}
public Teacher(String t_id, String t_Name, String t_Pass, Integer d_id, Integer t_type) {
	super();
	this.t_id = t_id;
	this.t_Name = t_Name;
	this.t_Pass = t_Pass;
	this.d_id = d_id;
	this.t_type = t_type;
}
public Teacher() {
	super();
	// TODO Auto-generated constructor stub
}


}
