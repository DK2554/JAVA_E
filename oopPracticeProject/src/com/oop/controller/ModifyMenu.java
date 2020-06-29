package com.oop.controller;

import java.util.Scanner;

import com.oop.model.dto.Employee;
import com.oop.run.EmpTest;

public class ModifyMenu {
	public static Employee modifyMenu(Employee e) {

		System.out.println("1. 이름 변경 : ");
		System.out.println("2. 급여 변경 : ");
		System.out.println("3. 부서 변경 : ");
		System.out.println("4. 직급 변경 : ");
		System.out.println("5. 이전 메뉴로 이동 : ");
		System.out.print("번호  : ");
		Scanner sc = new Scanner(System.in);
		int cho = sc.nextInt();
		sc.nextLine();
		switch (cho) {
		case 1:
			System.out.println("변경할 이름을 입력하시오 : ");
			e.setEmpName(sc.nextLine());
			break;
		case 2:
			System.out.println("변경하실 급여를 입력하세요 : ");
			e.setSalary(sc.nextInt());
			break;
		case 3:
			System.out.println("변경하실 부서를 입력하세요 : ");
			e.setDept(sc.nextLine());
			break;

		case 4:
			System.out.println("변경하실 직급을 입력하세요");
			e.setJob(sc.nextLine());
			break;
		case 5:
			EmpTest.main(null);

		}

		return e;
	}

}
