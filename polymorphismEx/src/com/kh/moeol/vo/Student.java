package com.kh.moeol.vo;

public class Student extends Person {
	private int hak;
	private int ban;
	private int number;
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
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public Student(String name, int age, char gender, int hak, int ban, int number) {
		super(name, age, gender);
		this.hak = hak;
		this.ban = ban;
		this.number = number;
	}
	public Student(int hak, int ban, int number) {
		super();
		this.hak = hak;
		this.ban = ban;
		this.number = number;
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return super.toString() +hak+ " "+ ban+" " +  number ;
	}

}
