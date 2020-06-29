package com.kh.hw.shape.view;

import java.util.Scanner;

import com.kh.hw.shape.controller.SquareController;
import com.kh.hw.shape.controller.TriangleController;

public class ShapMenu {
	private Scanner sc = new Scanner(System.in);
	private SquareController scr = new SquareController();
	private TriangleController tc = new TriangleController();

	public void inputMenu() {
		while (true) {

			System.out.println("====도형프로그램=====");
			System.out.println("3 .삼각형  ");
			System.out.println("4. 사각형  ");
			System.out.println("9. 프로그램 종료  ");
			System.out.print("메뉴 번호 : ");
			int cho = sc.nextInt();
			switch (cho) {
			case 3:
				triangleMenu();
				break;
			case 4:
				squareMenu();
				break;
			case 9:
				System.out.println("프로그램 종료");
				return;
			default:
				System.out.println("잘못된 번호 입니다. 다시입력해주세요");

			}
		}

	}

	public void triangleMenu() {
		while (true) {
			System.out.println("=====삼각형======");
			System.out.println("1. 삼각형 면적  ");
			System.out.println("2. 삼각형 색칠 ");
			System.out.println("3. 삼각형 정보 ");
			System.out.println("9. 메인으로");
			System.out.print("입력 번호 : ");
			int cho = sc.nextInt();
			switch (cho) {
			case 1:
				inputSize(3, cho);
				break;
			case 2:
				inputSize(3, cho);
				break;
			case 3:
				printInformation(3);
				break;
			case 9:
				System.out.println("메인으로 돌아갑니다 ");
				inputMenu();
				break;
			default:
				System.out.println("잘못입력했습니다 다시 입력해주세요");
			}
		}

	}

	public void squareMenu() {
		while (true) {
			System.out.println("=====사격형======");
			System.out.println("1. 사각형 둘레  ");
			System.out.println("2. 사각형 면적 ");
			System.out.println("3. 사각형 색칠 ");
			System.out.println("4. 사각형 정보 ");
			System.out.print("9. 메인으로");
			System.out.println("번호 입력 : ");
			int cho = sc.nextInt();
			sc.nextLine();
			switch (cho) {
			case 1:
				inputSize(4, cho);
				break;
			case 2:
				inputSize(4, cho);
				break;
			case 3:
				inputSize(4, cho);
				break;
			case 4:
				printInformation(4);
				break;
			case 9:
				System.out.println("메인으로 돌아갑니다 ");
				inputMenu();
				break;
			default:
				System.out.println("잘못입력했습니다 다시 입력해주세요");
			}
		}

	}

	public void inputSize(int type, int menuNum) {
		// 삼각형 3 사각형 4
		if (type == 3 && menuNum == 1) {
			System.out.print("높이 : ");
			int he = sc.nextInt();
			System.out.print("너비 : ");
			int we = sc.nextInt();
			System.out.println("삼각형 면적 : " + tc.calcArea(he, we));
		} else if (type == 3 && menuNum == 2) {
			//String으로 입력시 버퍼가 생겨서 값이 저장이 안댐 이위치 아니고는 
			//작동이 불가능함
			sc.nextLine();
			System.out.print("색깔을 입력하세요 : ");
			tc.paint(sc.nextLine());
			System.out.println("색이 수정되었습니다");

		} else if (type == 4 && menuNum == 1) {
			System.out.print("높이 : ");
			int he = sc.nextInt();
			System.out.print("너비 : ");
			int we = sc.nextInt();
			System.out.println("사격형 둘레: " + scr.calcPerimeter(he, we));
		} else if (type == 4 && menuNum == 2) {
			System.out.print("높이 : ");
			int he = sc.nextInt();
			System.out.print("너비 : ");
			int we = sc.nextInt();
			System.out.println("사격형 면적: " + scr.calcArea(he, we));
		} else if (type == 4 && menuNum == 3) {

			System.out.print("색깔을 입력하세요 : ");
			scr.paint(sc.nextLine());

			System.out.println("색이 수정되었습니다");
		}

	}

	public void printInformation(int type) {
		if (type == 3) {
			System.out.println(tc.print());

		} else if (type == 4) {
			System.out.println(scr.print());
		}

	}

}
