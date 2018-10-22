package com.dao;

import java.util.List;

import com.bean.Clazz;
import com.bean.Clazz_course;
import com.bean.Course;
import com.bean.Department;
import com.bean.Indcator;
import com.bean.Student;
import com.bean.Task;
import com.bean.Teacher;
import com.bean.Teacher_Clazz;
import com.bean.Teacher_course;
import com.bean.eva_oao;

public interface InfoDao {
 int InsertStudentrole(List<Student> st);//批量添加学生角色关系
 int InsertTeacherrole(List<Teacher> te);//批量添加教师角色关系
 int InsertCourse(List<Course> cl);//批量添加课程
 int InsertClazz(List<Clazz> claz);//批量添加班级
 int Insertclazz_course(List<Clazz_course> clazz_course);//批量插入班级课程
 int insertdp(Department dp);//插入单个部门
 int Insertdepart(List<Department> dp);//批量插入部门
 int insertclazz(Clazz clazz);//插入班级
 int insertcourse(Course course);//插入课程
 int insertclacou(Clazz_course cc);//插入班级课程
 int insertteacou(Teacher_course tc);//插入教师课程表
 int inserttea_cou(List<Teacher_course> list);//批量插入教师课程表
 int InsertStudent(List<Student> st);//批量添加学生
 int InsertTeacher(List<Teacher> te);//批量添加教师
 int insertteacla(Teacher_Clazz tl);//插入教师班级表
 int insertindicator(Indcator Ind);//插入指标
 int insertmanagement(List<Task> ta);
 int inserscsore(eva_oao ev);//插入成绩
}
