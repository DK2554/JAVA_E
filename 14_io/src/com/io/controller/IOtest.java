package com.io.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOtest {
	public void fileTest() {
		//File 객체를 이용하면 파일을 생성,삭제 및 파일 정보확인을 할 수있다
		File f=new File("c:\\test\\a\\b\\test.txt");
		File dir=new File("c:\\test\\a\\b\\");
		//dir.mkdir();
		dir.mkdirs();
		//파일이 생기는것이 아님
		//파일이 생성하려면 createNewfile()메소드를 실행해야한다
		try {
			//파일은 무조건 exception처리를 해야함
			System.out.println(f.exists());
			if(!f.exists()) {//파일이 있는지 확인여부
				f.createNewFile();//파일을 생성하는것
			}
		
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(f.getAbsolutePath());
		
		
	}
	public void deletFile(String name) {
		File f=new File(name);
		if(f.exists())f.delete();
		
	}
	//파일 입출력하기(데이터전송,수신하기)
	public void fileoutputTest() {
		//파일을 저장하는 방법
		//1. Date를 저장할 파일 선청,생성하기
		//2. 파일과 연결되는 스트림을 생성(FileOutPutStream)
		//3. 생성된 스트림의 write()메소드를 이용해 byte단위로 전송
		//4. 전송이 종료되면 스트림 객체를 닫아줌.
		File f=new File("myfirstfile");//저장할 파일 선정,생성
		FileOutputStream fos=null;
		try {
			//스트림 생성
			fos=new FileOutputStream(f);
			//파일을 전송
			//write();
			char ch='A';
			String msg="숙제많이 주지마세요";
//			for(int i='A';i<='Z';i++) {
//				fos.write(i);
//			}
			fos.write(msg.getBytes());
		} catch (IOException e) {
			e.printStackTrace();//에러메세지를 보고위해서 생성
		}finally {
			try {
				fos.close();
			}catch(IOException e){
				e.printStackTrace();
			}
			
		}
	}
	public void fileinputStream() {
		//1.file객체생성 파일과 연결
		//2.스트림을 생성(FileInputStream)
		//3.스트림의 read()메소드를 이용해서 데이터 가져옴
		//4.스트림닫아주기
		File f=new File("myfirstfile");
		//try with resource
		try(FileInputStream fis=new FileInputStream(f)){
			//파일을 읽어옴
			int value=0;
//			while((value=fis.read())!=-1) {
//				System.out.println(value);
//			}
			byte[]b=new byte[(int)f.length()];
			fis.read(b);
			String msg=new String(b);
			System.out.println(msg);
		}catch(IOException e) {
			e.printStackTrace();//에러메세지 출력
		}
	}

}
