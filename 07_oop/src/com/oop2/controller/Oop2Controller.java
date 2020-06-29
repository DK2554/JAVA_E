package com.oop2.controller;

import com.oop2.model.vo.Animal;
import com.oop2.model.vo.Info;
import com.oop2.model.vo.Person;

public class Oop2Controller {
	public void intialTest() {
		// 초기화블록, 선언과 동시에 초기화 테스트
	//	Person p = new Person();
		//System.out.println(p.getName());
		//System.out.println(p.getAge());
		Person p=new Person("김도환",29);
		System.out.println(p.getName());
		System.out.println(p.getAge());
		Person dh=new Person("이재형",27);
		System.out.println(dh.getName());
		System.out.println(dh.getAge());
		
		
		//생성자에 접근제한자를 변경하면 범위에 따라 객체생성이 제한됨;.
		//기본생성자를 자동생성하는 조건
		//클래스 내부에 생성자가 없어서야함!!
		Person bs=new Person();
		
		//animal 생성하기
		Animal dog=new Animal();
		Animal cat=new Animal("나비","고양이",3);
		Animal snack=new Animal("스르륵","파충류");
		
		
		Info a=new Info();
		Info b=new Info("유병승",19,"경기도 시흥시");
		Info c=new Info("온영석",32,"용인시",'남',100);
		System.out.println(a.getName()+a.getAge()+a.getAddress()+a.getGender()+a.getMoney());
		System.out.println(b.getName()+b.getAge()+b.getAddress());
		System.out.println(c.getName()+c.getAge()+c.getAddress()+c.getGender()+c.getMoney());
	}
}
