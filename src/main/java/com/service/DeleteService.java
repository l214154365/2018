package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.DeleteDao;

@Service
public class DeleteService {
@Autowired
private DeleteDao deletdao;

//删除部门
public int deletdp(int Id){
	return deletdao.deletdp(Id);
}

//删除子部门
public int deletdpson(int Id){
	return deletdao.deletdpson(Id);
}
//删除班级
public int deletd_clazz(int clazz_id){
	return deletdao.deletd_clazz(clazz_id);
}
//删除课程
public int deletd_course(int course_id){
	return deletdao.deletd_course(course_id);
}
//删除教师
public  int deletd_teacher(String t_id){
	return deletdao.deletd_teacher(t_id);
}
//删除教师课程
public  int deletd_teacher_course(String t_id){
	return deletdao.deletd_teacher_course(t_id);
}
//删除教师角色权限
public  int deletd_teacher_role(String t_id){
	return deletdao.deletd_teacher_role(t_id);
}
//删除学生
public  int deletd_student(String t_id){
	return deletdao.deletd_student(t_id);
}
//删除任务
public int deletetask(String id){
	return deletdao.deletetask(id);
}
}
