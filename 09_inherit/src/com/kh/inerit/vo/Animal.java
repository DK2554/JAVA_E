package com.kh.inerit.vo;



public class Animal {
	private String name;
	private int leg;
	private String species;
	
	public Animal() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLeg() {
		return leg;
	}

	public void setLeg(int leg) {
		this.leg = leg;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public Animal(String name, int leg, String species) {
		this.name = name;
		this.leg = leg;
		this.species = species;
	}
	public String action() {
		return "나는"+name+species+"동물이다";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	

}
