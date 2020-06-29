package com.oop.model.vo;

public class Employee {
	private String id;
	private String pwd;
	private String name;
	private int age;
	private String gender;
	private String phone;
	private String email;
	
	
	//�⺻������
	public Employee(){
		
	}
	//�Ű������� �ִ� ������
	public Employee(String id,String pwd,String name,int age,String gender,String phone,String email) {
		this.id=id;
		this.pwd=pwd;
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.phone=phone;
		this.email=email;
	}
	
	//data����,��� �� �� �ִ±��
	//getter/setter �����Ϳ� ���� �����ϴ� getter ���� �����ϰ� �ϴ� setter����
	public String getId() {
		return id;
	}
	public void setId(String id) {
		//id�� 4���� �̻��ϰ�쿡�� ���� �־��
		if(id.length()>=4) {
			this.id = id;	
		}
		
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String allData() {
		return this.id+" "+this.pwd+" "+this.name+" "+this.age+" "+this.gender
				+" "+this.phone+" "+this.email;
	
	
	}
	
	
	
}
