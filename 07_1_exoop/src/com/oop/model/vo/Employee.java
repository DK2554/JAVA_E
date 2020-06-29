package com.oop.model.vo;

public class Employee {
	private String id;
	private String pwd;
	private String name;
	private int age;
	private String gender;
	private String phone;
	private String email;
	
	
	//기본생성자
	public Employee(){
		
	}
	//매개변수가 있는 생성자
	public Employee(String id,String pwd,String name,int age,String gender,String phone,String email) {
		this.id=id;
		this.pwd=pwd;
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.phone=phone;
		this.email=email;
	}
	
	//data조작,출력 할 수 있는기능
	//getter/setter 데이터에 값을 접근하는 getter 값을 저장하게 하는 setter선언
	public String getId() {
		return id;
	}
	public void setId(String id) {
		//id가 4글자 이상일경우에만 값을 넣어라
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
