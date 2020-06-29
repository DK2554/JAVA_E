package com.inherit.model.vo;

public class Teacher extends Person {
	private String subject;
	private String major;
	
	public Teacher() {}
	public Teacher(String subject,String major) {
		
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	@Override
	public String toString() {
		return super.toString()+this.subject+this.major;
	}

}
