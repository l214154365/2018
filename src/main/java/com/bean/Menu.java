package com.bean;

public class Menu {
	private Integer Id;
	private String context;
	private Integer nav_id;
	private Integer parent_id;
	private Integer role_menu;
	private Integer menu_id;
    private Integer F_id;
	private String a_context;
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getContext() {
		return context;
	}
	public void setContext(String context) {
		this.context = context;
	}
	public Integer getNav_id() {
		return nav_id;
	}
	public void setNav_id(Integer nav_id) {
		this.nav_id = nav_id;
	}
	public Integer getParent_id() {
		return parent_id;
	}
	public void setParent_id(Integer parent_id) {
		this.parent_id = parent_id;
	}
	public Integer getRole_menu() {
		return role_menu;
	}
	public void setRole_menu(Integer role_menu) {
		this.role_menu = role_menu;
	}
	public Integer getMenu_id() {
		return menu_id;
	}
	public void setMenu_id(Integer menu_id) {
		this.menu_id = menu_id;
	}
	public Integer getF_id() {
		return F_id;
	}
	public void setF_id(Integer f_id) {
		F_id = f_id;
	}
	public String getA_context() {
		return a_context;
	}
	public void setA_context(String a_context) {
		this.a_context = a_context;
	}
	public Menu(Integer id, String context, Integer nav_id, Integer parent_id, Integer role_menu, Integer menu_id,
			Integer f_id, String a_context) {
		super();
		Id = id;
		this.context = context;
		this.nav_id = nav_id;
		this.parent_id = parent_id;
		this.role_menu = role_menu;
		this.menu_id = menu_id;
		F_id = f_id;
		this.a_context = a_context;
	}
	public Menu() {
		super();
	}
	
	

}
