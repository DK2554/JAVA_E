package com.oop.model.vo;

public class Person {
	
	//필드
	//접근제한자
	private String name;
	private int age;
	private String address;
	private String  phone;
	
	
	//생성자
	public Person(){//기본생성자->기본값으로 heap영역에 객체를 생성하는것
		
		
	}
	//데이터를 초기화 시키는 용도의 생성자->매개변수가 있는 생성자
	public Person(String name,int age,String address,String phone) {
		this.name=name;
		this.age=age;
		this.address=address;
		this.phone=phone;
		
	}
	
	
	


	//메소드
	//클래스의 역할에 따라 수행해야하는 기능을 정의한것
	//data보관 클래스에서는 data를 출력, 수정(대입)하는 기능
	//getter,setter메소드
	//접근제한자(public) 반환형(자료형) 메소드명(매개변수)
	//매개변수 메소드의 기능을 실행 할 때 외부(호줄하는 쪽)에서 받아야하는 값
	public Person(String name) {
		this.name=name;
	}
	//name변수에 접근(값을 가져가게)하게 해주는 기능(getter)
	//값을 준다-리턴
	//값을 받는다 -매개변수
	public String getName() {
		return name;
	}
	//name변수를 수정(값을 넣는)하게 하는 기능(setter)
	public void setName(String name) {
		this.name = name;
	}
	//age변수에 접근하게 해주는 기능
	//값을 준다 리턴
	public int getAge() {
		return age;
	}
	//age변수를 수정하게 하는 기능
	public void setAge(int age) {
		this.age = age;
	}
	//address변수에 접근하게 해주는 기능
	public String getAddress() {
		return address;
	}
	//address변수를 수정하게 하는기능
	public void setAddress(String address) {
		this.address = address;
	}
	//phone변수에 접근
	public String getPhone() {
		return phone;
	}
	//phone변수를 수정
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	//멤버변수에 있는 모든값을 가져갈 수 있게 해주는 메소드 만들기? 
	public String allData() {
		return this.name+this.age+this.address+this.phone;
		
	}
	
}
