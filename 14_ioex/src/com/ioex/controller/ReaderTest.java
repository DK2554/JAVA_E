package com.ioex.controller;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReaderTest {
	public void writeTest() {
		Scanner sc=new Scanner(System.in);
		//������ �Է�
		String msg="";
		while (true) {
			System.out.print("�Է� : ");
			String tem=sc.nextLine();
			if(tem.equals("0")) {
				break;
			}
			msg+=tem;
		}
		File f=new File("msg.txt");
		try(FileWriter fw=new FileWriter(f)){
			//���Ϸ� ���� �Է¹����� 
//			System.out.println("�޼��� �Է� : ");
//			String str=sc.nextLine();
			fw.write(msg);
		}catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	public void readTest() {
		File f=new File("msg.txt");
		String msg="";
		try(FileReader rw=new FileReader(f)){
			int value=0;
			while((value=rw.read())!=-1) {
				msg+=(char)value;
			}
			System.out.println(msg);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	

}
