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
		
		System.out.print("���  : ");
		this.setEmpNo(sc.nextInt());
		sc.nextLine();
		System.out.print("�̸�  : ");
		this.setEmpName(sc.nextLine());
		System.out.print("�ҼӺμ� : ");
		this.setDept(sc.nextLine());
		System.out.print("���� : ");
		this.setJob(sc.nextLine());
		System.out.print("���� : ");
		this.setAge(sc.nextInt());
		sc.nextLine();
		System.out.print("����: ");
		this.setGender(sc.next().charAt(0));
		System.out.print("�޿� : ");
		this.setSalary(sc.nextInt());
		System.out.print("���ʽ� ����Ʈ : ");
		this.setBonusPoint(sc.nextDouble());
		System.out.print("�ڵ��� ��ȣ : ");
		sc.nextLine();
		this.setPhone(sc.nextLine());
		System.out.print("�ּ� : ");
		this.setAddress(sc.nextLine());
		return new Employee(empNo,empName,dept,job,age,gender,salary,bonusPoint,phone,address);
		 
	}

	public void empoutput() {
		System.out.println("=======ȸ�� ����=========");

		System.out.println("���\t�̸�\t�ҼӺμ�\t����\t����\t����\t�޿�\t���ʽ�����Ʈ\t�ڵ���\t\t�ּ�");
		System.out.println(this.getEmpNo() + "\t" + this.getEmpName() + "\t" + this.getDept() + "\t" + this.getJob()
				+ "\t" + this.getAge() + "\t" + this.getGender() + "\t" + this.getSalary() + "\t" + this.getBonusPoint()
				+"\t\t"+ this.getPhone() + "\t" + this.getAddress());
		

	}

}
