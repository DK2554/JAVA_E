package com.substream.controller;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataSubstream {
	public void saveDate(String name,int age,char gender,double height) {
		//기본데이터 출력 보조 스트림 활용하기
		//보조스트림은 반드시 기본 스트림을 작성한 후 그 스트림을 이용해서 생성한다.
		FileOutputStream fos=null;
		DataOutputStream dos=null;
		try {
			//주 스트림
			fos=new FileOutputStream("data.du");
			//주 스트림을 이용해서 보조스트림을 연결한다
			//기본 자료형을 저장할 수 있게 하는 DataOutputStream을 이용하자
			//주스트림을 매개변수로 넣어 보조스트림을 생성!
			dos=new DataOutputStream(fos);
			//데이터보조스트림을 이용해 자료형별 저장하기
			//자료형별 write메소드가 있음
			dos.writeUTF(name);//파일에 String자료형으로 데이터를 저장한다
			dos.writeInt(age);
			dos.writeChar(gender);
			dos.writeDouble(height);
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				dos.close();	
			}catch(IOException e) {
				e.printStackTrace();

				}
			}
	}
	//Data스트림으로 저장된 파일 열기
	//파일을 저장한 스트림을 이용해서 불러와야함
	//DataOutputStream을 이용하여 입력한 data는 DataInputStream을 이용하여
	//데이터를 받아와야함.
	public void loadData() {
		//FileInputStream fis=null;
		//DataInputStream dis=null;
		try(FileInputStream fis=new FileInputStream("data.du");
				DataInputStream dis=new DataInputStream(fis)){
			//파일에서 DataStream으로 저장된 data를 불러올떄
			//저장한 순서대로 readXXX메소드를 이용한다
//			System.out.println(dis.readUTF());
//			System.out.println(dis.readInt());
//			System.out.println(dis.readChar());
//			System.out.println(dis.readDouble());
			//변수에 넣어 출력하기
			String name=dis.readUTF();
			int age=dis.readInt();
			char gender=dis.readChar();
			double height=dis.readDouble();
			
			System.out.println(name+" "+age+" "+gender+" "+height);
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
