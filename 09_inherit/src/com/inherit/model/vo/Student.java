package com.inherit.model.vo;
//name,gender,address,phone ��ӹ޾� ���
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
	//������ �̿��ϱ�
	
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
		//1. setter�� �̿��ϴ°�
		//2. �����ڸ� �̿��ϴ°�
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
	//objectŬ������ �ִ� equals�������̵�(������ �ϱ�)
	@Override
	public boolean equals(Object object) {
		//return this==object;
		//name����,��,��ȣ,��ȭ��ȣ�� ������ ������ ��ü�� ó��
		if(this.getName().equals(((Student)object).getName())){
			return true;
		}
		else {
			return false;
		}
	}
	
	//information�� student�� �°� ������=> �������̵�
//	@Override
//	public String infomation() {
//		return super.getName()+super.getAddress()+super.getPhone()+super.getGender()+this.hak+this.ban;
//	}
	@Override
	public String toString() {
		return super.toString()+this.hak+this.ban;
	}
}
