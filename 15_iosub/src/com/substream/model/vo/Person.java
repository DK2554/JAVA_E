package com.substream.model.vo;

import java.io.Serializable;
//객체를 입출력하기 위해서는 직렬롸 처리를 해줘야함

public class Person implements Serializable {/**
	 * 
	 */
	private static final long serialVersionUID = -914565046650272048L;
//직렬화 처리 byte단위로 직렬화 처리한다{
	
	private String name;
	private int age;
	private char gender;
	private double height;
	private double weight;
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	public Person(String name, int age, char gender, double height, double weight) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.height = height;
		this.weight = weight;
	}



	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + ", height=" + height + ", weight="
				+ weight + "]";
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
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	

}
