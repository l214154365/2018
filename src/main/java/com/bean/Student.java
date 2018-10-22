package com.bean;

public class Student {
	private String s_id;
	private String s_name;
	private String s_pass;
	private Integer clazz_id;
	private Integer s_type;
	public String getS_id() {
		return s_id;
	}
	public void setS_id(String s_id) {
		this.s_id = s_id;
	}
	public String getS_name() {
		return s_name;
	}
	public void setS_name(String s_name) {
		this.s_name = s_name;
	}
	public String getS_pass() {
		return s_pass;
	}
	public void setS_pass(String s_pass) {
		this.s_pass = s_pass;
	}
	public Integer getClazz_id() {
		return clazz_id;
	}
	public void setClazz_id(Integer clazz_id) {
		this.clazz_id = clazz_id;
	}
	public Integer getS_type() {
		return s_type;
	}
	public void setS_type(Integer s_type) {
		this.s_type = s_type;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String s_id, String s_name, String s_pass, Integer clazz_id, Integer s_type) {
		super();
		this.s_id = s_id;
		this.s_name = s_name;
		this.s_pass = s_pass;
		this.clazz_id = clazz_id;
		this.s_type = s_type;
	}
	
}
