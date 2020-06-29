package com.exception.test;

import java.io.IOException;

public class Throw {
	//발생한 Exception을 호출한곳에서 처리하게 만듬.
	public void testA() throws Exception {
		//예외를 발생시키려면 throw 예약어를 사용
		//Exception객체를 생성하면 됨
		//throw new IOException();
		testB();
	}
	public void testB()throws Exception{
		testC();
	}
	public void testC() throws Exception  {
		throw new IOException("에러에러에러");
		
	}
}
