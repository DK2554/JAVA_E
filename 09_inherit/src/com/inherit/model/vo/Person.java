package com.inherit.model.vo;

public class Person {
	private String name;
	private String address;
	private String phone;
	private char gender;
	private String email;
	
	public Person(){}
	public Person(String name, String address,String phone,char gender,String email) {
		this.name=name;
		this.address=address;
		this.phone=phone;
		this.gender=gender;
		this.email=email;
	}
	public Person(String name, String address,String phone,char gender){
		this.name=name;
		this.address=address;
		this.phone=phone;
		this.gender=gender;
		
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	//final 오버라이딩이 불가능하게 하는 예약어
	public final String infomation() {
		return name+address+phone+gender;
	}
	@Override
	public String toString() {
		return name+address+phone+gender;
	}

}
