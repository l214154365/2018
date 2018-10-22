package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.bean.Menu;
import com.service.MenuService;





@Controller
public class MenuController {
	@Autowired
	private MenuService menuservice;
	
	
	
     @RequestMapping("menu")
     public String menu(){
       return "menu";
     }
     
     @RequestMapping("deletemenu")
     public String deletemenu(){
       return "deletemenu";
     }
     
     /**
      * 导航栏得到菜单
      * @param role_menu
      * @return
      */
    @RequestMapping(value="/get_menu",produces="text/html;charset=UTF-8")
 	@ResponseBody
 	public String get_menu(String role_menu){
 	
	  int num=Integer.parseInt(role_menu);
	  List<Menu> list=menuservice.querymenu(num);
	  if(null == list || list.size() <=1){
      	  return "0";
        }else{
      	  String Playerstatus = JSON.toJSONString(list);  
      	  return Playerstatus;
      	  
        } 

 	}
    
    /**
     * treeview得到菜单
     * @return
     */
    
    @RequestMapping(value="/get_menu1",produces="text/html;charset=UTF-8")
 	@ResponseBody
 	   public String get_menu1(Menu m1){
	  List<Menu> list=menuservice.gettreeview(m1);
	  if(null == list || list.size() <=1){
      	  return "0";
        }else{
      	  String Playerstatus = JSON.toJSONString(list);  
      	  return Playerstatus;
      	  
        } 

 	}
    /**
     * 插入菜单并更新菜单顺序
     * @param m1
     * @return
     */
    @RequestMapping(value="/insertmenu",produces="text/html;charset=UTF-8")
 	@ResponseBody
 	    public String insertmenu(Menu m1){
    	if(menuservice.panduan(m1).size()>0&&m1.getNav_id()!=0){
    		int parent_id=menuservice.getmenu_id(m1.getNav_id()-1);
        	Menu m2=new Menu();
        	m2.setMenu_id(parent_id+1);
        	m2.setRole_menu(m1.getRole_menu());
    	    menuservice.addmenu_id(m2);
    	    m1.setMenu_id(parent_id+1);	
    	}else{
    		  menuservice.addmenu_id(m1);
    	}
	    if(m1.getNav_id()!=0){
	    	menuservice.addnav_di(m1);
	    	menuservice.addparent_id(m1);
	    	menuservice.insertmenu(m1);
	    }else{
	    	menuservice.insertmenu(m1);
	    }
	    return "0";
 	}
    
    /**
     * 删除菜单并更新菜单顺序
     * @param m1
     * @return
     */
    @RequestMapping(value="/deleteM",produces="text/html;charset=UTF-8")
 	@ResponseBody
 	    public String deletemenu(Menu m1){
    	if(m1.getNav_id()!=0){
    		menuservice.deletemenu(m1);
    		menuservice.deletepid(m1);
    		menuservice.reducenav_di(m1);
    		menuservice.reduceparent_id(m1);
    	}else{
    		menuservice.deletemenu(m1);
    	}
	    return "0";
 	}


}
