package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
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
import com.service.InfoService;

@Controller
public class AddinfoController {
	@Autowired
	private InfoService infoservice; 
		/*
		 * 部门页面
		 */
		@RequestMapping("/department")
		public String department(){
			
			return "department";
		}
	
	/*
	 * 批量添加学生信息
	 */
	@RequestMapping(value="/addinfo_submit",produces="text/html;charset=UTF-8")
	@ResponseBody
	public String addinfo_submit(String info){
		
		
			List<Student> list=JSON.parseArray(info,Student.class);
			int index=infoservice.InsertStudent(list);
			int index1=infoservice.InsertStudentrole(list);
			if(index>0&&index1>0){
				return "0";
			}else{
				return "1";
			}
		
	}
	
	
	/*
	 * 批量添加教师信息
	 */
	@RequestMapping(value="/addinfo_submit1",produces="text/html;charset=UTF-8")
	@ResponseBody
	public String addinfo_submit1(String info){
		
		List<Teacher> list1=JSON.parseArray(info,Teacher.class);
		int index=infoservice.InsertTeacher(list1);
		int index1=infoservice.InsertTeacherrole(list1);
		if(index>0&&index1>0){
			return "0";
		}else{
			return "1";
		}
	}
	
	/*
	 * 插入班级课程关系表
	 */
	@RequestMapping(value="/clazz_course",produces="text/html;charset=UTF-8")
	@ResponseBody
	public String clazz_course(String info){
		List<Clazz_course> list=JSON.parseArray(info,Clazz_course.class);
		infoservice.Insertclazz_course(list);
		return "0";
	}
	
	
	/*
	 * 插入新部门
	 */
	@RequestMapping(value="/insert_depar",produces="text/html;charset=UTF-8")
	@ResponseBody
	public String insert_depar(Department dp){
		  
		int i=infoservice.insertdp(dp);
		if(i>0){
			return "0";
		}else{
			return "1";
		}
	
	}
	
	/*
	 * 批量插入新部门
	 */
	@RequestMapping(value="/insert_department",produces="text/html;charset=UTF-8")
	@ResponseBody
	public String insert_department(String info){
		List<Department> list=JSON.parseArray(info,Department.class);
		System.out.println(list.get(0).getDepartment_name());
		int i=infoservice.Insertdepart(list);
		if(i>0){
			return "0";
		}else{
			return "1";
		}
	}
	
	/*
	 * 插入班级
	 */
	@RequestMapping(value="/insert_clazz",produces="text/html;charset=UTF-8")
	@ResponseBody
	public String insert_clazz(String Clazz_Name,String Clazz_Id){
		Clazz clazz=new Clazz();
		clazz.setClazz_name(Clazz_Name);
		clazz.setClazz_id(Integer.parseInt(Clazz_Id));
		int index=infoservice.insertclazz(clazz);
		if(index>0){
			return "0";
		}else{
			return "1";
		}
	}
	
	/*
	 * 批量插入班级
	 */
	@RequestMapping(value="/insertclazz",produces="text/html;charset=UTF-8")
	@ResponseBody
	public String insertclazz(String info){
		List<Clazz> list=JSON.parseArray(info,Clazz.class);
		int index=infoservice.InsertClazz(list);
		if(index>0){
			return "0";
		}else{
			return "1";
		}
	}
	
	/*
	 * 插入课程
	 */
	@RequestMapping(value="/insert_course",produces="text/html;charset=UTF-8")
	@ResponseBody
	public String insert_course(String Course_name,String Course_id){
		Course course=new Course();
		course.setCourse_name(Course_name);
		course.setCourse_id(Integer.parseInt(Course_id));
		int index=infoservice.insertcourse(course);
		if(index>0){
			return "0";
		}else{
			return "1";
		}
	}
	
	/*
	 * 批量插入课程
	 */
	@RequestMapping(value="/insertcourse",produces="text/html;charset=UTF-8")
	@ResponseBody
	public String insertcourse(String info){
		List<Course> list=JSON.parseArray(info,Course.class);
		int index=infoservice.InsertCourse(list);
		if(index>0){
			return "0";
		}else{
			return "1";
		}
	}
	/**
	 * 插入班级课程表
	 * @param clazz_id
	 * @param course_id
	 * @return
	 */
	@RequestMapping(value="/insertclacou",produces="text/html;charset=UTF-8")
	@ResponseBody
	public String insertclacou(String clazz_id,String course_id){
	    Clazz_course cc= new Clazz_course();
	    cc.setClazz_id(Integer.parseInt(clazz_id));
	    cc.setCourse_id(Integer.parseInt(course_id));
		int index=infoservice.insertclacou(cc);
		if(index>0){
			return "0";
		}else{
			return "1";
		}
	}
	
	/**
	 * 插入教师课程表
	 * @param clazz_id
	 * @param course_id
	 * @return
	 */
	@RequestMapping(value="/insertteacou",produces="text/html;charset=UTF-8")
	@ResponseBody
	public String insertteacou(String teacher_id,String course_id){
	    Teacher_course tc= new Teacher_course();
	    tc.setTeacher_id(teacher_id);
	    tc.setCourse_id(Integer.parseInt(course_id));
		int index=infoservice.insertteacou(tc);
		if(index>0){
			return "0";
		}else{
			return "1";
		}
	}
	
	/*
	 * 插入教师课程关系表
	 */
	@RequestMapping(value="/inserttea_cou",produces="text/html;charset=UTF-8")
	@ResponseBody
	public String inserttea_cou(String info){
		List<Teacher_course> list=JSON.parseArray(info,Teacher_course.class);
		infoservice.inserttea_cou(list);
		return "0";
	}
	/*
	 * 插入教师班级表
	 */
	@RequestMapping(value="/insertteacla",produces="text/html;charset=UTF-8")
	@ResponseBody
	public String insertteacla(String teacher_id,int clazz_id){
		Teacher_Clazz tl=new Teacher_Clazz();
		tl.setTeacher_id(teacher_id);
		tl.setClazz_id(clazz_id);
		int index=infoservice.insertteacla(tl);
		if(index>0){
			return "0";
		}else{
		    return "1";
		}
	}
	/*
	 * 插入指标数据
	 */
	@RequestMapping(value="/insertindicator",produces="text/html;charset=UTF-8")
	@ResponseBody
	public String insertindicator(String indicator_name,String F_id,String in_type,String weight){
		Indcator ind= new Indcator();
		System.out.println(F_id);
		System.out.println("text1");
	    ind.setIndicator_name(indicator_name);
	    ind.setF_id(Integer.parseInt(F_id));
	    ind.setWeight(weight);
	    ind.setIn_type(Integer.parseInt(in_type));
		int i=infoservice.insertindicator(ind);
		if(i>0){
			return "0";
		}else{
			return "1";
		}
	}
	//插入任务表
	@RequestMapping(value="/insertmanagement",produces="tex/html;charset=UTF-8")
	@ResponseBody
	public String insertmanagement(String info) {
		List<Task> list=JSON.parseArray(info, Task.class);
		infoservice.insertmanagement(list);
		return "0";
	}
	//添加评教成绩
	@RequestMapping(value="/inserscsore",produces="tex/html;charset=UTF-8")
	@ResponseBody
	public String inserscsore(String f,String tid){
		eva_oao ev = new eva_oao();
		ev.setVoted_id(tid);
		ev.setTotal_score(f);
		int i=infoservice.inserscsore(ev);
		if(i>0){
			return "0";
		}else{
			return "1";
		}
	}
}
