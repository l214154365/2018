package com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bean.LoginUser;
import com.service.StudentService;



@Controller
public class LoginController {
	@Autowired
	private StudentService studentservice;
	
	
	@RequestMapping("/login")
	public String Login(){   
		return "login";
	}
	
	@RequestMapping(value="/login_submit",produces="text/html;charset=UTF-8")
	@ResponseBody
	public String login_submit(String username,String password,HttpSession session){
			LoginUser lu=new LoginUser();
			lu.setUsername(username);
			lu.setPassword(password);
			LoginUser user=studentservice.login(lu);

			if(user!=null){
				session.setAttribute("userinfo",user);
				LoginUser m=(LoginUser)session.getAttribute("userinfo");
				System.out.println(m.getTs_type());
				return "1";
			}else{
				  return "0";
			}	
			
	
	}

}
