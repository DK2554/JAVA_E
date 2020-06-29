package com.methodtest;

public class Product {
	// 필드
	private String productName;
	private int price;

	// 생성자를 생성

	public Product() {
		// 기본생성자
	}
	
	public Product(String name, int price) {
		productName = name;// 이름이 중복되지 않으면 this생략이 가능
		this.price = price;// 변수명이 중복되어 this생략할 수 없음

	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
