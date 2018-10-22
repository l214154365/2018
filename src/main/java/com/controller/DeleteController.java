package com.controller;



import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bean.Department;
import com.service.DeleteService;
import com.service.QueryService;



@Controller
public class DeleteController {
	@Autowired
	private QueryService queryservice;
	@Autowired
	private DeleteService deleteservice;
	
	
	@RequestMapping("/deletedp")
	public String deletedp(){
		return "deletedp";	
	}

	/*
	 * 删除部门
	 */
	@RequestMapping(value="/delete_dp",produces="text/html;charset=UTF-8")
	@ResponseBody
	public String delete_dp(int Id){
	         	List<Department> list=queryservice.selectdpson(Id);
	         	if(list==null||list.size()<1){
	         		deleteservice.deletdp(Id);
	         		
	         	}else{
	         		deleteservice.deletdpson(Id);
	         		deleteservice.deletdp(Id);
	         	}
				  return "0";	
	}
	
	/**
	 * 删除班级
	 * @param clazz_id
	 * @return
	 */
	@RequestMapping("/delete_clazz")
	public String delete_clazz(int clazz_id){
		 deleteservice.deletd_clazz(clazz_id);
		return "clazz";
	}
	
	/**
	 * 删除课程
	 * @param clazz_id
	 * @return
	 */
	@RequestMapping("/delete_course")
	public String delete_course(int course_id){
		 deleteservice.deletd_course(course_id);
		return "course";
	}
	
	/*
	 * 删除教师
	 */
	@RequestMapping("/delete_teacher")
	@ResponseBody
	public String delete_teacher(String t_id){
		deleteservice.deletd_teacher(t_id);
		deleteservice.deletd_teacher_course(t_id);
		deleteservice.deletd_teacher_role(t_id);
		return "0";
	}
	
	/*
	 * 删除学生
	 */
	@RequestMapping("/delete_student")
	@ResponseBody
	public String delete_student(String t_id){
		deleteservice.deletd_student(t_id);
		deleteservice.deletd_teacher_role(t_id);
		return "0";
	}
	/*
	 * 删除任务
	 */
	@RequestMapping("/deletetask")
	@ResponseBody
	public String deletetask(String id) {
		deleteservice.deletetask(id);
		return "0";
	}
	

}
