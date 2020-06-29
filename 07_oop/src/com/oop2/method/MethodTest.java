package com.oop2.method;

import java.util.Scanner;

//기능제공용 클래스
public class MethodTest {

	// 계산기 기능을 하는 메소드 만들기
	// 반환형이 없고 매개변수가 있는 메소드
	public void calculator(int su1, int su2, char op) {
		// 계산하는 기능만 처리
		double result = 0;
		switch (op) {
		case '+':
			result = su1 + su2;
			break;
		case '-':
			result = su1 - su2;
			break;
		case '*':
			result = su1 * su2;
			break;
		case '/':
			result = su1 / (double) su2;
			break;
		case '%':
			result = su1 % su2;
			break;
		}
		System.out.println("" + su1 + op + su2 + "=" + result);

	}

	// 반환형이 있고 매개변수가 있는 계산기
	public double calculator2(int su1, int su2, char op) {

		double result = 0;
		switch (op) {
		case '+':
			result = su1 + su2;
			break;
		case '-':
			result = su1 - su2;
			break;
		case '*':
			result = su1 * su2;
			break;
		case '/':
			result = su1 / (double) su2;
			break;
		case '%':
			result = su1 % su2;
			break;
		}
		// 메소드에 반환형이 있으면 반드시 return예약어를 사용해야함
		// return : return 반환형의 리터럴이나 변수를 작성
		System.out.println(result);
		return result;

	}

	// 매개변수가 없고 반환형이 있는 계산기
	public double calculator3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int su = sc.nextInt();
		System.out.print("정수 입력 : ");
		int su2 = sc.nextInt();
		System.out.print("연산자  : ");
		double result = 0;
		switch (sc.next().charAt(0)) {
		case '+':
			result = su + su2;
			break;
		case '-':
			result = su - su2;
			break;
		case '*':
			result = su * su2;
			break;
		case '/':
			result = su / (double) su2;
			break;
		case '%':
			result = su % su2;
			break;
		}
		//return은 하나의 값만 저장가능
		return result;

	}

}
