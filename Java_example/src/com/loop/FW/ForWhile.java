package com.loop.FW;

import java.util.Scanner;

public class ForWhile {
	public void printstar1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수하나 입력 : ");
		int num = sc.nextInt();
		if (num > 0) {
			for (int i = 1; i <= num; i++) {// 횟수
				for (int j = 0; j < i; j++) {// 증가하면서 별찍기
					System.out.print("*");
				}
				System.out.println();
			}
		} else {
			System.out.println("양수가 아닙니다");
		}
	}

	public void printStart2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수하나 입력 : ");
		int num = sc.nextInt();
		if (num > 0) {
			for (int i = 0; i <num; i++) {// 횟수
				for (int j = 0; j <= i; j++) {// 증가하면서 별찍기
					System.out.print("*");
				}
				System.out.println();
			}
		} else if(num<0) {
			num=num*(-1);
			for (int i = 0; i < num; i++) {// 횟수
				for (int j = 0; j < i; j++) {// 증가하면서 별찍기
					System.out.print(" ");
				}
				for (int k = 0; k < num - i; k++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}else if(num==0) {
			System.out.println("출력기능이 없습니다.");
		}

	}

}
