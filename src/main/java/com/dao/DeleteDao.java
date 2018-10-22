package com.dao;

public interface DeleteDao {
   int deletdp(int Id);//删除部门
   int deletdpson(int Id);//删除子部门
   int deletd_clazz(int clazz_id);//删除班级
   int deletd_course(int course_id);//删除课程
   int deletd_teacher(String t_id);//删除教师
   int deletd_teacher_course(String t_id);//删除教师课程
   int deletd_teacher_role(String t_id);//删除教师角色权限
   int deletd_student(String t_id);//删除学生
   int deletetask(String id);
}
