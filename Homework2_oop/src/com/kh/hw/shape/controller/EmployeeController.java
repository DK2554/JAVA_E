package com.kh.hw.shape.controller;

import java.lang.reflect.Parameter;

import com.kh.hw.shape.model.vo.Employee;

public class EmployeeController {
	private Employee e = new Employee();

	public void add(int empNo, String name, char gender, String phone) {
		e.setEmpNo(empNo);
		e.setName(name);
		e.setGender(gender);
		e.setPhone(phone);

	}

	public void add(int empNo, String name, char gender, String phone, String dept, int salary, double bonus) {
		e.setEmpNo(empNo);
		e.setName(name);
		e.setGender(gender);
		e.setPhone(phone);
		e.setDept(dept);
		e.setSalary(salary);
		e.setBonus(bonus);
	}

	public void modify(String phone) {
		e.setPhone(phone);

	}

	public void modify(int salary) {
		e.setSalary(salary);

	}

	public void modify(double bonus) {
		e.setBonus(bonus);
	}

	public Employee remove() {
		e.setEmpNo(0);
		e.setName(null);
		e.setGender(' ');
		e.setDept(null);
		e.setPhone(null);
		e.setSalary(0);
		e.setBonus(0);
		return null;
	}

	public String inform() {
		e.getName();
		e.getBonus();
		e.getDept();
		e.getEmpNo();
		e.getGender();
		e.getPhone();
		e.getSalary();
		if (e.getName()!=null) {
			return e.printEmployee();
		} else {
			return null;
			
		}

	}

}
