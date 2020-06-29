package com.ploy.model.vo;

public class Car {
	private String model;
	private int year;
	private int displacement;
	private String  company;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getDisplacement() {
		return displacement;
	}

	public void setDisplacement(int displacement) {
		this.displacement = displacement;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public Car(String model, int year, int displacement, String company) {
		this.model = model;
		this.year = year;
		this.displacement = displacement;
		this.company = company;
	}
	
}
