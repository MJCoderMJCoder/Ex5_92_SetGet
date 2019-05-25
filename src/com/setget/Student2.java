package com.setget;

class Student2 {
	public String name;
	public String studentID;
	private String address;
	public String mobilePhone;
	protected String major;	//专业
	private float gpa;	//gap=grade average point：平均成绩点数
	
	//获得平均成绩点数
	public float getgpa() {
		return gpa;
	}
	
	//修改平均成绩点数
	public void setgpa(float gpa) {
		this.gpa = gpa;
	}
	
	public void setInfo(String n, String ID, String add) {
		name = n;
		studentID = ID;
		address = add;
	}
	
	public void setInfo(float g, String ID) {
		gpa = g;
		studentID = ID;
	}
	
	public void geoInfo() {
		System.out.println("学号：" + studentID + "\t姓名：" + name + "\t地址：" + address
				+ "\t总学分绩点：" + gpa);
	}
}
