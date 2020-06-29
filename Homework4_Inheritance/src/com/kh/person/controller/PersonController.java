package com.kh.person.controller;

import com.kh.hw.person.medel.vo.Employee;
import com.kh.hw.person.medel.vo.Person;
import com.kh.hw.person.medel.vo.Student;

public class PersonController {
	private Student[] s=new Student[3];
	private Employee[] e=new Employee[10];
	
	public int[] personCount() {
		Person[] count=new Person[2];
			
		return null;
	}
	public void insertStudent(String name,int age,double height,double weight,int grade,String major) {
		s[0]=new Student(name, age, height, weight, grade, major);
	}
	public Student[] printStudent() {
		return null;
	}
	public void insertEmployee(String name,int age,double weight,double height,int salary,String dept) {
		
	}
	public Employee[] printEmployee() {
		return null;
	}

}
