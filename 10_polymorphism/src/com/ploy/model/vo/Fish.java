package com.ploy.model.vo;

public class Fish extends Animal{
	private String color;

	

	public Fish(String color) {
		super();
		this.color = color;
	}

	public Fish(String name, String type, int life, double height, double weight, String color) {
		super(name, type, life, height, weight);
		this.color = color;
	}

	public Fish() {
		
	}

	

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Fish"+super.toString()+" "+color;
	}
	

}
