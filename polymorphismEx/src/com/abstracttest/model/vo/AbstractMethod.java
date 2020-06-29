package com.abstracttest.model.vo;

public abstract class AbstractMethod {
	//추상메소드
	//추상메소드란 	1.메소드 선언부에 abstract예약어가 있는 메소드
	//			2.메소드의 구현부가 없는 메소드
	
	public void generalMethodTest() {
		
	}
	//추상메소드는 
	public	abstract void abstractMethodTest();
	
	//추상메소드가 있는 클래스를 상속받데 되는 자식클래스(서브 클래스)는
	//추상메소드를 반드시 오버라이딩하여 재정의 해야함
	public abstract String combineStr(String a,String b);

}
