package com.oop.controller;

import com.oop.model.vo.Animal;
import com.oop.model.vo.Employee;
import com.oop.model.vo.ObjectTest;
import com.oop.model.vo.Person;
//import com.oop.model.vo.Person2;

public class ObjectUseController {
	public void useObjectTest() {
		// 객체를 이용하려면
		// 1. 객체를 생성해서 인스턴화(메모리 공간 확보)new 연산자를 통햐
		new Person();// 메모리공간에 Person을 만듬
		// new Person2();//접근 제한자에 따라 사용여부를 관리 할수 있다.
		// default로 선언된 클래스는 외부에서 아용할 수 없음!

		// 프로젝트에서 만든 클래스는 자료형으로 사용이 가능함
		// 자료형 변수명;
		Person p = new Person();// 변수 선언->참조형 변수 선언,heap에 있는 주소값을 저장하는 변수
		p.setNo(20);
		System.out.println(p.getNo());
		p = new Person();
		System.out.println(p.getNo());

		// 필드의 접근제한자 활용하기
		// 접근제한자는 필드에 직접접근이(객체변수.필드명) 가능여부를 말함.
		Employee em = new Employee();
		// System.out.println(em.department);
		//// System.out.println(em.name); //default는 같은 패키지 안에서만 실행가능
		// System.out.println(em.age);
		// em.department="강사부";
		// em.department="에어컨부";
		// System.out.println(em.department);
		System.out.println(em.getDepartment());
		em.setDepartment("에어컨부");
		System.out.println(em.getDepartment());
		// static으로 선언된 변수는
		// 클래스 변수라고 말하며,객체를 생성하지 않고 사용이 가능하다.
		// static을 사용하면 static 영역에 저장한다.
		// static사용방법 클래스이름.변수명
		Employee.empNo = 100;
		// 일반 필드는 접근이 불가능
		// Employee.name;
		// 접근제한자가 private인 static변수에 접근하기
		// Employee.empNo2=200;

		// final로 선언되 변수
		// em.EMP_NUMBERR=200;
	}

	public void initialBlockTest() {
		// 초기화블록에 대해 테스트 하기
		Animal am = new Animal();
		am.name = "개미핥기";
		System.out.println(am.category);
		System.out.println(am.gender);
		System.out.println(am.seosickge);
		System.out.println(am.name);
		System.out.println(am.year);
		System.out.println(am.aniNo);
		// System.out.println(Animal.aniNo);//static=클래스변수는 클래스이름.변수이름
		Animal b = new Animal();
		System.out.println(b.category);
		System.out.println(b.gender);
		System.out.println(b.seosickge);
		System.out.println(b.name);
		System.out.println(b.year);
		System.out.println(b.aniNo);
		Animal c = new Animal();
		c.name = "호랑이";
		c.category = "고양이과";
		c.seosickge = "백두산";
		System.out.println(c.category);
		System.out.println(c.gender);
		System.out.println(c.seosickge);
		System.out.println(c.name);
		System.out.println(c.year);
		System.out.println(c.aniNo);

		// am.aniNo = 500;// static 영역에서 변경시에는 static을 할당받은 변수 모두 값이 변한다
		// System.out.println(am.aniNo);
		// System.out.println(b.aniNo);
	}

	public void ot() {
		ObjectTest aa = new ObjectTest();// 객체 aa생성
		ObjectTest bb = new ObjectTest();// 객체 bb생성
		ObjectTest cc = new ObjectTest();// 객체 cc생성
		System.out.println(aa+":"+aa.name + aa.age + aa.money + aa.job + aa.religion + aa.height + aa.weight + aa.achive);
		System.out.println(bb+":"+bb.name + bb.age + bb.money + bb.job + bb.religion + bb.height + bb.weight + bb.achive);
		System.out.println(cc+":"+cc.name + cc.age + cc.money + cc.job + cc.religion + cc.height + cc.weight + cc.achive);
		
	}

}
