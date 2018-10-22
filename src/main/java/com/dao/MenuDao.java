package com.dao;

import java.util.List;

import com.bean.Menu;


public interface MenuDao {
List<Menu> getmenu(int user_id);//登录后根据权限得到导航菜单
List<Menu> querymenu(int role_menu);//查询相对应权限菜单
List<Menu> gettreeview(Menu m1);//得到treeview菜单数据
int addmenu_id(Menu m1);//添加菜单后更新菜单id+1
int addnav_di(Menu m1);//添加菜单后更新nav_id+1
int insertmenu(Menu m1);//插入新菜单
int addparent_id(Menu m1);////添加菜单后更新parent_id+1
int getmenu_id(int parent_id);//得到子菜单最大序号
List<Menu> panduan(Menu m1);//判断是否有子菜单
int deletemenu(Menu m1);//删除菜单
int deletepid(Menu m1);//删除子菜单
int reducenav_di(Menu m1);//删除菜单后更新nav_id-1
int reduceparent_id(Menu m1);//删除菜单后更新parent_id-1
}
