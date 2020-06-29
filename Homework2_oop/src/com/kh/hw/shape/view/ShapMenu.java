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

			System.out.println("====�������α׷�=====");
			System.out.println("3 .�ﰢ��  ");
			System.out.println("4. �簢��  ");
			System.out.println("9. ���α׷� ����  ");
			System.out.print("�޴� ��ȣ : ");
			int cho = sc.nextInt();
			switch (cho) {
			case 3:
				triangleMenu();
				break;
			case 4:
				squareMenu();
				break;
			case 9:
				System.out.println("���α׷� ����");
				return;
			default:
				System.out.println("�߸��� ��ȣ �Դϴ�. �ٽ��Է����ּ���");

			}
		}

	}

	public void triangleMenu() {
		while (true) {
			System.out.println("=====�ﰢ��======");
			System.out.println("1. �ﰢ�� ����  ");
			System.out.println("2. �ﰢ�� ��ĥ ");
			System.out.println("3. �ﰢ�� ���� ");
			System.out.println("9. ��������");
			System.out.print("�Է� ��ȣ : ");
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
				System.out.println("�������� ���ư��ϴ� ");
				inputMenu();
				break;
			default:
				System.out.println("�߸��Է��߽��ϴ� �ٽ� �Է����ּ���");
			}
		}

	}

	public void squareMenu() {
		while (true) {
			System.out.println("=====�����======");
			System.out.println("1. �簢�� �ѷ�  ");
			System.out.println("2. �簢�� ���� ");
			System.out.println("3. �簢�� ��ĥ ");
			System.out.println("4. �簢�� ���� ");
			System.out.print("9. ��������");
			System.out.println("��ȣ �Է� : ");
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
				System.out.println("�������� ���ư��ϴ� ");
				inputMenu();
				break;
			default:
				System.out.println("�߸��Է��߽��ϴ� �ٽ� �Է����ּ���");
			}
		}

	}

	public void inputSize(int type, int menuNum) {
		// �ﰢ�� 3 �簢�� 4
		if (type == 3 && menuNum == 1) {
			System.out.print("���� : ");
			int he = sc.nextInt();
			System.out.print("�ʺ� : ");
			int we = sc.nextInt();
			System.out.println("�ﰢ�� ���� : " + tc.calcArea(he, we));
		} else if (type == 3 && menuNum == 2) {
			//String���� �Է½� ���۰� ���ܼ� ���� ������ �ȴ� ����ġ �ƴϰ�� 
			//�۵��� �Ұ�����
			sc.nextLine();
			System.out.print("������ �Է��ϼ��� : ");
			tc.paint(sc.nextLine());
			System.out.println("���� �����Ǿ����ϴ�");

		} else if (type == 4 && menuNum == 1) {
			System.out.print("���� : ");
			int he = sc.nextInt();
			System.out.print("�ʺ� : ");
			int we = sc.nextInt();
			System.out.println("����� �ѷ�: " + scr.calcPerimeter(he, we));
		} else if (type == 4 && menuNum == 2) {
			System.out.print("���� : ");
			int he = sc.nextInt();
			System.out.print("�ʺ� : ");
			int we = sc.nextInt();
			System.out.println("����� ����: " + scr.calcArea(he, we));
		} else if (type == 4 && menuNum == 3) {

			System.out.print("������ �Է��ϼ��� : ");
			scr.paint(sc.nextLine());

			System.out.println("���� �����Ǿ����ϴ�");
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
