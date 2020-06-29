package com.exception.test;

public class MyExceptionMain {
	public static void main(String[] args) {
		try {
			throw new MyException("나의 예외발생!");
		} catch (MyException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
}
