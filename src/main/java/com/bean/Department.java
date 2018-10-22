package com.bean;

public class Department {
private Integer Id;
private String department_name;
private Integer department_id;
private Integer department_num;
public Integer getId() {
	return Id;
}
public void setId(Integer id) {
	Id = id;
}
public String getDepartment_name() {
	return department_name;
}
public void setDepartment_name(String department_name) {
	this.department_name = department_name;
}
public Integer getDepartment_id() {
	return department_id;
}
public void setDepartment_id(Integer department_id) {
	this.department_id = department_id;
}
public Integer getDepartment_num() {
	return department_num;
}
public void setDepartment_num(Integer department_num) {
	this.department_num = department_num;
}
public Department(Integer id, String department_name, Integer department_id, Integer department_num) {
	super();
	Id = id;
	this.department_name = department_name;
	this.department_id = department_id;
	this.department_num = department_num;
}
public Department() {
	super();
	// TODO Auto-generated constructor stub
}

}
