package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Menu;
import com.dao.MenuDao;



@Service
public class MenuService {
	@Autowired
	private MenuDao menudao;
	//登录后根据权限得到导航菜单
	public List<Menu> getmenu(int user_id){
		return menudao.getmenu(user_id);
	}
	//查询相对应权限菜单
	public List<Menu> querymenu(int role_menu){
		return menudao.getmenu(role_menu);
	}
	//得到treeview菜单数据
	public List<Menu>  gettreeview(Menu m1){
		return menudao.gettreeview(m1);
	}
	//添加菜单后更新菜单id+1
	public int addmenu_id(Menu m1){	
        return menudao.addmenu_id(m1);
	}
	//添加菜单后更新nav_id+1
	public int addnav_di(Menu m1){	
		return menudao.addnav_di(m1);
	}
	//插入新菜单
	public int insertmenu(Menu m1){
		return menudao.insertmenu(m1);
	}
	//添加菜单后更新parent_id+1
	public int addparent_id(Menu m1){
		return menudao.addparent_id(m1);
	}
	//得到子菜单最大序号
	public int getmenu_id(int i){
		return menudao.getmenu_id(i);	
	}
	//判断是否有子菜单
	public List<Menu> panduan(Menu m1){
		return menudao.panduan(m1);
	}
	//删除菜单
	public int deletemenu(Menu m1){
		return menudao.deletemenu(m1);
	}
	//删除子菜单
	public int deletepid(Menu m1){
		return menudao.deletepid(m1);	
	}
	//删除菜单后更新nav_id-1
	public int reducenav_di(Menu m1){
		return menudao.reducenav_di(m1);
	}
	//删除菜单后更新parent_id-1
	public int reduceparent_id(Menu m1){
		return menudao.reduceparent_id(m1);
	}

}
