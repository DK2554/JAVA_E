package com.abstracttest.main;

import com.abstracttest.model.vo.AbstractChild;
import com.abstracttest.model.vo.AbstractTest;

public class AbstractMain {

	public static void main(String[] args) {
		
		//AbstractTest test = new AbstractTest();
		
		AbstractChild child=new AbstractChild("자식에서 생성","나야나");
		System.out.println(child.getChild());
		System.out.println(child.getTitle());
		 //추상클래스는 타입으로 활용이 가능
		//추상클래스는 무조건 상속받은 객체가 존재함
		//추상클래스는 무조건 어떤 객체의 부모가 됨
		AbstractTest ab=new AbstractChild();
		//ab.getChild()//자식객체에 접근이 불가능
		ab.getTitle();
		//추상메소드가 있는 클래스는 반드시
		
	}

}
