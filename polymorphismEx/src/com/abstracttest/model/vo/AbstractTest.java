package com.abstracttest.model.vo;
//�߻�Ŭ������ ������ ����ؼ� ����ϰ� ����

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
