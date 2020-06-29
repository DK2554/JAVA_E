package com.exception.test;

import java.io.IOException;

public class ThorowExceptionTest {

	public static void main(String[] args) {
		Throw t=new Throw();
		try {
			t.testA();
			//오류발생시 밑에 코드는 무시하고 catch문으로 가서 코드실행
			System.out.println("안녕");
		} catch (IOException e) {
			e.getMessage();//에러발생 메세지를 반환
			
			System.out.println("에러발생");
		}	catch(Exception e) {
			e.getMessage();
		}
		System.out.println("이거실행하고 끝!");

	}

}
