package com.string.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateTest {
	public static void main(String[] args) {
		//��¥ Ȱ���ϱ�
		//���� ��¥ ���
		Date today=new Date();
		System.out.println(today);
		Date day=new Date(1111196543578L);//�Ű����� �ִ� ������
		System.out.println(day);
		//��¥�� ǥ���Ҷ��� Data���� Calendar GregorianCalender���
		//Calendar����ϱ�
		//Calendar�� new�����ڸ� �������� �ʰ� �����Ȱ��� �����´�
		//Calendar�� �����ڰ� ���������ڰ� protected�� �Ǿ��־�ÿܺο��� ������ �̿��� �Ұ�����
		//getInstace()�޼ҵ带 �̿��ؼ� ��ü�� ������
		Calendar day2=Calendar.getInstance();
		System.out.println(day2.get(Calendar.YEAR));//�⵵
		System.out.println(day2.get(Calendar.MONTH)+1);
		//���� ����Ҷ� ���� ����!!!!
		//���� �ε����� ���������� 0���� ������.-1��
		System.out.println(day2.get(Calendar.DATE));
		System.out.println(day2.get(Calendar.YEAR)+"��"+(day2.get(Calendar.MONTH)+1)+"��"+day2.get(Calendar.DATE)+"��");
		today=new Date(day2.getTimeInMillis());
		System.out.println(today);
		//Calendar�� ���ϴ� ��¥ �����ϱ�
		
		day2.set(1994,12-1,31);
		System.out.println(new Date(day2.getTimeInMillis()));
		
		GregorianCalendar birthday=new GregorianCalendar(1989,(7-1),18);
		System.out.println(birthday.get(Calendar.MONTH)+1);
		System.out.println(new Date(birthday.getTimeInMillis()));
		
		//��¥�� ��ư���� ǥ���ϴ� ��ü�� �̿��ؼ� ���ϴ� ������� ����ϱ�
		//SimpleDateFormat��ü �̿�
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy��-MM��-dd��");
		String day3=sdf.format(new Date(birthday.getTimeInMillis()));
		System.out.println(day3);
	}
}
