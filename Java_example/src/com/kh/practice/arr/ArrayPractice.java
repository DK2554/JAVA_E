package com.kh.practice.arr;

import java.util.Scanner;

public class ArrayPractice {
	public void practice1() {
		int[] num = new int[10];
		for (int i = 0; i < num.length; i++) {
			num[i] = i + 1;
		}
		for (int i = 0; i < num.length; i++) {
			System.out.print(" " + num[i]);
		}
	}

	public void practice2() {
		int[] num = new int[10];
		for (int i = 0; i < num.length; i++) {
			num[i] = i + 1;
		}
		for (int i = 9; i <= num.length; i--) {
			if (i < 0) {
				return;
			}
			System.out.print(" " + num[i]);

		}
	}

	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 : ");
		int num = sc.nextInt();
		int[] arr = new int[num];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
	}

	public void practice4() {
		String[] str = { "사과", "귤", "포도", "복숭아", "참외" };
		System.out.println(str[1]);
	}

	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String arr = sc.nextLine();
		char[] array = new char[arr.length()];
		System.out.print("찾을 문자 입력 : ");
		char ch = sc.next().charAt(0);
		String k = "";
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			array[i] = arr.charAt(i);
			if (array[i] == ch) {
				count++;
				k = k + i + " ";
			}

		}
		System.out.println(arr + "에 " + ch + "가 존재하는 위치(인덱스): " + k);
		System.out.println(ch + " 개수  : " + count);
	}

	public void practice6() {
		Scanner sc = new Scanner(System.in);
		String[] month = { "월", "화", "수", "목", "금", "토", "일" };
		System.out.print("0~6사이 숫자 입력 : ");
		int num = sc.nextInt();

		switch (num) {
		case 0:
			System.out.println(month[0] + "요일");
			break;
		case 1:
			System.out.println(month[1] + "요일");
			break;
		case 2:
			System.out.println(month[2] + "요일");
			break;
		case 3:
			System.out.println(month[3] + "요일");
			break;
		case 4:
			System.out.println(month[4] + "요일");
			break;
		case 5:
			System.out.println(month[5] + "요일");
			break;
		case 6:
			System.out.println(month[6] + "요일");
			break;
		default:
			System.out.println("잘못 입력하셧씁니다");

		}

	}

	public void practice7() {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int su1 = sc.nextInt();
		int[] num = new int[su1];
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			System.out.print("배열" + i + "번째 인덱스에 넣을값 : ");
			num[i] = sc.nextInt();
			sum += num[i];
		}
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");

		}
		System.out.println("");
		System.out.println("총합 : " + sum);
	}

	public void practice8() {
		Scanner sc = new Scanner(System.in);

		System.out.print("홀수인 정수 입력 : ");
		int nu1 = sc.nextInt();
		if (nu1 % 2 != 1 && nu1 < 3) {
			while (true) {
				System.out.println("다시입력하시오 ");
				System.out.print("홀수인 정수 입력 : ");
				nu1 = sc.nextInt();
				if (nu1 % 2 == 1 && nu1 > 3) {
					break;
				}
			}
		}
		int[] num = new int[nu1];
		int var = num.length / 2;
		for (int i = 0; i < num.length; i++) {

			if (i <= num.length / 2) {
				num[i] = i + 1;
			} else if (i > num.length / 2) {
				for (int j = var; j < num.length; j++) {
					num[i] = (j - i) + 1;// 마지막값을 넣는다 j증가의 마지막값
				}

			}

		}

		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();

	}

	public void practice9() {
		Scanner sc = new Scanner(System.in);
		String[] chicken = { "양념", "후라이드", "간장", "갈릭" };
		System.out.print("치킨 이름을 입력하세요 : ");
		String name = sc.nextLine();
		for (int i = 0; i < chicken.length; i++) {
			if (chicken[i].equals(name)) {
				System.out.println(name + "치킨 배달 가능");
				break;
			} else {
				System.out.println(name + "치킨은 없는 메뉴입니다.");
				break;
			}
		}

	}

	public void practice10() {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록 번호 (-포함)");
		String number = sc.nextLine();// number변수에 문자열로 숫자를 특수문자와 함께 포함해서 입력받아 저장한다.
		char[] num1 = new char[number.length()];// 배열 원본 char배열 선언후 입력받은 문자열길이만큼 배열공간확보
		char[] num2 = new char[number.length()];// 원본 배열을 변경없이 복사복으로 사용한다.
		for (int i = 0; i < number.length(); i++) {
			num1[i] = number.charAt(i);// 입력받은 문자열의 문자 하나하나를 배열값에 공간마다 한글자씩 넣는다
			num2[i] = number.charAt(i);
		}
		for (int i = 0; i < num1.length; i++) {
			if (i > 7) {// 8자리부터 는 별로 표시하는 부분
				num2[i] = '*';
			}

		}
		for (int i = 0; i < num1.length; i++) {
			System.out.print(num2[i]);// 여기는 출력하는 부분
		}
	}

	public void practice11() {
		int[] num = new int[10];
		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 10 + 1);
		}
		for (int i = 0; i < num.length; i++) {
			System.out.print(" " + num[i]);
		}
	}

	public void practice12() {
		int[] num = new int[10];
		int MiN = 10, MAX = 0;
		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 10 + 1);
		}
		for (int i = 0; i < num.length; i++) {
			System.out.print(" " + num[i]);
		}
		System.out.println();
		for (int i = 0; i < num.length; i++) {
			if (num[i] > MAX) {
				MAX = num[i];
			} else if (num[i] < MiN) {
				MiN = num[i];
			}

		}
		System.out.println("최대값 : " + MAX);
		System.out.println("최솟값 : " + MiN);

	}

	public void practice13() {
		int[] num = new int[10];
		for (int i = 0; i < num.length; i++) {
			num[i]=(int)((Math.random()*10)+1);
			for (int j = 1; j < num.length; j++) {
				if (num[i] != num[j]) {
					num[i]=(int)((Math.random()*10)+1);
				}

			}
		}
		for(int i=0;i<num.length;i++) {
			System.out.print(" "+num[i]);
		}
	}

}
