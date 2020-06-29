package com.kh.hw.shape.controller;



import com.kh.hw.shape.model.vo.Shape;

public class TriangleController {
	private Shape s=new Shape();
	public double  calcArea(double height,double width) {
		s.setType(3);
		s.setHeight(height);
		s.setWidht(width);
		return (width*height)/2;
	}
	public void paint(String color) {
		s.setColor(color);
		
	}
	public String print() {
		return "»ï°¢Çü"+s.information();
	}
}
