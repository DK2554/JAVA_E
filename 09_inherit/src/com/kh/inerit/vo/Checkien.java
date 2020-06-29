package com.kh.inerit.vo;

public class Checkien extends Animal {

	public Checkien() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Checkien(String name, int leg, String species) {
		super(name, leg, species);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String action() {
		// TODO Auto-generated method stub
		return "²¿³¢¿À~"+super.action()+"Ä¡Å²¸ÀÀÌ´Ù";
	}
	
}
