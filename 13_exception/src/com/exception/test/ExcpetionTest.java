package com.exception.test;

import java.util.Date;

public class ExcpetionTest {

	public static void main(String[] args) {
		int a = 0;
		int b = 10;
//		try {
//			//System.out.println(b / a);// ArithmeticException�߻�!!
//
//		} catch (Exception e) {
//			System.out.println("���� 0�� �־ ����� �ȵ˴ϴ�.");
//		}
		System.out.println("����� ������ �Ǵ°�??");
		//null���� Exception
		String name=null;
		//System.out.println(name.charAt(0));
	
		
		//index����
		//int[] nums=new int[-10];
			
		int[] nums=new int[3];
		System.out.println(nums[4]);
		
		//casting���� exception;
		Object obj=new Date();
		String str=(String)obj;
	}


}
