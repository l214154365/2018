package com.bean;

public class Indcator {
	private int id;
	private int F_id;
	private String Weight;
	private int In_type;
	private String Indicator_name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getF_id() {
		return F_id;
	}
	public void setF_id(int f_id) {
		F_id = f_id;
	}
	public String getWeight() {
		return Weight;
	}
	public void setWeight(String weight) {
		Weight = weight;
	}
	public int getIn_type() {
		return In_type;
	}
	public void setIn_type(int in_type) {
		In_type = in_type;
	}
	public String getIndicator_name() {
		return Indicator_name;
	}
	public void setIndicator_name(String indicator_name) {
		Indicator_name = indicator_name;
	}
	public Indcator(int id, int f_id, String weight, int in_type, String indicator_name) {
		super();
		this.id = id;
		F_id = f_id;
		Weight = weight;
		In_type = in_type;
		Indicator_name = indicator_name;
	}
	public Indcator() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
