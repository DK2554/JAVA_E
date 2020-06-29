package test.operator;

import java.util.Scanner;

public class Example {
	public void sample1() {
		Scanner sc = new Scanner(System.in);

		System.out.print("국어성적 입력: ");
		int ko = sc.nextInt();
		System.out.print("영어성적 입력: ");
		int en = sc.nextInt();
		System.out.print("수학성적 입력: ");
		int ma = sc.nextInt();
		int sum = ko + en + ma;
		double hvg = sum / 3.0;

		if (hvg >= 60) {
			if (ko >= 40 && en >= 40 && ma >= 40) {
				System.out.println("합격입니다");
			} else {
				System.out.println("불합격입니다");
			}
		} else {
			System.out.println("불합격입니다.");
		}

	}

	public void sample2() {
		Scanner sc = new Scanner(System.in);
		String name = " ";
		int num = 0;
		int ban = 0;
		int number = 0;
		char gender = ' ';
		double score = 0.0;
		String gender2 = "";
		System.out.print("학생이름 : ");
		name = sc.nextLine();

		System.out.print("학년 : ");
		num = sc.nextInt();
		System.out.print("반 : ");
		ban = sc.nextInt();
		System.out.print("번호 : ");
		number = sc.nextInt();
		System.out.print("성별 : ");
		gender = sc.next().charAt(0);
		System.out.print("성적 : ");
		score = sc.nextDouble();
		if (gender == 'M') {
			gender2 = "남학생";
		} else {
			gender2 = "여학생";
		}
		System.out.printf("%d학년 %d반 %d번 %s %s은 성적이 %.2f이다", num, ban, number, gender2, name, score);

	}

	public void sample3() {
		Scanner sc = new Scanner(System.in);
		int nu1 = 0;
		System.out.print("정수를 입력하시오 : ");
		nu1 = sc.nextInt();
		if (nu1 > 0) {
			System.out.println("양수입니다");
		} else {
			System.out.println("양수가 아니다");
		}
	}

	public void sample4() {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		String str = "";
		System.out.print("정수 하나를 입력하시오 : ");
		num = sc.nextInt();
		if (num % 2 == 0) {
			str = "짝수다";
		} else {
			str = "홀수다";
		}

		System.out.println(str);
	}
}
