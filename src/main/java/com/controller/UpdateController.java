package com.controller;

import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bean.LoginUser;
import com.bean.Student;
import com.bean.Task;
import com.bean.Teacher;
import com.service.UpdateService;

@Controller
public class UpdateController {
    
	@Autowired
	private UpdateService updateservice;
	
  /*
   * 管理员重置教师密码
   */
	@RequestMapping("/resetteacher")
	@ResponseBody
	public String resetteacher(String t_id){
		int index=updateservice.resetteacherpd(t_id);
		if(index>0){
			return "0";
		}else{
			return "1";
		}
	}
	
	/*
	   * 管理员重置学生密码
	   */
		@RequestMapping("/resetstudent")
		@ResponseBody
		public String resetstudent(String s_id){
			int index=updateservice.resetstudent(s_id);
			if(index>0){
				return "0";
			}else{
				return "1";
			}
		}
		
		 /*
		  * 管理员更新教师信息
		  */
			@RequestMapping("/updateteacher")
			@ResponseBody
			public String updateteacher(Teacher t){
				int index=updateservice.updatetea(t);
				if(index>0){
					return "0";
				}else{
					return "1";
				}
			}
			
			 /*
			  * 管理员更新学生信息
			  */
				@RequestMapping("/updatestu")
				@ResponseBody
				public String updatestu(Student s){
					int index=updateservice.updatestu(s);
					if(index>0){
						return "0";
					}else{
						return "1";
					}
				}

				
				 /*
				  * 用户更新信息
				  */
					@RequestMapping("/updateinfo")
					@ResponseBody
					public String updateinfo(LoginUser u,HttpSession session){
						LoginUser m=(LoginUser)session.getAttribute("userinfo");
						int index;
						if(m.getTs_type().equals("1")){	
						  index=updateservice.updateuserinfo1(u);
						}else{
						  index=updateservice.updateuserinfo(u);
						}
						if(index>0){
							return "0";
						}else{
							return "1";
						}
					}
					/*
					  * 开启任务状态
					  */
					@RequestMapping("/updatestatus")
					@ResponseBody
					public String updatestatus(Task id) {
						int index=updateservice.updatetaskstatus(id);
						if(index>0) {
							return "0";
						}else {
							return "1";
						}
					}
					/*
					  * 关闭任务状态
					  */
					@RequestMapping("/closestatus")
					@ResponseBody
					public String closestatus(Task id) {
						int index=updateservice.closestatus(id);
						if(index>0) {
							return "0";
						}else {
							return "1";
						}
					}
					/*
					  * 更新任务信息
					  */
					@RequestMapping("/updatesta")
					@ResponseBody
					public String updatesta(Task ta) {
						int index=updateservice.updatetask(ta);
						if(index>0) {
							return "0";
						}else {
							return "1";
						}
					}

}
