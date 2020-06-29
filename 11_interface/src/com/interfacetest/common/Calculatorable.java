package com.interfacetest.common;

public interface Calculatorable {
	//인터페이스는 기능 구현을 강제하는 기능을 하는 객체
	//인터페이스를 구현(상속)하는 객체는 인터페이스에 작성된
	//모든 메소드를 재정의(오버라이딩)해야함
	
	//인터페이스에 정의되는 메소드는 모든것이 추상메소드임!
	//선언부만 작성하여 정의 해야함
	public abstract void calculator(int a,int b);
	
	//기본적으로 인터페이스에 잇는 메소드는 모두 public abstract이기때문에
	//작성하지 않아도 묵시적으로 선언됨.
	
	double calArea();
	
	

}
