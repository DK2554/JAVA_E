package com.abstracttest.model.vo;

public class AbstractChild extends AbstractTest{
	private String child;
	public AbstractChild() {
		// TODO Auto-generated constructor stub
	}
	public String getChild() {
		return child;
	}
	public void setChild(String child) {
		this.child = child;
	}
	public AbstractChild(String title, String child) {
		super(title);
		this.child = child;
	}
	
	
}
