package com.oop2.method;

import java.util.Scanner;

public class Method2 {
	// 문자열을 더할 메소드를 생성한다
	// public 접근한정자 String자료형으로 plus()라는 이름을 가지는 메소드를 생성
	// return값은 있는 형태로 생성

	public String plus() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		System.out.print("문자열 입력 : ");
		String str2 = sc.nextLine();
		// 문자열을 입력받아서 hap이라는 문자열에 대입한다
		String hap = str + str2;
		// 입력받은 hap을 리턴으로 메소드 출력 위치에 보낸다

		return hap;

	}
	// 정수두개를 매개변수로 입력받아서 합을 리턴해주는 메소드
	// 만약 수가 작으면 에러 출력

	public int plus2(int nu1, int nu2) {
		// 첫번째 값이 두번째 값보다 작을시 에러를 출력

		if (nu1 < nu2) {
			System.out.println("에러!!");

		}
		
		// 두수의 합을 담을 공간인 hap을 선언한다

		int hap = 0;
		// 두번째 수부터 첫번째 수까지 의 합을 더해서 hap변수에 저장한다 (누적으로)
		for (int i = nu2; i < nu1; i++) {
			hap += i;
		}
		return hap;

	}
	// 하나의 문자를 입력받아서 그문자가 영문자인지 확인하는 메소드
	// 영문자를 아스키 코드값이랑 비교해 그값보다 작거나 크면 영문자가 아니다
	// 매개변수로 입력받는다

	public boolean tandf(char ch) {
		boolean flag = false;
		if (ch >= 65 && ch <= 90 || ch <= 122 && ch >= 97) {
			flag = true;

		} else {
			flag = false;
		}

		return flag;

	}
}
