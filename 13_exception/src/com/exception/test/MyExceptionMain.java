package com.exception.test;

public class MyExceptionMain {
	public static void main(String[] args) {
		try {
			throw new MyException("���� ���ܹ߻�!");
		} catch (MyException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
}
