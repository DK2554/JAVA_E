package com.kh.moeol.vo;

public class Employee extends Person{
	private String department;
	private String job;
	private int salary;
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
	public int getSalary() {
		return salary;
	}
	public Employee(String name, int age, char gender, String department, String job, int salary) {
		super(name, age, gender);
		this.department = department;
		this.job = job;
		this.salary = salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(String department, String job, int salary) {
		super();
		this.department = department;
		this.job = job;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return super.toString()+ department + " " + job + " " + salary ;
	}

}
