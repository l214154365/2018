package com.dao;

import java.util.List;

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

public interface QueryDao {
   
	List<Clazz> queryclazz();//查询班级
	List<Course> querycourse();//查询课程
	List<Department> selectdp();//查询所有部门
	List<Department> selectdpson(int Id);//查询子部门
	int querytotalpage();//查询班级分页总条数
	List<Clazz> fenye(Page page);//班级分页模糊查询
	int querytotalpage1();//查询课表分页总条数
	List<Course> fenye1(Page page);//课表分页模糊查询
	int querytotalpage2();//查询教师分页总条数
	List<Teacher> fenye2(Page page);//教师分页模糊查询
	int querytotalpage3();//查询学生分页总条数
	List<Teacher> fenye3(Page page);//学生分页模糊查询
	int querytotalpage4();//查詢任務分頁總條數
	List<Task> fenye4(Page page);//任務分頁模糊查詢
	List<KeBiao> selectcourseByname(String clazz_name);//查询班级课表
	List<KeBiao> selectcourseByname1(String teacher_name);//查询教师课表
	List<Teacher> selectteacher(String t_id);//查询教师
	List<Student> selectstudent(String s_id);//查询学生
	List<Indcator> selectindicator();//查询指标
	List<Indcator> selectsindicator();//查询学生指标
    List<textone> findteachercourse();//学生评教查询老师
	List<Indcator> A1();//查询学生
	List<Task> selecttask(String id);
	int querystatus();//学生评教开关
	int querystatus_next();//教师评教开关
	List<Teacher> findteacherfriend();//查询教师同行评教
	List<Indcator> selecttindicator();//查询同行评教
	List<eva_oao> queryscore();
}
