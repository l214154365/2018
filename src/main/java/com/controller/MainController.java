package com.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.bean.LoginUser;
import com.bean.Menu;
import com.service.MenuService;

@Controller
public class MainController {
	@Autowired
	private MenuService menuservice;
	
	@RequestMapping("/main")
	public String main(){
		return "main";
	}
	
	
	@RequestMapping(value="/menu_submit",produces="text/html;charset=UTF-8")
	@ResponseBody
	public String login_submit(HttpSession session){
		
		LoginUser m=(LoginUser)session.getAttribute("userinfo");
		int user_id=Integer.parseInt(m.getUser_id());
		System.out.println(user_id);
		List<Menu> list=menuservice.getmenu(user_id);
		if(null == list || list.size() <=1){
      	  return "0";
        }else{
      	  String Playerstatus = JSON.toJSONString(list);  
      	  return Playerstatus;
      	  
        } 
	}

}
