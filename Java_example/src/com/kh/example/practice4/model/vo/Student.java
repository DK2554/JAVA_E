package com.kh.example.practice4.model.vo;

public class Student {
	private int grade;
	private int classroom;
	private String name;
	private double height;
	private char gender;
	{
		grade = 90;
		classroom = 5;
		name = "ȫ�浿";
		height = 185.5;
		gender = '��';

	}

	public Student() {

	}
	public void information() {
		System.out.println(grade+""+classroom+""+name+""+height+""+gender);
	}

}
