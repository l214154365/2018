package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Clazz;
import com.bean.Course;
import com.bean.Department;
import com.bean.Indcator;
import com.bean.KeBiao;
import com.bean.Page;
import com.bean.Student;
import com.bean.Task;
import com.bean.Teacher;
import com.bean.eva_oao;
import com.bean.textone;
import com.dao.QueryDao;

@Service
public class QueryService {

	@Autowired
	private QueryDao querydao;
	
	//查询班级
	public List<Clazz> queryclazz(){
     	return 	querydao.queryclazz();
	}
	//查询课程
	public 	List<Course> querycourse(){
		return 	querydao.querycourse();
	}
	//查询所有部门
	public List<Department> selectdp(){
		return querydao.selectdp();	
	}
	//查询子部门
	public List<Department> selectdpson(int Id){
		return querydao.selectdpson(Id);	
	}
    //班级模糊查询
	public int querytotalpage(){
		return querydao.querytotalpage();
	}
	//分页
	public List<Clazz> fenye(Page page){
		return querydao.fenye(page);
	}
	//课程模糊查询
	public int querytotalpage1(){
			return querydao.querytotalpage1();
	}
	//课程分页
	public List<Course> fenye1(Page page){
			return querydao.fenye1(page);
	}
	//教师模糊查询
	public int querytotalpage2(){
				return querydao.querytotalpage2();
	}
	//教师分页
	public List<Teacher> fenye2(Page page){
				return querydao.fenye2(page);
	}
	//学生模糊查询
	public int querytotalpage3(){
			    return querydao.querytotalpage3();
	}
	//学生分页
	public List<Teacher> fenye3(Page page){
				return querydao.fenye3(page);
	}
	public int querytotalpage4(){
		return querydao.querytotalpage4();
	}
	public List<Task> fenye4(Page page){
		return querydao.fenye4(page);
	}
	//查询班级课表
	public List<KeBiao> selectcourseByname(String clazz_name){
		return querydao.selectcourseByname(clazz_name);
	}
	//查询教师课表
	public List<KeBiao> selectcourseByname1(String teacher_name){
		return querydao.selectcourseByname1(teacher_name);
	}
	//查询教师
	public List<Teacher> selectteacher(String t_id){
		return querydao.selectteacher(t_id);
	}
	//查询学生
	public List<Student> selectstudent(String s_id){
		return querydao.selectstudent(s_id);
	}
	//查询指标
	public List<Indcator> selectindicator(){
		return querydao.selectindicator();
	}
	//学生评教
	public List<Indcator> selectsindicator(){
		return querydao.selectsindicator();
	}
	//学生评教查询老师
	public List<textone> findteachercourse(){
		return querydao.findteachercourse();
	}
	
	public List<Indcator> A1(){
		
		return querydao.A1();
	}
	public List<Task> selecttask(String id){
		return querydao.selecttask(id);
	}
	//查询学生评教开关
	public int querystatus(){
		return querydao.querystatus();
	}
	//查询教师评教开关
	public int querystatus_next(){
		return querydao.querystatus_next();
	}
	//查询教师同行评教
	public List<Teacher> findteacherfriend(){
		return querydao.findteacherfriend();
	}
	//查询同行评教指标
	public List<Indcator> selecttindicator(){
		return querydao.selecttindicator();	
    }
	public List<eva_oao> queryscore(){
		return querydao.queryscore();
	}
}
