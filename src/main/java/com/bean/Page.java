package com.bean;

public class Page {
	private int totalpage;//总页数
	private int cpage;//当前页数
	private int pagesize;//一页显示多少条数据
	private int starpage;
	private String title;//班级名字
	public int getTotalpage() {
		return totalpage;
	}
	public void setTotalpage(int totalpage) {
		this.totalpage = totalpage;
	}
	public int getCpage() {
		return cpage;
	}
	public void setCpage(int cpage) {
		this.cpage = cpage;
	}
	public int getPagesize() {
		return pagesize;
	}
	public void setPagesize(int pagesize) {
		this.pagesize = pagesize;
	}
	public int getStarpage() {
		return starpage;
	}
	public void setStarpage(int starpage) {
		this.starpage = starpage;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Page(int totalpage, int cpage, int pagesize, int starpage, String title) {
		super();
		this.totalpage = totalpage;
		this.cpage = cpage;
		this.pagesize = pagesize;
		this.starpage = starpage;
		this.title = title;
	}
	public Page() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
