package com.objectStream.vo;

import java.io.Serializable;

public class Student implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -484548684933704601L;
	private String name;
	private int age;
	private int sid;
	private String dept;
	private int grade;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", sid=" + sid + ", dept=" + dept + ", grade=" + grade + "]";
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
	public Student(String name, int age, int sid, String dept, int grade) {
		this.name = name;
		this.age = age;
		this.sid = sid;
		this.dept = dept;
		this.grade = grade;
	}
	

}
