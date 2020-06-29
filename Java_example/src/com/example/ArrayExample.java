package com.example;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample {
	public void hellow() {
		Scanner sc = new Scanner(System.in);
		String[] str = new String[1];
		System.out.print("입력값 : ");
		str[0] = sc.nextLine();
		System.out.print("검색값 : ");
		char ch = sc.next().charAt(0);

		int count = 0;
		for (int i = 0; i < str[0].length(); i++) {
			char str2 = str[0].charAt(i);
			if (str[0].charAt(i) == ch) {
				count++;
			}
		}
		System.out.println("입력하신 문자열" + str[0] + "에서 찾으시는 문자 " + ch + "는" + count + "개 입니다.");

	}

	public void oddnumber() {
		Scanner sc = new Scanner(System.in);

		System.out.println("홀수인 정수 입력 : ");
		int nu1 = sc.nextInt();
		int[] num = new int[nu1];
		int var = num.length / 2;
		int temp;

		for (int i = 0; i < num.length; i++) {

			if (i <= num.length / 2) {
				num[i] = i + 1;
			} else if (i > num.length / 2) {
				for (int j = var; j < num.length; j++) {
					num[i] = (j - i) + 1;// 마지막값을 넣는다 j증가의 마지막값
				}

			}

		}
		System.out.println(num.length / 2);
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]);
		}
		System.out.println();

	}

	public void random() {
		int[] num = new int[6];
		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 45) + 1;
			for (int j = 0; j < i; j++) {

				if (num[i] == num[j]) {
					num[i]--;

				}

			}

		}
		Arrays.sort(num);
		System.out.println("============로또번호 출력=============");
		for (int i = 0; i < num.length; i++) {

			System.out.print(num[i]+".");
		}

	}

}
