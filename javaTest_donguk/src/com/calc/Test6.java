package com.calc;

import java.util.Scanner;

public class Test6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력번호 : ");

		int chio = sc.nextInt();
		boolean flag = false;
		// while (flag==true) {
		switch (chio) {
		case 1:
			System.out.println("**입력이 정상적으로 되었습니다**");
			break;

		case 2:
			System.out.println("**조회 정상적으로 되었습니다**");

			break;
		case 3:
			System.out.println("**수정이 정상적으로 되었습니다**");

			break;
		case 4:
			System.out.println("**삭제가 정상적으로 되었습니다**");

			break;
		case 5:
			System.out.println("** 정상적으로 종료되었습니다**");
			return;
		default:
			System.out.println("**다시 입력해 주세요**");
		

		}
		// }
	}

}
