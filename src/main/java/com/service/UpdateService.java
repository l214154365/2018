package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.LoginUser;
import com.bean.Student;
import com.bean.Task;
import com.bean.Teacher;
import com.dao.UpdateDao;

@Service
public class UpdateService {

	@Autowired
	private UpdateDao updatedao;
	
	public int resetteacherpd(String t_id){
		return updatedao.resetteacherpd(t_id);
	}
	
	public int resetstudent(String s_id){
		return updatedao.resetstudent(s_id);
	}
	
	public int updatetea(Teacher t){
		return updatedao.updatetea(t);
	}
	
	public int updatestu(Student s){
		return updatedao.updatestu(s);
	}
	public int updateuserinfo(LoginUser u){
		return updatedao.updateuserinfo(u);
	}
	
	public int updateuserinfo1(LoginUser u){
		return updatedao.updateuserinfo1(u);
	}
	public int updatetaskstatus(Task ta) {
		return updatedao.updatetaskstatus(ta);
	}
	public int updatetask(Task ta) {
		return updatedao.updatetask(ta);
	}
	public int closestatus(Task ta) {
		return updatedao.closestatus(ta);
	}
}
