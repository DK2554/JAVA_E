package com.exception.test;

import java.io.IOException;

public class Throw {
	//�߻��� Exception�� ȣ���Ѱ����� ó���ϰ� ����.
	public void testA() throws Exception {
		//���ܸ� �߻���Ű���� throw ���� ���
		//Exception��ü�� �����ϸ� ��
		//throw new IOException();
		testB();
	}
	public void testB()throws Exception{
		testC();
	}
	public void testC() throws Exception  {
		throw new IOException("������������");
		
	}
}
