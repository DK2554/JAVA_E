package com.io.main;

import java.util.Scanner;

import com.io.controller.DataInputOutput;
import com.io.controller.IOtest;
import com.io.controller.ReaderWriter;

public class Main {
	public static void main(String[] args) {
		IOtest io=new IOtest();
		io.fileTest();
//		Scanner sc=new Scanner(System.in);
//		System.out.println("파일명 : ");
//		io.deletFile(sc.nextLine());
		//io.fileoutputTest();
		//io.fileinputStream();
		//문자열 전송 수신하기
		ReaderWriter rw=new ReaderWriter();
		//rw.writerTest();
		//rw.readerTest();
		
		DataInputOutput dio=new DataInputOutput();
		dio.writerData("유병승", 19, '남', 180.5);
		dio.readData();
	}
	


}
