package com.string.test;

public class WeapperTest {

	public static void main(String[] args) {
		//wrapperŬ���� Ȱ���ϱ�
		int age=10;
		Integer test;//�⺻ int���ڷ����� ǥ���ϴ� ��ü
		test=age;;//int���� �ڵ����� Integer��ü�� ��ȯ�Ͽ� �־��� ����ڽ�
		Object obj=test;
		obj=test;//�⺻�ڷ����� Interger��ü�� �����ؼ� �Ѱ��ֱ� ������ ����ڽ�
		System.out.println(obj instanceof Integer);
		//��ü������ �ڵ�����ȯ�� �Ұ����ϴ�.
		
		//Integer���� Double�� ������ ���ִ°�?

		//������ ����Ʈ�ܿ��� ������ �����ϸ� ��絥���ʹ� String���� �Ѿ��
		int age1=Integer.parseInt("19");
		//Intrger���� Ȱ���� �� �ִ� ����
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		//�ٸ� �ڷ����� String���� �����ϴ� ���
		//test�� ���������� �����ϱ�
		String convertInteger=String.valueOf(test);
		System.out.println(convertInteger);
		
		
		//WrapperŬ������ �⺻�� ����ó���� ������
		Integer su=10;
		Double su2=3.14;
		System.out.println(su+su2);
		int intSu=su;
		double doubleSu2=su2;
		System.out.println(intSu*doubleSu2);

	}

}
