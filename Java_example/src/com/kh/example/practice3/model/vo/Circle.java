package com.kh.example.practice3.model.vo;

public class Circle {
	private static  double pi=3.14;
	private static int radius=1;

	public Circle() {
	

	}

	public void incrementRadius() {
		Circle.radius++;

	}

	public void getAreaOfCircle() {
		System.out.println(2*pi*radius);

	}

	public void getSizeOfCircle() {
		System.out.println(pi*(radius*radius));
	}

	public double getPi() {
		return pi;
	}

	public void setPi(double pi) {
		Circle.pi = pi;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		Circle.radius = radius;
	}

}
