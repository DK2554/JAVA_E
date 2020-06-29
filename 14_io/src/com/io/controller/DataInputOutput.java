package com.io.controller;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DataInputOutput {
	//이름,나이,성별,키\
	
	public void writerData(String name,int age,char gender,double height) {
		//파일 저장 순서
		//1. 파일 객체 생성
		File f=new File("dataFile.du");
		
		FileWriter fw=null;
		try {
			fw=new FileWriter(f);
			fw.write(name+",");
			fw.write(String.valueOf(age+","));
			fw.write(gender+",");
			fw.write(String.valueOf(height));
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fw.close();
				
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	public void readData() {
		File f=new File("dataFile.du");
		String data="";
		try(FileReader fr=new FileReader(f)) {
			int value=0;
			while((value=fr.read())!=-1) {
				data+=(char)value;
			}
			System.out.println(data);
			String[] dataes=data.split(",");
			String name=dataes[0];
			int age=Integer.parseInt(dataes[1]);
			char gender=dataes[2].charAt(0);
			double height=Double.parseDouble(dataes[3]);
		}catch(IOException e) {
			e.printStackTrace();
		}
				
	}


}
