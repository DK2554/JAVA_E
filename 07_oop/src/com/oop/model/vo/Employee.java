package com.oop.model.vo;

public class Employee {
	
	//static 변수 이용하기
	public static int empNo;
	private static int empNo2;
	
	
	//final 클래스에서 상수로 사용하는 변수에 사용
	public final int EMP_NUMBERR=100000;
	
	
	
	// 멤버변수,필드 선언
	// 접근제한자를 생략하면 default로 설정, default-같은 패키지에서 접근 가능
	String name;
	// private 어떤곳에서도 접근을 허용하지 않음
	private int age;
	// protected 상속된 객체에서도 접근 가능 다른 패키지에 있는 객체에서는 접근 불가
	protected String address;
	// public 어디에서나 접근 가능한 객체
	private String department;

	String job;

	public void printTest() {
		System.out.println(age);
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		if (department.equals("강사부") || department.equals("연구부")) {
			this.department = department;
		} else {
			System.out.println("입력할수 없는 값입니다 다시 입력하세요");
		}

	}
}
