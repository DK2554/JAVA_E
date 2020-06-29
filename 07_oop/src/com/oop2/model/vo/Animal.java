package com.oop2.model.vo;

public class Animal {
	private String name;
	private String category;
	private int age;
	
	//기본생성자 조건! 생성자가 클래스 내부에 없으면 안써도 자동할당하지만 있으면 꼭 선언해야함
	
	public Animal() {
		
	}
	//매개변수가 있는 생성자(3)
	public Animal(String name,String category,int age) {
		this.age=age;
		this.category=category;
		this.name=name;
		
	}//매개변수가 2개인 생성자
	public Animal(String name,String category) {
		this.name=name;
		this.category=category;
	}
	//메소드(getter,setter)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

}
