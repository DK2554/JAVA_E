package com.generic.model.vo;

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
	public boolean equals(Object o) {
		//Object객체에서 equals를 오버라이딩해서 멤버 클래스에서 재정의하낟
		//instanceof를 사용해서 매개변수o가 Member변수랑 관련이있다면 매개변수o를 
		//멤버로 형변환 후에 m이라는 멤버타입으로 저장하낟
		//그리고 비교한다 멤버의 id와 매개변수로 받은 id값이 같다면 true를 반환
		//아니면 false를 반환
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
		return Objects.hash(id,name);
	}
	
	

}
