package com.kh.inerit.vo;

public class Cat extends Animal {
	
	public Cat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cat(String name, int leg, String species) {
		super(name, leg, species);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String action() {
		// TODO Auto-generated method stub
		return "¾ß¿Ë"+super.action();
	}
	
	
	
	

}
