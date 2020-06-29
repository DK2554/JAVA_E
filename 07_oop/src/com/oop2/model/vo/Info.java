package com.oop2.model.vo;

public class Info {
	private String name;
	private int age;
	private String address;
	private char gender;
	private int money;

	public Info() {

		//자기자신의 생성자를 재호출 할떄
		this("홍길동",49,"강원도 산골");
		this.money=1000000;
		//this()생성자는 항상 사용되는 곳의 맨위 라인에 있어야함
	}
	

	public Info(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;

	}

	public Info(String name, int age, String address, char gender, int money) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.gender = gender;
		this.money = money;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}


}
