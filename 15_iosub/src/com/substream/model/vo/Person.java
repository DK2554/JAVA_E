package com.substream.model.vo;

import java.io.Serializable;
//��ü�� ������ϱ� ���ؼ��� ���ķ� ó���� �������

public class Person implements Serializable {/**
	 * 
	 */
	private static final long serialVersionUID = -914565046650272048L;
//����ȭ ó�� byte������ ����ȭ ó���Ѵ�{
	
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
