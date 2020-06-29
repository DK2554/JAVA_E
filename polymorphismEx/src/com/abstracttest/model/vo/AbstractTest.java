package com.abstracttest.model.vo;
//추상클래스는 무조건 상속해서 사용하게 설정

public abstract class AbstractTest {
	private String title;
	public AbstractTest() {
		// TODO Auto-generated constructor stub
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public AbstractTest(String title) {
		this.title = title;
	}

}
