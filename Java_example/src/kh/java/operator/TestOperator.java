package kh.java.operator;

import java.util.Scanner;

public class TestOperator {
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		int num2 = (num / 100) * 100;
		System.out.println("결과 : " + num2);
	}

	public void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("총 과일갯수 : ");
		int num1 = sc.nextInt();
		System.out.print("한바구니에 들어갈 과일 수 : ");
		int num2 = sc.nextInt();
		int num3 = 0;
		int num4 = 0;
		if (num1 % num2 != 0) {
			num4 = num1 % num2;
			num3 = (num1 / num2) + 1;
		} else {
			num3 = num1 / num2;
		}
		System.out.println("과일 갯수 : " + num1);
		System.out.println("바구니 과일수 : " + num2);
		System.out.printf("%d개의 과일을 담으려면 %d개가 필요합니다\n", num1, num3);
		System.out.println("마지막 바구니에 들어가는 과일에 갯수는 : " + num4);
	}

	public void test3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자를 하나 입력하시오 : ");
		char ch = sc.next().charAt(0);
		char ch2 = ' ';
		if (ch >= 65 && ch < 97) {
			ch2 = (char) (ch + 32);
		} else if (ch >= 97 && ch <= 122) {
			ch2 = (char) (ch - 32);
		}
		System.out.println("대문자는 소문자로 소문자는 대문자로");
		System.out.println(ch + "->" + ch2);
	}

	public void test4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자입력 : ");
		char ch = sc.next().charAt(0);

		int num = (int) ch;
		System.out.println(ch + " is unicode : " + num);
	}

}
