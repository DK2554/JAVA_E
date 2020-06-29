package com.kh.inerit.vo;

public class Line extends Animal {

	public Line() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Line(String name, int leg, String species) {
		super(name, leg, species);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String action() {
		// TODO Auto-generated method stub
		return "Å©¾Æ¾Ó"+super.action();
	}

}
