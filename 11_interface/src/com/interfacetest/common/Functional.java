package com.interfacetest.common;
//인터페이스를 구현(상속)하기
//인터페이스를 구현 할 때는 implements예약어를 사용함 
//예시 public class 클래스명 implements 인터페이스명
public class Functional implements Calculatorable {
	
	
	@Override
	public void calculator(int a ,int b) {
		
	}
	@Override
	public double calArea() {
		return 5*5*Math.PI;
		
	}
	
	public void calculator() {
		int su=100;
		int su2=100;
		System.out.println(su+su2);
	}

}
