package com.oop.run;

import java.util.Scanner;

import com.oop.controller.ModifyMenu;
import com.oop.model.dto.Employee;

public class EmpTest {

	public static void main(String[] args) {
		Employee em = new Employee();
	
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1. 새사원정보 입력  ");
			System.out.println("2. 사원정보 수정");
			System.out.println("3. 사원정보 삭제 ");
			System.out.println("4. 사원정보 출력");
			System.out.println("9. 끝내기  ");
			System.out.print("번호를 입력 : ");
			int cho = sc.nextInt();
			switch (cho) {
			case 1:
				Employee ee=em.empInput();
				break;

			case 2:
				ModifyMenu mf = new ModifyMenu();
				ModifyMenu.modifyMenu(em);
				
				break;
			case 3:

			case 4:

				em.empoutput();
				break;
			case 9:
				return;
			}

		}
	}
}
