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
		//Object��ü���� equals�� �������̵��ؼ� ��� Ŭ�������� �������ϳ�
		//instanceof�� ����ؼ� �Ű�����o�� Member������ �������ִٸ� �Ű�����o�� 
		//����� ����ȯ �Ŀ� m�̶�� ���Ÿ������ �����ϳ�
		//�׸��� ���Ѵ� ����� id�� �Ű������� ���� id���� ���ٸ� true�� ��ȯ
		//�ƴϸ� false�� ��ȯ
		if(o instanceof Member) {
		Member  m=(Member)o;
		if(this.id.equals(m.id)) {
			return true;
			}
		}
		return false;
	}
	//�ּҰ����� �����ִ� ���
	@Override
	public int hashCode() {
		return Objects.hash(id,name);
	}
	
	

}
