package com.kh.test.model.vo;

public class Circle {
	public double pi=Math.PI;
	private int radius;
	
	public Circle() {}
	public Circle(int radius) {
		this.radius=radius;
		
	}
	
	public double getPi() {
		return pi;
	}
	public void setPi(double pi) {
		this.pi = pi;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public void draw() {
		System.out.println("반지름이 "+radius+"Cm인 원 출력");
		
	}
	


}
