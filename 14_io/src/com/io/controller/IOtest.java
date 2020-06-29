package com.io.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOtest {
	public void fileTest() {
		//File ��ü�� �̿��ϸ� ������ ����,���� �� ���� ����Ȯ���� �� ���ִ�
		File f=new File("c:\\test\\a\\b\\test.txt");
		File dir=new File("c:\\test\\a\\b\\");
		//dir.mkdir();
		dir.mkdirs();
		//������ ����°��� �ƴ�
		//������ �����Ϸ��� createNewfile()�޼ҵ带 �����ؾ��Ѵ�
		try {
			//������ ������ exceptionó���� �ؾ���
			System.out.println(f.exists());
			if(!f.exists()) {//������ �ִ��� Ȯ�ο���
				f.createNewFile();//������ �����ϴ°�
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
	//���� ������ϱ�(����������,�����ϱ�)
	public void fileoutputTest() {
		//������ �����ϴ� ���
		//1. Date�� ������ ���� ��û,�����ϱ�
		//2. ���ϰ� ����Ǵ� ��Ʈ���� ����(FileOutPutStream)
		//3. ������ ��Ʈ���� write()�޼ҵ带 �̿��� byte������ ����
		//4. ������ ����Ǹ� ��Ʈ�� ��ü�� �ݾ���.
		File f=new File("myfirstfile");//������ ���� ����,����
		FileOutputStream fos=null;
		try {
			//��Ʈ�� ����
			fos=new FileOutputStream(f);
			//������ ����
			//write();
			char ch='A';
			String msg="�������� ����������";
//			for(int i='A';i<='Z';i++) {
//				fos.write(i);
//			}
			fos.write(msg.getBytes());
		} catch (IOException e) {
			e.printStackTrace();//�����޼����� �������ؼ� ����
		}finally {
			try {
				fos.close();
			}catch(IOException e){
				e.printStackTrace();
			}
			
		}
	}
	public void fileinputStream() {
		//1.file��ü���� ���ϰ� ����
		//2.��Ʈ���� ����(FileInputStream)
		//3.��Ʈ���� read()�޼ҵ带 �̿��ؼ� ������ ������
		//4.��Ʈ���ݾ��ֱ�
		File f=new File("myfirstfile");
		//try with resource
		try(FileInputStream fis=new FileInputStream(f)){
			//������ �о��
			int value=0;
//			while((value=fis.read())!=-1) {
//				System.out.println(value);
//			}
			byte[]b=new byte[(int)f.length()];
			fis.read(b);
			String msg=new String(b);
			System.out.println(msg);
		}catch(IOException e) {
			e.printStackTrace();//�����޼��� ���
		}
	}

}
