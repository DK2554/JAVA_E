package com.substream.controller;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataSubstream {
	public void saveDate(String name,int age,char gender,double height) {
		//�⺻������ ��� ���� ��Ʈ�� Ȱ���ϱ�
		//������Ʈ���� �ݵ�� �⺻ ��Ʈ���� �ۼ��� �� �� ��Ʈ���� �̿��ؼ� �����Ѵ�.
		FileOutputStream fos=null;
		DataOutputStream dos=null;
		try {
			//�� ��Ʈ��
			fos=new FileOutputStream("data.du");
			//�� ��Ʈ���� �̿��ؼ� ������Ʈ���� �����Ѵ�
			//�⺻ �ڷ����� ������ �� �ְ� �ϴ� DataOutputStream�� �̿�����
			//�ֽ�Ʈ���� �Ű������� �־� ������Ʈ���� ����!
			dos=new DataOutputStream(fos);
			//�����ͺ�����Ʈ���� �̿��� �ڷ����� �����ϱ�
			//�ڷ����� write�޼ҵ尡 ����
			dos.writeUTF(name);//���Ͽ� String�ڷ������� �����͸� �����Ѵ�
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
	//Data��Ʈ������ ����� ���� ����
	//������ ������ ��Ʈ���� �̿��ؼ� �ҷ��;���
	//DataOutputStream�� �̿��Ͽ� �Է��� data�� DataInputStream�� �̿��Ͽ�
	//�����͸� �޾ƿ;���.
	public void loadData() {
		//FileInputStream fis=null;
		//DataInputStream dis=null;
		try(FileInputStream fis=new FileInputStream("data.du");
				DataInputStream dis=new DataInputStream(fis)){
			//���Ͽ��� DataStream���� ����� data�� �ҷ��Ë�
			//������ ������� readXXX�޼ҵ带 �̿��Ѵ�
//			System.out.println(dis.readUTF());
//			System.out.println(dis.readInt());
//			System.out.println(dis.readChar());
//			System.out.println(dis.readDouble());
			//������ �־� ����ϱ�
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
