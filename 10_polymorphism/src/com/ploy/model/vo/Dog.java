package com.ploy.model.vo;

public class Dog extends Animal{
	private String bark;

	public String getBark() {
		return bark;
	}

	public Dog(String bark) {
		super();
		this.bark = bark;
	}

	public Dog(String name, String type, int life, double height, double weight, String bark) {
		super(name, type, life, height, weight);
		this.bark = bark;
	}

	public void setBark(String bark) {
		this.bark = bark;
	}
	public Dog() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "dog"+super.toString()+" "+bark;
	}
}
