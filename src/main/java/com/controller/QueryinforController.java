package com.controller;

import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.bean.Clazz;
import com.bean.Course;
import com.bean.Department;
import com.bean.Indcator;
import com.bean.KeBiao;
import com.bean.LoginUser;
import com.bean.Page;
import com.bean.Student;
import com.bean.Task;
import com.bean.Teacher;
import com.bean.textone;
import com.service.QueryService;
import com.service.StudentService;

@Controller
public class QueryinforController {
	@Autowired
	private QueryService queryservice;
	
	@Autowired
	private StudentService studentservice;
	
	/**
	 * 获取班级
	 * @return
	 */
	@RequestMapping(value="/select_clazz",produces="text/html;charset=UTF-8")
	@ResponseBody
	public String select_clazz(){
		List<Clazz> clazz=queryservice.queryclazz();
		if(null == clazz || clazz.size() <=1){
	      	  return "0";
	        }else{
	      	  String Playerstatus = JSON.toJSONString(clazz);  
	      	  return Playerstatus;
	      	  
	        } 
	}
	
	
	/**
	 * 获取课程
	 * @return
	 */
	@RequestMapping(value="/select_course",produces="text/html;charset=UTF-8")
	@ResponseBody
	public String select_course(){
		System.out.println("123123");
		List<Course> course=queryservice.querycourse();
		if(null == course || course.size() <=1){
	      	  return "0";
	        }else{
	      	  String Playerstatus = JSON.toJSONString(course);
	      	  return Playerstatus;  	  
	        } 
	}
	
	/**
	 * 获取部门
	 */
	@RequestMapping(value="/select_depar",produces="text/html;charset=UTF-8")
	@ResponseBody
	public String select_depar(){
		List<Department> department=queryservice.selectdp();
		if(null == department || department.size() <1){
	      	  return "0";
	        }else{
	      	  String Playerstatus = JSON.toJSONString(department);
	      	  return Playerstatus;	  
	        } 
	}
	
	/**
	 * 获取部门
	 */
	@RequestMapping(value="/select_teacher",produces="text/html;charset=UTF-8")
	@ResponseBody
	public String select_teacher(){
		List<Department> department=queryservice.selectdp();
		if(null == department || department.size() <1){
	      	  return "0";
	        }else{
	      	  String Playerstatus = JSON.toJSONString(department);
	      	  return Playerstatus;	  
	        } 
	}
	
	/**
	 * 班级分页
	 */
	@RequestMapping("/queryallclazz")
	public String queryallclazz(String clazz_name,String cpage,HttpServletRequest session){
		      Page page=new Page();
		      String title=session.getParameter("title");
		int count=queryservice.querytotalpage();//数据总条数
		int pagesize=5;//一页显示数据条数
		//int totalpage=count % pagesize;
		int totalpage=(count % pagesize == 0) ? count / pagesize: count / pagesize + 1;//总页数
		int npage;//当前页数
		if(cpage!=null&&cpage!=""){
			 npage=Integer.parseInt(cpage)-1;
		}else{
			 npage=0;
		}
		int starpage=npage*pagesize;
		page.setTotalpage(totalpage);
		page.setPagesize(pagesize);
		page.setStarpage(starpage);
		page.setTitle(title);
	    List<Clazz> list=queryservice.fenye(page);
	    session.setAttribute("clazz", list);
	    session.setAttribute("pageone", page);
	    session.setAttribute("pageCount", totalpage);
	    session.setAttribute("page", npage+1);
	    session.getAttribute("clazz");
		return "clazz";
	}
	
	
	/**
	 * 课程分页
	 */
	@RequestMapping("/queryallcourse")
	public String queryallcourse(String course_name,String cpage,HttpServletRequest session){
		      Page page=new Page();
		      String title=session.getParameter("title");
		int count=queryservice.querytotalpage1();//数据总条数
		int pagesize=5;//一页显示数据条数
		//int totalpage=count % pagesize;
		int totalpage=(count % pagesize == 0) ? count / pagesize: count / pagesize + 1;//总页数
		int npage;//当前页数
		if(cpage!=null&&cpage!=""){
			 npage=Integer.parseInt(cpage)-1;
		}else{
			 npage=0;
		}
		int starpage=npage*pagesize;
		page.setTotalpage(totalpage);
		page.setPagesize(pagesize);
		page.setStarpage(starpage);
		page.setTitle(title);
	    List<Course> list=queryservice.fenye1(page);
	    session.setAttribute("course", list);
	    session.setAttribute("pageone", page);
	    session.setAttribute("pageCount", totalpage);
	    session.setAttribute("page", npage+1);
		return "course";
	}
	
	/**
	 * 班级分页
	 */
	@RequestMapping("/queryallclazz1")
	public String queryallclazz1(String clazz_name,String cpage,HttpServletRequest session){
		      Page page=new Page();
		      String title=session.getParameter("title");
		int count=queryservice.querytotalpage();//数据总条数
		int pagesize=5;//一页显示数据条数
		//int totalpage=count % pagesize;
		int totalpage=(count % pagesize == 0) ? count / pagesize: count / pagesize + 1;//总页数
		int npage;//当前页数
		if(cpage!=null&&cpage!=""){
			 npage=Integer.parseInt(cpage)-1;
		}else{
			 npage=0;
		}
		int starpage=npage*pagesize;
		page.setTotalpage(totalpage);
		page.setPagesize(pagesize);
		page.setStarpage(starpage);
		page.setTitle(title);
	    List<Clazz> list=queryservice.fenye(page);
	    session.setAttribute("clazz", list);
	    session.setAttribute("pageone", page);
	    session.setAttribute("pageCount", totalpage);
	    session.setAttribute("page", npage+1);
	    session.getAttribute("clazz");
		return "clazzAcourse";
	}
	
	/**
	 * 教师分页
	 */
	@RequestMapping("/queryallteacher")
	public String queryallteacher(String course_name,String cpage,HttpServletRequest session){
		      Page page=new Page();
		      String title=session.getParameter("title");
		int count=queryservice.querytotalpage2();//数据总条数
		int pagesize=5;//一页显示数据条数
		//int totalpage=count % pagesize;
		int totalpage=(count % pagesize == 0) ? count / pagesize: count / pagesize + 1;//总页数
		int npage;//当前页数
		if(cpage!=null&&cpage!=""){
			 npage=Integer.parseInt(cpage)-1;
		}else{
			 npage=0;
		}
		int starpage=npage*pagesize;
		page.setTotalpage(totalpage);
		page.setPagesize(pagesize);
		page.setStarpage(starpage);
		page.setTitle(title);
	    List<Teacher> list=queryservice.fenye2(page);
	    session.setAttribute("teacher", list);
	    session.setAttribute("pageone", page);
	    session.setAttribute("pageCount", totalpage);
	    session.setAttribute("page", npage+1);
		return "teachAcourse";
	}
	

	/**
	 * 获取课表
	 */
	@RequestMapping(value="/selectkebiao",produces="text/html;charset=UTF-8")
	@ResponseBody
	public String selectkebiao(String clazz_name){
		List<KeBiao> kb=queryservice.selectcourseByname(clazz_name);
		if(null == kb || kb.size() <1){
	      	  return "0";
	        }else{
	      	  String Playerstatus = JSON.toJSONString(kb);
	      	  return Playerstatus;	  
	        } 
	}
	
	/**
	 * 获取课表
	 */
	@RequestMapping(value="/selectkebiao1",produces="text/html;charset=UTF-8")
	@ResponseBody
	public String selectkebiao1(String teacher_name){
		System.out.println(teacher_name);
		List<KeBiao> kb=queryservice.selectcourseByname1(teacher_name);
		if(null == kb || kb.size() <1){
	      	  return "0";
	        }else{
	      	  String Playerstatus = JSON.toJSONString(kb);
	      	  return Playerstatus;	  
	        } 
	}
	
	
	/**
	 * 教师分页
	 */
	@RequestMapping("/queryallteacher1")
	public String queryallteacher1(String course_name,String cpage,HttpServletRequest session){
		      Page page=new Page();
		      String title=session.getParameter("title");
		int count=queryservice.querytotalpage2();//数据总条数
		int pagesize=5;//一页显示数据条数
		//int totalpage=count % pagesize;
		int totalpage=(count % pagesize == 0) ? count / pagesize: count / pagesize + 1;//总页数
		int npage;//当前页数
		if(cpage!=null&&cpage!=""){
			 npage=Integer.parseInt(cpage)-1;
		}else{
			 npage=0;
		}
		int starpage=npage*pagesize;
		page.setTotalpage(totalpage);
		page.setPagesize(pagesize);
		page.setStarpage(starpage);
		page.setTitle(title);
	    List<Teacher> list=queryservice.fenye2(page);
	    session.setAttribute("teacher", list);
	    session.setAttribute("pageone", page);
	    session.setAttribute("pageCount", totalpage);
	    session.setAttribute("page", npage+1);
		return "teacher";
	}
	
	/**
	 * 学生分页
	 */
	@RequestMapping("/queryallteacher2")
	public String queryallteacher2(String course_name,String cpage,HttpServletRequest session){
		      Page page=new Page();
		      String title=session.getParameter("title");
		int count=queryservice.querytotalpage3();//数据总条数
		int pagesize=5;//一页显示数据条数
		//int totalpage=count % pagesize;
		int totalpage=(count % pagesize == 0) ? count / pagesize: count / pagesize + 1;//总页数
		int npage;//当前页数
		if(cpage!=null&&cpage!=""){
			 npage=Integer.parseInt(cpage)-1;
		}else{
			 npage=0;
		}
		int starpage=npage*pagesize;
		page.setTotalpage(totalpage);
		page.setPagesize(pagesize);
		page.setStarpage(starpage);
		page.setTitle(title);
	    List<Teacher> list=queryservice.fenye3(page);
	    session.setAttribute("student", list);
	    session.setAttribute("pageone", page);
	    session.setAttribute("pageCount", totalpage);
	    session.setAttribute("page", npage+1);
		return "student";
	}

//任务表分页
	@RequestMapping("/queryalltask")
	public String queryalltask(String course_name,String cpage,HttpServletRequest session) {
		Page page=new Page();
		String title=session.getParameter("title");
		int count=queryservice.querytotalpage4();
		int pagesize=5;
		int totalpage=(count%pagesize==0)?count/pagesize:count/pagesize+1;
		int npage;
		if(cpage!=null&&cpage!="") {
			npage=Integer.parseInt(cpage)-1;
		}else {
			npage=0;
		}
		int starpage=npage*pagesize;
		page.setTotalpage(totalpage);
		page.setPagesize(pagesize);
		page.setStarpage(starpage);
		page.setTitle(title);
		List<Task> list=queryservice.fenye4(page);
		for(int i=0;i<list.size();i++) {
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			System.out.println(list.get(i).getStarttime());
			//System.out.println(df.format(list.get(i).getStarttime()));
		}
		session.setAttribute("task", list);
		session.setAttribute("pageone", page);
		session.setAttribute("pageCount", totalpage);
		session.setAttribute("page", npage+1);
		return "Task";
	}
	
	/**
	 * 获取教师
	 */
	@RequestMapping(value="/selectteacher",produces="text/html;charset=UTF-8")
	@ResponseBody
	public String selectteacher(String t_id){
		List<Teacher> t=queryservice.selectteacher(t_id);
		if(null == t || t.size() <1){
	      	  return "0";
	        }else{
	      	  String Playerstatus = JSON.toJSONString(t);
	      	  return Playerstatus;	  
	        } 
	}
	

	/**
	 * 获取学生
	 */
	@RequestMapping(value="/selectstudent",produces="text/html;charset=UTF-8")
	@ResponseBody
	public String selectstudent(String s_id){
		List<Student> t=queryservice.selectstudent(s_id);
		if(null == t || t.size() <1){
	      	  return "0";
	        }else{
	      	  String Playerstatus = JSON.toJSONString(t);
	      	  return Playerstatus;	  
	        } 
	}
	
	/**
	 * 查询用户信息
	 * @param username
	 * @param password
	 * @param session
	 * @return
	 */
	@RequestMapping(value="/query_info",produces="text/html;charset=UTF-8")
	@ResponseBody
	public String query_info(HttpSession session){
		    LoginUser m=(LoginUser)session.getAttribute("userinfo");
			LoginUser lu=new LoginUser();
			System.out.println("123"+m.getUsername());
			System.out.println("132"+m.getPassword());
			lu.setUsername(m.getPassword());
			lu.setPassword(m.getPassword());
			LoginUser user=studentservice.login(lu);
			if(user!=null){
				  String Playerstatus = JSON.toJSONString(user);
		      	  return Playerstatus;	 
			}else{
				  return "0";
			}	
			
	
	}
	//查询指标
	@RequestMapping(value="/selectindicator",produces="text/html;charset=UTF-8")
	@ResponseBody
	public String selectindicator(){
		List<Indcator> indcator=queryservice.selectindicator();
		if(null == indcator || indcator.size() <1){
	      	  return "0";
	        }else{
	      	  String Playerstatus = JSON.toJSONString(indcator);
	      	  return Playerstatus;	  
	        } 
	}
	//查询学生指标
	@RequestMapping(value="/selectsindicator",produces="text/html;charset=UTF-8")
	@ResponseBody
	public String selectsindicator(){
		List<Indcator> sind = queryservice.selectsindicator();
		if(null == sind || sind.size() <1){
	      	  return "0";
	        }else{
	      	  String Playerstatus = JSON.toJSONString(sind);
	      	  return Playerstatus;	  
	        } 
	}
	
	//学生评教查询老师
	@RequestMapping(value="/findteachercourse",produces="text/html;charset=UTF-8")
	public String findteachercourse(HttpSession session){
		int sta=queryservice.querystatus();
		System.out.println(sta);
		List<textone> findtc = queryservice.findteachercourse();
		if(sta==1){
			if(null == findtc || findtc.size()<1){
				return "0";
			}else{
				session.setAttribute("gers", findtc);
				return "sindicator";
				
			}
		}else{
			return "erro";
		}

	}
	
	@RequestMapping(value="/a2",produces="text/html;charset=UTF-8")
	@ResponseBody
	public String a2(){
		String Playerstatus = JSON.toJSONString(queryservice.A1());
			System.out.println(Playerstatus);
			return Playerstatus;
	
	}
	//获取任务表
		@RequestMapping(value="/query_task",produces="text/html;charset=UTF-8")
		@ResponseBody
		public String query_task(String id) {
			List<Task> ta=queryservice.selecttask(id);
			if(ta==null||ta.size()<1) {
				return "0";
			}else {
				String Playerstatus=JSON.toJSONString(id);
				return Playerstatus;
			}
		}
		
		//查询教师同行评教
		@RequestMapping(value="/findteacherfriend",produces="text/html;charset=UTF-8")
		public String findteacherfriend(HttpSession session){
			int sta=queryservice.querystatus_next();
			System.out.println(sta);
			List<Teacher> findtf = queryservice.findteacherfriend();
			if(sta==1){
				if(null == findtf || findtf.size()<1){
					return "0";
				}else{
					session.setAttribute("ger", findtf);
					return "tindicator";
					
				}
			}else{
				return "erro";
			}
		}
		//查询同行评教指标
		@RequestMapping(value="/selecttindicator",produces="text/html;charset=UTF-8")
		@ResponseBody
		public String selecttindicator(){
			List<Indcator> tind = queryservice.selecttindicator();
			if(null == tind || tind.size() <1){
		      	  return "0";
		        }else{
		      	  String Playerstatus = JSON.toJSONString(tind);
		      	  return Playerstatus;	  
		        } 
		}
		
}
