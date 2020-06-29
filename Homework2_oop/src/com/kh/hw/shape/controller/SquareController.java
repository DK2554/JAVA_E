package com.kh.hw.shape.controller;

import com.kh.hw.shape.model.vo.Shape;

public class SquareController {
	private Shape s=new Shape();
	
	public double calcPerimeter(double height,double width) {
		s.setType(4);
		s.setHeight(height);
		s.setWidht(width);
		return (width*2)+(height*2);
	}
	public double  calcArea(double height,double width) {
		s.setType(4);
		s.setHeight(height);
		s.setWidht(width);
		return width*height;
	}
	public void paint(String color) {
		s.setColor(color);
	}
	public String print() {
		return "»ç°¢Çü"+s.information();
	}
}
