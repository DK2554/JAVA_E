package com.io.controller;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReaderWriter {
	//문자열을 전송하고 수신할때 사용하는 객체
	public void writerTest() {
		//1.파일 생성
		//2.스트림연결(Writer)생성
		//3.스티름으로 문자열 전송writer()이용
		//4.스트림 종료
		File f=new File("message");
		try(FileWriter fw=new FileWriter(f)){
			String msg="동욱아 힘내자 ";
			fw.write(msg);
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	public void readerTest() {
		//1.file생성
		//2.스트림생성(FileReader)
		//3.스트림에서 데이터 가져오기 read()메소드 이용
		//4.스트림을 종료시킴
		File fs=new File("message");
		try(FileReader fr=new FileReader(fs)){
			int value=0;
			while((value=fr.read())!=-1) {
				System.out.println((char)value);
			}
		}catch(IOException e){
			e.printStackTrace();
			
		}
	}
}
