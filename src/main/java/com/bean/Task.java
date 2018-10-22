package com.bean;

import java.util.Date;

public class Task {
	private int id;
	private int status;
	private String s_time;
	private String e_time;
	private String m_name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getStarttime() {
		return s_time;
	}
	public void setStarttime(String starttime) {
		this.s_time = starttime;
	}
	public String getEndtime() {
		return e_time;
	}
	public void setEndtime(String endtime) {
		this.e_time = endtime;
	}
	public String getM_name() {
		return m_name;
	}
	public void setM_name(String m_name) {
		this.m_name = m_name;
	}
	
}
