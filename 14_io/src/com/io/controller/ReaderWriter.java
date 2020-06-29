package com.io.controller;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReaderWriter {
	//���ڿ��� �����ϰ� �����Ҷ� ����ϴ� ��ü
	public void writerTest() {
		//1.���� ����
		//2.��Ʈ������(Writer)����
		//3.��Ƽ������ ���ڿ� ����writer()�̿�
		//4.��Ʈ�� ����
		File f=new File("message");
		try(FileWriter fw=new FileWriter(f)){
			String msg="����� ������ ";
			fw.write(msg);
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	public void readerTest() {
		//1.file����
		//2.��Ʈ������(FileReader)
		//3.��Ʈ������ ������ �������� read()�޼ҵ� �̿�
		//4.��Ʈ���� �����Ŵ
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
