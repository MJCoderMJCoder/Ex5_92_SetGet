package com.setget;

class Student2 {
	public String name;
	public String studentID;
	private String address;
	public String mobilePhone;
	protected String major;	//רҵ
	private float gpa;	//gap=grade average point��ƽ���ɼ�����
	
	//���ƽ���ɼ�����
	public float getgpa() {
		return gpa;
	}
	
	//�޸�ƽ���ɼ�����
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
		System.out.println("ѧ�ţ�" + studentID + "\t������" + name + "\t��ַ��" + address
				+ "\t��ѧ�ּ��㣺" + gpa);
	}
}
