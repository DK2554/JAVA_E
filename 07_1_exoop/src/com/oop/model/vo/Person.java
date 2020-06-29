package com.oop.model.vo;

public class Person {
	
	//�ʵ�
	//����������
	private String name;
	private int age;
	private String address;
	private String  phone;
	
	
	//������
	public Person(){//�⺻������->�⺻������ heap������ ��ü�� �����ϴ°�
		
		
	}
	//�����͸� �ʱ�ȭ ��Ű�� �뵵�� ������->�Ű������� �ִ� ������
	public Person(String name,int age,String address,String phone) {
		this.name=name;
		this.age=age;
		this.address=address;
		this.phone=phone;
		
	}
	
	
	


	//�޼ҵ�
	//Ŭ������ ���ҿ� ���� �����ؾ��ϴ� ����� �����Ѱ�
	//data���� Ŭ���������� data�� ���, ����(����)�ϴ� ���
	//getter,setter�޼ҵ�
	//����������(public) ��ȯ��(�ڷ���) �޼ҵ��(�Ű�����)
	//�Ű����� �޼ҵ��� ����� ���� �� �� �ܺ�(ȣ���ϴ� ��)���� �޾ƾ��ϴ� ��
	public Person(String name) {
		this.name=name;
	}
	//name������ ����(���� ��������)�ϰ� ���ִ� ���(getter)
	//���� �ش�-����
	//���� �޴´� -�Ű�����
	public String getName() {
		return name;
	}
	//name������ ����(���� �ִ�)�ϰ� �ϴ� ���(setter)
	public void setName(String name) {
		this.name = name;
	}
	//age������ �����ϰ� ���ִ� ���
	//���� �ش� ����
	public int getAge() {
		return age;
	}
	//age������ �����ϰ� �ϴ� ���
	public void setAge(int age) {
		this.age = age;
	}
	//address������ �����ϰ� ���ִ� ���
	public String getAddress() {
		return address;
	}
	//address������ �����ϰ� �ϴ±��
	public void setAddress(String address) {
		this.address = address;
	}
	//phone������ ����
	public String getPhone() {
		return phone;
	}
	//phone������ ����
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	//��������� �ִ� ��簪�� ������ �� �ְ� ���ִ� �޼ҵ� �����? 
	public String allData() {
		return this.name+this.age+this.address+this.phone;
		
	}
	
}
