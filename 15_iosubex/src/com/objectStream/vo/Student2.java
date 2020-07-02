package com.objectStream.vo;

import java.io.Serializable;

public class Student2 implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5522290388137185139L;
	private String name;
	private int age;
	private int sid;//학번
	private String dept;//학과
	private int grade;//학년ㄱ
	public Student2() {
		// TODO Auto-generated constructor stub
	}
	
	public Student2(String name, int age, int sid, String dept, int grade) {
		super();
		this.name = name;
		this.age = age;
		this.sid = sid;
		this.dept = dept;
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student2 [name=" + name + ", age=" + age + ", sid=" + sid + ", dept=" + dept + ", grade=" + grade + "]";
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	
}
