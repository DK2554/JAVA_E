package com.io.controller;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DataInputOutput {
	//�̸�,����,����,Ű\
	
	public void writerData(String name,int age,char gender,double height) {
		//���� ���� ����
		//1. ���� ��ü ����
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
