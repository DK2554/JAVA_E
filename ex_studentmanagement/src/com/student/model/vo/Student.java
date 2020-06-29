package com.student.model.vo;

public class Student {
	private String name;
	private int hak;
	private int ban;
	private Grade grade;
	
	public Student() {}
	public Student(String name,int hak,int ban,Grade grade) {
		this.name=name;
		this.hak=hak;
		this.ban=ban;
		this.grade=grade;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHak() {
		return hak;
	}
	public void setHak(int hak) {
		this.hak = hak;
	}
	public int getBan() {
		return ban;
	}
	public void setBan(int ban) {
		this.ban = ban;
	}
	public Grade getGrade() {
		return grade;
	}
	public void setGrade(Grade grade) {
		this.grade = grade;
	}
	@Override
	public Student clone() {
		//Å¬·Ğ³¡
		return new Student(name,hak,ban,grade);
	}
	
	
}
