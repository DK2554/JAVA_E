	package com.inherit.model.vo;

public class Employee extends Person {
//	private String name;
//	private String address;
//	private String phone;
//	private char gender;
	private int salary;
	private String department;
	private String job;
	public Employee() {}
	public Employee(String name,String address,String phone, char gender,int salary
			,String department,String job) {
		super(name,address,phone,gender);
		this.salary=salary;
		this.department=department;
		this.job=job;
	}
//	public String getName() {
//		return name;
//	}
//	public Employee() {}
//	public void setName(String name) {
//		this.name = name;
//	}
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getName() {
		return "employeegetName";
	}
//	@Override
//	public String infomation() {
//		return super.getName()+super.getAddress()+super.getPhone()+super.getGender()+
//				this.salary+this.department+this.job;
//	}
	@Override
	public String toString() {
		return super.toString()+
				this.salary+this.department+this.job;
	}

}
