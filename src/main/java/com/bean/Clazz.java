package com.bean;

public class Clazz {
private int clazz_id;
private String clazz_name;
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
public Clazz(int clazz_id, String clazz_name) {
	super();
	this.clazz_id = clazz_id;
	this.clazz_name = clazz_name;
}
public Clazz() {
	super();
	// TODO Auto-generated constructor stub
}


}
