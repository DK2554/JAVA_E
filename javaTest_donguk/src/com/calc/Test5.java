package com.calc;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.print("입력 : ");
		int num=sc.nextInt();
		int num1=sc.nextInt();
		
		int num3=num*num1;
		if(num3%10==0) {
			System.out.println("두자리 수 입니다");
		}
		else {
			System.out.println("한자리 수 입니다.");
		}
		
	}

}
