package com.kh.hw.shape.view;

import java.util.Scanner;

import com.kh.hw.shape.controller.EmployeeController;

public class EmployeeMenu {
	private Scanner sc = new Scanner(System.in);
	private EmployeeController ec = new EmployeeController();

	public EmployeeMenu() {
		while (true) {
//			if(!ec.inform().equals(null)) {
//				System.out.println("true");
//			}

			System.out.println("1.��� �߰� ");
			System.out.println("2.��� ���� ");
			System.out.println("3.��� ���� ");
			System.out.println("4.��� ��� ");
			System.out.println("9.���α׷� ���� ");
			System.out.print("�޴� ��ȣ�� �������� : ");
			int cho = sc.nextInt();
			switch (cho) {
			case 1:
				insertEmp();
				break;

			case 2:
				updateEmp();
				break;

			case 3:
				deleteEmp();
				break;
			case 4:
				printEmp();
				break;
			case 9:
				System.out.print("���α׷��� �����մϴ�");
				return;
			default:
				System.out.println("�߸��Է��ϼ̽��ϴ� �ٽ��Է��ϼ���");
				break;
			}

		}

	}

	public void insertEmp() {
		while (true) {
			sc.nextLine();
			System.out.print("��� ��ȣ :  ");
			int no = sc.nextInt();
			sc.nextLine();
			System.out.print("��� �̸� : ");
			String name = sc.nextLine();
			System.out.print("��� ���� : ");
			char gen = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("��ȭ��ȣ : ");
			String pn = sc.nextLine();
			System.out.print("�߰� ������ �� �Է��Ͻðڽ��ϱ�?(y �Ǵ� n)");
			char cho = sc.next().charAt(0);
			//ec.add(no, name, gen, pn);
			//System.out.println(ec.inform());
			if (cho == 'y') {
				System.out.print("��� �μ� : ");
				String dept = sc.nextLine();
				System.out.print("��� ���� :");
				int sal = sc.nextInt();
				System.out.print("���ʽ� : ");
				double bn = sc.nextDouble();
				ec.add(no, name, gen, pn, dept, sal, bn);
				break;
			} else {
				
				ec.add(no, name, gen, pn);
				//System.out.println(ec.inform());
				break;
			}

		}

	}

	public void updateEmp() {
		System.out.println("���� �ֽ��� ��� ������ �����ϰ� �˴ϴ�");
		System.out.println("����� � ������ �����Ͻðڽ��ϱ�? ");
		System.out.println("1. ��ȭ��ȣ");
		System.out.println("2. ��� ����");
		System.out.println("3. ���ʽ� �� ");
		System.out.println("9. ���ư���");
		System.out.print("�޴� ��ȣ�� �������� :");
		int num = sc.nextInt();
		sc.nextLine();
		switch (num) {
		case 1:
			System.out.print("������ ��ȭ��ȣ : ");
			ec.modify(sc.nextLine());
			break;
		case 2:
			System.out.print("������ ���� : ");
			ec.modify(sc.nextInt());
			break;
		case 3:
			System.out.print("������ ���ʽ�  : ");
			ec.modify(sc.nextDouble());
			break;
		case 9:
			System.out.println("�޴��� ���ư��ϴ� ");
			break;
		default:
			System.out.println("�߸��Է��ϼ̽��ϴ�");
			break;

		}

	}

	public void deleteEmp() {
		System.out.println("���� ���� �ϰڽ��ϱ�?(y/n)");
		char ch = sc.next().charAt(0);
		if (ch == 'y') {
			ec.remove();
			System.out.println("������ �����Ͽ����ϴ�");
		}

	}

	public void printEmp() {

		if (ec.inform() != null) {
			System.out.println(ec.inform());
			
			
		} else {
			System.out.println("��� �����Ͱ� �����ϴ�");

			
		}

	}

}
