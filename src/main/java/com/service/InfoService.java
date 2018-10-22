package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
import com.dao.InfoDao;

@Service
public class InfoService {

	@Autowired
	private InfoDao infodao;
	//添加学生
	public int InsertStudent(List<Student> st){
		return infodao.InsertStudent(st);
	}
	//添加老师
	public int InsertTeacher(List<Teacher> te){
		return infodao.InsertTeacher(te);
	}
	//添加学生角色关系
	public int InsertStudentrole(List<Student> st){
		return infodao.InsertStudentrole(st);
	}
	//添加老师角色关系
	public  int InsertTeacherrole(List<Teacher> te){
		return infodao.InsertTeacherrole(te);
	}
	//批量添加课程
	public int InsertCourse(List<Course> cl){
		return infodao.InsertCourse(cl);
	}
	//批量添加班级
	public int InsertClazz(List<Clazz> claz){
		return infodao.InsertClazz(claz);
	}
	
	public int Insertclazz_course(List<Clazz_course> clazz_course){
		return infodao.Insertclazz_course(clazz_course);
	}
	
	//插入单个部门
	public int insertdp(Department dp){
		return infodao.insertdp(dp);	
	}
	//批量插入部门
	public int Insertdepart(List<Department> dp){
		return infodao.Insertdepart(dp);
	}
	//插入班级
	public  int insertclazz(Clazz clazz){
		return infodao.insertclazz(clazz);
	}
	//插入课程
	public int insertcourse(Course course){
		return infodao.insertcourse(course);
	}
	//插入班级课程
	public int insertclacou(Clazz_course cc){
		return infodao.insertclacou(cc);
	}
	//插入教师课程表
	public int insertteacou(Teacher_course tc){
		return infodao.insertteacou(tc);
	}
	//批量插入教师课程表
	public int inserttea_cou(List<Teacher_course> list){
		return infodao.inserttea_cou(list);
	}
	//插入教师班级表
	public int insertteacla(Teacher_Clazz tl){
		return infodao.insertteacla(tl);
	}
	//插入指标
	public int insertindicator(Indcator Ind){
		return infodao.insertindicator(Ind);
	}
	public int insertmanagement(List<Task> ta){
		return infodao.insertmanagement(ta);
	}
	//插入成绩
	public int inserscsore(eva_oao ev){
		return infodao.inserscsore(ev);
	}
}
