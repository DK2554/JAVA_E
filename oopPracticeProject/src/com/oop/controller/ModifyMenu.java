package com.oop.controller;

import java.util.Scanner;

import com.oop.model.dto.Employee;
import com.oop.run.EmpTest;

public class ModifyMenu {
	public static Employee modifyMenu(Employee e) {

		System.out.println("1. �̸� ���� : ");
		System.out.println("2. �޿� ���� : ");
		System.out.println("3. �μ� ���� : ");
		System.out.println("4. ���� ���� : ");
		System.out.println("5. ���� �޴��� �̵� : ");
		System.out.print("��ȣ  : ");
		Scanner sc = new Scanner(System.in);
		int cho = sc.nextInt();
		sc.nextLine();
		switch (cho) {
		case 1:
			System.out.println("������ �̸��� �Է��Ͻÿ� : ");
			e.setEmpName(sc.nextLine());
			break;
		case 2:
			System.out.println("�����Ͻ� �޿��� �Է��ϼ��� : ");
			e.setSalary(sc.nextInt());
			break;
		case 3:
			System.out.println("�����Ͻ� �μ��� �Է��ϼ��� : ");
			e.setDept(sc.nextLine());
			break;

		case 4:
			System.out.println("�����Ͻ� ������ �Է��ϼ���");
			e.setJob(sc.nextLine());
			break;
		case 5:
			EmpTest.main(null);

		}

		return e;
	}

}
