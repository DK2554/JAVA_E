package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하시오 : ");
		int num = sc.nextInt();
		if (num < 1) {
			System.out.println("1이상의 숫자를 입력해주세여");
		}

		for (int i = 1; i <= num; i++) {

			System.out.print(" " + (i));
		}
	}

	public void practice2() {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 입력하시오 : ");
		int num = sc.nextInt();
		if (num < 1) {
			System.out.println("1이상의 숫자를 입력해주세여");
			System.out.print("1이상의 숫자를 입력하시오 : ");
			num = sc.nextInt();
		}

		for (int i = 1; i <= num; i++) {

			System.out.print(" " + (i));
		}
	}

	public void practice3() {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 입력하시오 : ");
		int num = sc.nextInt();
		if (num < 1) {
			System.out.println("1이상의 숫자를 입력해주세여");
		}

		for (int i = num; i > 0; i--) {

			System.out.print(" " + (i));
		}
	}

	public void practice4() {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 입력하시오 : ");
		int num = sc.nextInt();
		if (num < 1) {
			System.out.println("1이상의 숫자를 입력해주세여");
			System.out.print("1이상의 숫자를 입력하시오 : ");
			num = sc.nextInt();
		}

		for (int i = num; i > 0; i--) {

			System.out.print(" " + (i));
		}
	}

	public void practice5() {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 입력하시오 : ");
		int num = sc.nextInt();
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (i == num) {
				System.out.print(i);
				System.out.print("=");
				count += num;
				break;
			}
			System.out.print(i);
			count += i;
			System.out.print("+");
		}
		System.out.print(count);
	}

	public void practice6() {
		Scanner sc = new Scanner(System.in);

		System.out.print("첫 번째 숫자 : ");
		int num = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		if (num < 1 || num2 < 1) {
			System.out.println("1이상의 숫자를 입력해주세여");
			return;
		}
		int start = 0;
		int temp;
		if (num > num2) {
			start = num2;
			temp = num;
		} else {
			start = num;
			temp = num2;
		}

		for (int i = start; i <= temp; i++) {

			System.out.print(" " + (i));
		}
	}

	public void practice7() {
		Scanner sc = new Scanner(System.in);

		System.out.print("첫 번째 숫자 : ");
		int num = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		if (num < 1 || num2 < 1) {
			System.out.println("1이상의 숫자를 입력해주세여");
			System.out.print("첫 번째 숫자 : ");
			num = sc.nextInt();
			System.out.print("두 번째 숫자 : ");
			num2 = sc.nextInt();
		}
		int start = 0;
		int temp;
		if (num > num2) {
			start = num2;
			temp = num;
		} else {
			start = num;
			temp = num2;
		}

		for (int i = start; i <= temp; i++) {

			System.out.print(" " + (i));
		}
	}

	public void gogodan() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자  :");
		int num = sc.nextInt();
		System.out.printf("====%d단======\n", num);
		for (int i = 1; i <= 9; i++) {

			System.out.println(num + " * " + i + " = " + num * i);

		}
	}

	public void gogodan2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자  :");
		int num = sc.nextInt();
		if (num > 9) {
			System.out.println("9 이하의 숫자만 입력해주세요");
			System.out.print("숫자  :");
			num = sc.nextInt();
		}

		for (int i = num; i <= 9; i++) {

			System.out.printf("====%d단======\n", i);
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}

		}
	}
	public void practice11() {
		Scanner sc=new Scanner(System.in);
		System.out.print("시작 숫자 : ");
		int num=sc.nextInt();
		System.out.print("공차");
		int num2=sc.nextInt();
		int sum;
		int i=0;
		while(i<10) {
			System.out.print(num+" ");
			num=num+num2;
			i++;
		}
	}
	public void practice12() {
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.print("연산자(+,-,*,/,% ) : ");
	
			String ch=sc.nextLine();
			if(ch.equals("exit")) {
				System.out.println("프로그램을 종료합니다");
				return;
			}
			System.out.print("정수1 : ");
			int num=sc.nextInt();
			System.out.print("정수2: ");
			int num2=sc.nextInt();
			if(num<=0||num2<=0) {
				System.out.println("0으로 나눌 수 없습니다.");
			}
			switch(ch) {
			case "+": System.out.printf("%d + %d = %d\n",num,num2,num+num2);sc.nextLine();break;
			case "-": System.out.printf("%d - %d = %d\n",num,num2,num-num2);sc.nextLine();break;
			case "*": System.out.printf("%d * %d = %d\n",num,num2,num*num2);sc.nextLine();break;
			case "/": System.out.printf("%d / %d = %d\n",num,num2,num/num2);sc.nextLine();break;
			case "%": System.out.printf("%d %% %d = %d\n",num,num2,num%num2);sc.nextLine();break;
			default: System.out.println("없는 연산자입니다 다시입력해주세요");sc.nextLine();break;
			}
			
		}
	}
	public void practice13() {
		Scanner sc=new Scanner(System.in);
		System.out.print("정수입력 : ");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void practice14() {
		Scanner sc=new Scanner(System.in);
		System.out.print("정수입력 : ");
		int num=sc.nextInt();
		for(int i=0;i<=num;i++)
		{
			for(int j=0;j<num-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
