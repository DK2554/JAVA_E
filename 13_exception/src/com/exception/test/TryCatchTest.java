package com.exception.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryCatchTest {

	public static void main(String[] args) {
		// 파일 입출력 checkException처리하기
		String path = TryCatchTest.class.getResource("./").getPath();
		File f = new File(path + "test.txt");
		FileInputStream fi = null;// handled가뜨면 무조건 try catch해야함
		try {
			fi = new FileInputStream(f);
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾지 못합니다");
			e.printStackTrace();
			return;
		} finally {
			// 가장많이 활용
			try {
				fi.close();
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			System.out.println("여기까지 실행하니?");
			// 예외가 발생해도 반드시 실행해야하는 구문작성
		}
		// try with resource 구문
		// try{에러가 발생할수동 있는 구문}catch(예외 이름 변수){처리 구문}finally-파일객체를 닫는 용도로 사용
		// try(닫아야하는 객체 생성구문){에러 발생이 예상되는 구문}catch(예외이름 변수){처리문}
		try (FileInputStream fis1=new FileInputStream(path+"text.txt")){
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
