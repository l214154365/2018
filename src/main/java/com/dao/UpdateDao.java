package com.dao;

import com.bean.LoginUser;
import com.bean.Student;
import com.bean.Task;
import com.bean.Teacher;

public interface UpdateDao {
	
int resetteacherpd(String t_id);//管理员重置教师密码
int resetstudent(String s_id);//管理员重置学生密码
int updatetea(Teacher t);//更新教师信息
int updatestu(Student s);//更新学生信息
int updateuserinfo(LoginUser u);
int updateuserinfo1(LoginUser u);
int updatetaskstatus(Task ta);
int updatetask(Task ta);
int closestatus(Task ta);
}
