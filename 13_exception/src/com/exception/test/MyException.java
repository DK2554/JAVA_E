package com.exception.test;
//����Ŭ���� ��κ� �ڹٿ��� ������ �Ѵ�
//�ڽ� ������Ʈ���� ����� ������ Exception�� ���� �� ����
//���� Exceptin�� ExceptionŬ������  ��� �޾� ����� �ִ�
//ExceptionŬ������ ��ӹ����� �� Ŭ������ ���� Ŭ����
public class MyException extends Exception{
	public MyException() {
		
	}
	public MyException(String ec) {
		super(ec);
	}
}
