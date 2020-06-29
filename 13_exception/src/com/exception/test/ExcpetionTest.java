package com.exception.test;

import java.util.Date;

public class ExcpetionTest {

	public static void main(String[] args) {
		int a = 0;
		int b = 10;
//		try {
//			//System.out.println(b / a);// ArithmeticException발생!!
//
//		} catch (Exception e) {
//			System.out.println("값에 0이 있어서 계산이 안됩니다.");
//		}
		System.out.println("여기는 실행이 되는가??");
		//null관련 Exception
		String name=null;
		//System.out.println(name.charAt(0));
	
		
		//index관련
		//int[] nums=new int[-10];
			
		int[] nums=new int[3];
		System.out.println(nums[4]);
		
		//casting관련 exception;
		Object obj=new Date();
		String str=(String)obj;
	}


}
