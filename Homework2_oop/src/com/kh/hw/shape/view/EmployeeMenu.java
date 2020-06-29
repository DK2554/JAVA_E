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

			System.out.println("1.사원 추가 ");
			System.out.println("2.사원 수정 ");
			System.out.println("3.사원 삭제 ");
			System.out.println("4.사원 출력 ");
			System.out.println("9.프로그램 종료 ");
			System.out.print("메뉴 번호를 누르세요 : ");
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
				System.out.print("프로그램을 종료합니다");
				return;
			default:
				System.out.println("잘못입력하셨습니다 다시입력하세요");
				break;
			}

		}

	}

	public void insertEmp() {
		while (true) {
			sc.nextLine();
			System.out.print("사원 번호 :  ");
			int no = sc.nextInt();
			sc.nextLine();
			System.out.print("사원 이름 : ");
			String name = sc.nextLine();
			System.out.print("사원 성별 : ");
			char gen = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("전화번호 : ");
			String pn = sc.nextLine();
			System.out.print("추가 정보를 더 입력하시겠습니까?(y 또는 n)");
			char cho = sc.next().charAt(0);
			//ec.add(no, name, gen, pn);
			//System.out.println(ec.inform());
			if (cho == 'y') {
				System.out.print("사원 부서 : ");
				String dept = sc.nextLine();
				System.out.print("사원 연봉 :");
				int sal = sc.nextInt();
				System.out.print("보너스 : ");
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
		System.out.println("가장 최신의 사원 정보를 수정하게 됩니다");
		System.out.println("사원의 어떤 정보를 수정하시겠습니까? ");
		System.out.println("1. 전화번호");
		System.out.println("2. 사원 연봉");
		System.out.println("3. 보너스 율 ");
		System.out.println("9. 돌아가기");
		System.out.print("메뉴 번호를 누르세요 :");
		int num = sc.nextInt();
		sc.nextLine();
		switch (num) {
		case 1:
			System.out.print("수정할 전화번호 : ");
			ec.modify(sc.nextLine());
			break;
		case 2:
			System.out.print("수정할 연봉 : ");
			ec.modify(sc.nextInt());
			break;
		case 3:
			System.out.print("수정할 보너스  : ");
			ec.modify(sc.nextDouble());
			break;
		case 9:
			System.out.println("메뉴로 돌아갑니다 ");
			break;
		default:
			System.out.println("잘못입력하셨습니다");
			break;

		}

	}

	public void deleteEmp() {
		System.out.println("정말 삭제 하겠습니까?(y/n)");
		char ch = sc.next().charAt(0);
		if (ch == 'y') {
			ec.remove();
			System.out.println("삭제에 성공하였습니다");
		}

	}

	public void printEmp() {

		if (ec.inform() != null) {
			System.out.println(ec.inform());
			
			
		} else {
			System.out.println("사원 데이터가 없습니다");

			
		}

	}

}
