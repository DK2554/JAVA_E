package com.oop2.model.vo;

public class Person {
	// 필드 선언
	private String name = "유병승";// 선언과 동시에 초기화
	private int age = 30;// 선언과 동시에 초기화

	{// 고정값
		name = "강승윤";
		age++;
	}

	// 기본생성자
	public Person() {
		System.out.println("Person생성");

	}

	// 객체를 생성할떄 사용=>생성자
	// 생성과 동시에 멤버변수(필드)에 값을 대입
	// 생성하면서 받은값으로.....
	// 매개변수가 있는 생성자를 이용한다.
	//생성자==클래스명 /생성자(이용할 매개변수를 선언)
	public Person(String name, int age) {
		//변수 초기화 
		this.age = age;//멤버변수에 매개변수(파라미터)를 대입한다
		this.name = name;

	}

	// 필드에 접근하기 위한 getter setter생성
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

}
