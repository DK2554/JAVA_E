package com.oop.run;

import java.util.Scanner;

import com.oop.controller.ModifyMenu;
import com.oop.model.dto.Employee;

public class EmpTest {

	public static void main(String[] args) {
		Employee em = new Employee();
	
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1. ��������� �Է�  ");
			System.out.println("2. ������� ����");
			System.out.println("3. ������� ���� ");
			System.out.println("4. ������� ���");
			System.out.println("9. ������  ");
			System.out.print("��ȣ�� �Է� : ");
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
