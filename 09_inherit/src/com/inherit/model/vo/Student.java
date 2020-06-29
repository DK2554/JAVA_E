package com.inherit.model.vo;
//name,gender,address,phone 상속받아 사용
//public class Student {
public class Student extends Person{
	//private String name;
	private int hak;
	private int ban;
	//private String address;
	//private String phone;
	//private char gender;
	
	public Student() {
		
	}
	//생성자 이용하기
	
public Student(int hak,int ban) {
		this.hak=hak;
		this.ban=ban;
	}
	public Student(String name,int hak,int ban,String address,String phone,char gender) {
		super(name,address,phone,gender);
		//this.name=name;
		this.hak=hak;
		this.ban=ban;
		//this.address=address;
		//this.phone=phone;
		//this.gender=gender;
		//1. setter를 이용하는것
		//2. 생성자를 이용하는것
		setName(name);
		setAddress(address);
		setPhone(phone);
		setGender(gender);
	}
//	public String getName() {
//		return name;
//	}
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

//	public String infomation() {
//		return super.getName()+hak+ban+super.getAddress()+super.getPhone()+super.getGender();
//	}
//	
//	public String getAddress() {
//		return address;
//	}
//	public void setAddress(String address) {
//		this.address = address;
//	}
//	public String getPhone() {
//		return phone;
//	}
//	public void setPhone(String phone) {
//		this.phone = phone;
//	}
//	public char getGender() {
//		return gender;
//	}
//	public void setGender(char gender) {
//		this.gender = gender;
//	}
//	public void setName(String name) {
//		this.name=name;
//	}
	//object클래스에 있는 equals오버라이딩(재정의 하기)
	@Override
	public boolean equals(Object object) {
		//return this==object;
		//name같고,반,번호,전화번호가 같으면 동일한 객체로 처리
		if(this.getName().equals(((Student)object).getName())){
			return true;
		}
		else {
			return false;
		}
	}
	
	//information을 student에 맞게 재정의=> 오버라이딩
//	@Override
//	public String infomation() {
//		return super.getName()+super.getAddress()+super.getPhone()+super.getGender()+this.hak+this.ban;
//	}
	@Override
	public String toString() {
		return super.toString()+this.hak+this.ban;
	}
}
