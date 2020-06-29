package com.ploy.model.vo;

public class Animal {
	private String name;
	private String type;
	private int life;
	private double height;
	private double weight;
	
	public Animal() {
		
	}
	//alt+s+a 전체 멤버변수를 매개변수로 사용하는 생성자 단축키
	public Animal(String name, String type, int life, double height, double weight) {
		super();
		this.name = name;
		this.type = type;
		this.life = life;
		this.height = height;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		return "animal"+name+" "+type+" "+life+" "+height+" "+weight;
	}
	
	
}
