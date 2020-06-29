package com.oop.model.dto;

import java.util.Scanner;

public class Employee {
	private int empNo;
	private String empName;
	private String dept;
	private String job;
	private int age;
	private char gender;
	private int salary;
	private double bonusPoint;
	private String phone;
	private String address;

	public Employee() {

	}

	public Employee(int empNo, String empName, String dept, String job, int age, char gender, int salary,
			double bonusPoint, String phone,String address) {
		this.empNo = empNo;
		this.empName = empName;
		this.dept = dept;
		this.job = job;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
		this.bonusPoint = bonusPoint;
		this.phone = phone;
		this.address = address;

	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
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

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public double getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(double bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Employee empInput() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("사번  : ");
		this.setEmpNo(sc.nextInt());
		sc.nextLine();
		System.out.print("이름  : ");
		this.setEmpName(sc.nextLine());
		System.out.print("소속부서 : ");
		this.setDept(sc.nextLine());
		System.out.print("직급 : ");
		this.setJob(sc.nextLine());
		System.out.print("나이 : ");
		this.setAge(sc.nextInt());
		sc.nextLine();
		System.out.print("성별: ");
		this.setGender(sc.next().charAt(0));
		System.out.print("급여 : ");
		this.setSalary(sc.nextInt());
		System.out.print("보너스 포인트 : ");
		this.setBonusPoint(sc.nextDouble());
		System.out.print("핸드폰 번호 : ");
		sc.nextLine();
		this.setPhone(sc.nextLine());
		System.out.print("주소 : ");
		this.setAddress(sc.nextLine());
		return new Employee(empNo,empName,dept,job,age,gender,salary,bonusPoint,phone,address);
		 
	}

	public void empoutput() {
		System.out.println("=======회원 정보=========");

		System.out.println("사번\t이름\t소속부서\t직급\t나이\t성별\t급여\t보너스포인트\t핸드폰\t\t주소");
		System.out.println(this.getEmpNo() + "\t" + this.getEmpName() + "\t" + this.getDept() + "\t" + this.getJob()
				+ "\t" + this.getAge() + "\t" + this.getGender() + "\t" + this.getSalary() + "\t" + this.getBonusPoint()
				+"\t\t"+ this.getPhone() + "\t" + this.getAddress());
		

	}

}
