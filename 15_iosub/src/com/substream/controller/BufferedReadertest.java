package com.substream.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReadertest {
	public static void main(String[] args) {
		//Ű����� �Է��� ���� �������°�
		//Scanner -> ��Ʈ���� �̿��ؼ� �����͸� �������°�(input)
		//BufferedReader�� �̿��ؼ� �Է°� ��������
		BufferedReader reader=null;
		
		reader =new BufferedReader(new InputStreamReader(System.in));
		System.out.print("������ �Է� : ");
		//�Է��� �����͸� ������ ���ڿ��� �޾ƿ�
		try {
			String inputData=reader.readLine();	
			System.out.println(inputData);
		}catch(IOException e) {
			e.printStackTrace();
		}
		try {
			reader.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
