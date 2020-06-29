package com.exception.test;
//예외클래스 대부분 자바에서 제공을 한다
//자신 프로젝트에서 사용할 나만의 Exception을 만들 수 있음
//나의 Exceptin은 Exception클래스를  상속 받아 만들수 있다
//Exception클래스를 상속받으면 그 클래스는 예외 클래스
public class MyException extends Exception{
	public MyException() {
		
	}
	public MyException(String ec) {
		super(ec);
	}
}
