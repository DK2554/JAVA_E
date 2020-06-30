package com.collection.model.vo;

public class Person implements Comparable<Person>{
	private String name;
	private int age;
	private String address;
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public Person(String name, int age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person)
		{
			Person p=(Person)obj;
			if(this.name.equals(p.name)
					&&this.age==p.age
					&&this.address.equals(p.address)) {
				return true;
			}
		}
		return false;
	}
	//compareto�� �������̵��ؼ�
	//person�� �̸����� ���������� �ϰڴ�
	@Override
	public int compareTo(Person p) {
		//�̸��� ��������
		//�������� String�϶� 
		//return this.name.compareTo(p.name);
		//��������
		//return p.name.compareTo(this.name);
		//���̸� ��������
		//return this.age-p.age;//�������� ����
		return p.age-this.age;//��������
	}
	
	

}
