package com.kh.practice.point.model.vo;

public class Rectangle extends Circle {
	private int width;
	private int height;
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}
	
	public int getWidth() {
		return width;
	}
	public Rectangle(int x, int y, int radius, int width, int height) {
		super(x, y, radius);
		this.width = width;
		this.height = height;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+this.height+this.width;
	}
	
	

}
