package com.interfacetest.common;
//�������̽��� ����(���)�ϱ�
//�������̽��� ���� �� ���� implements���� ����� 
//���� public class Ŭ������ implements �������̽���
public class Functional implements Calculatorable {
	
	
	@Override
	public void calculator(int a ,int b) {
		
	}
	@Override
	public double calArea() {
		return 5*5*Math.PI;
		
	}
	
	public void calculator() {
		int su=100;
		int su2=100;
		System.out.println(su+su2);
	}

}
