package com.collectioc.model.vo;

import java.util.Objects;

public class Member {
	private String id;
	private String pw;
	private String name;
	private char gender;
	
	
	
	public Member() {
		// TODO Auto-generated constructor stub
	}
	public Member(String id, String pw, String name, char gender) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.gender = gender;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return "Member [id=" + id + ", pw=" + pw + ", name=" + name + ", gender=" + gender + "]";
	}
	@Override
	//특정 조건으로 특정값을 불러올때
	public boolean equals(Object o) {
		if(o instanceof Member) {
		Member  m=(Member)o;
		if(this.id.equals(m.id)) {
			return true;
			}
		}
		return false;
	}
	//주소값까지 맞춰주는 기능
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(id,name);
	}

	
	

}
