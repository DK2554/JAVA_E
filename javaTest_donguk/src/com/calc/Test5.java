package com.calc;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.print("�Է� : ");
		int num=sc.nextInt();
		int num1=sc.nextInt();
		
		int num3=num*num1;
		if(num3%10==0) {
			System.out.println("���ڸ� �� �Դϴ�");
		}
		else {
			System.out.println("���ڸ� �� �Դϴ�.");
		}
		
	}

}
