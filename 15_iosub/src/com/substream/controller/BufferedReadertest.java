package com.substream.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReadertest {
	public static void main(String[] args) {
		//키보드로 입력한 값을 가져오는것
		//Scanner -> 스트림을 이용해서 데이터를 가져오는것(input)
		//BufferedReader을 이용해서 입력값 가져오기
		BufferedReader reader=null;
		
		reader =new BufferedReader(new InputStreamReader(System.in));
		System.out.print("데이터 입력 : ");
		//입력한 데이터를 무조건 문자열로 받아옴
		try {
			String inputData=reader.readLine();	
			System.out.println(inputData);
		}catch(IOException e) {
			e.printStackTrace();
		}
		try {
			reader.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
