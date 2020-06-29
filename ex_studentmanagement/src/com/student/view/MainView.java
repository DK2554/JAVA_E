package com.student.view;

import java.util.Scanner;

import com.student.controller.StudentController;
import com.student.model.vo.Grade;
import com.student.model.vo.Student;

public class MainView {
//	Student st = new Student();
	private StudentController stc;

	// ���θ޴����
	public void mainMenu(StudentController stc) {
		this.stc=stc;
		Scanner sc = new Scanner(System.in);
		while (true) {

			System.out.println("========�л� ���� ���α׷� ========");
			System.out.println("1. �л�����");
			System.out.println("2. �л���ȸ");
			System.out.println("3. �л��������");
			System.out.println("4. ���α׷� ����");
			System.out.print("�Է� : ");
			int choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
			case 1:
				this.stc.enrollStudent();break;
			case 2:
				this.stc.searchStudent();break;
			case 3:
				
			case 4:
				System.out.println("���α׷��� �����մϴ�");
				return;
			}
		}
	}

	// �л��� �����ϴ� ���
	public Student enrollStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=======�л� ���=========");
		System.out.print("1. �л� �̸� : ");
		// st.setName(sc.nextLine());
		String name = sc.nextLine();
		System.out.print("2. �г� : ");
		// st.setHak(sc.nextInt());
		int hak = sc.nextInt();
		System.out.print("3. �� : ");
		// st.setBan(sc.nextInt());
		int ban = sc.nextInt();
		Student s = new Student(name, hak, ban, null);
		// System.out.println(st.getBan() + " " + st.getHak() + st.getName());
		// mainMenu();
		return s;
	}

	public Grade gradeStudent() {
		Scanner sc = new Scanner(System.in);

		System.out.println("======���� ��� ======");
		System.out.print("1. ���� ���� : ");
		int ko = sc.nextInt();
		System.out.print("2. ���� ���� : ");
		int en = sc.nextInt();
		System.out.print("3. ���� ���� : ");
		int ma = sc.nextInt();
		Grade gr = new Grade(ko, en, ma);

		return gr;

	}

	public void findStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�л��� �̸��� �Է��ϼ��� : ");

	}

	public void printStudent(Student s) {
		System.out.println("==== �˻��� �л� =====");
		System.out.println("�̸� : "+s.getName());
		System.out.println("�г� : "+s.getHak());
		System.out.println("�� : "+s.getBan());
		
		
	}

}
