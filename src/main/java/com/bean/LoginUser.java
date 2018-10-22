package com.bean;

public class LoginUser {
private String id;
private String username;
private String password;
private String user_id;
private Integer ts_type;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getUser_id() {
	return user_id;
}
public void setUser_id(String user_id) {
	this.user_id = user_id;
}
public Integer getTs_type() {
	return ts_type;
}
public void setTs_type(Integer ts_type) {
	this.ts_type = ts_type;
}
public LoginUser(String id, String username, String password, String user_id, Integer ts_type) {
	super();
	this.id = id;
	this.username = username;
	this.password = password;
	this.user_id = user_id;
	this.ts_type = ts_type;
}
public LoginUser() {
	super();
}


}
