package com.exception.test;

import java.io.IOException;

public class ThorowExceptionTest {

	public static void main(String[] args) {
		Throw t=new Throw();
		try {
			t.testA();
			//�����߻��� �ؿ� �ڵ�� �����ϰ� catch������ ���� �ڵ����
			System.out.println("�ȳ�");
		} catch (IOException e) {
			e.getMessage();//�����߻� �޼����� ��ȯ
			
			System.out.println("�����߻�");
		}	catch(Exception e) {
			e.getMessage();
		}
		System.out.println("�̰Ž����ϰ� ��!");

	}

}
