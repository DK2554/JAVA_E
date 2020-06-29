package com.student.view;

import java.util.Scanner;

import com.student.controller.StudentController;
import com.student.model.vo.Grade;
import com.student.model.vo.Student;

public class MainView {
//	Student st = new Student();
	private StudentController stc;

	// 메인메뉴기능
	public void mainMenu(StudentController stc) {
		this.stc=stc;
		Scanner sc = new Scanner(System.in);
		while (true) {

			System.out.println("========학생 관리 프로그램 ========");
			System.out.println("1. 학생관리");
			System.out.println("2. 학생조회");
			System.out.println("3. 학생성적등록");
			System.out.println("4. 프로그램 종료");
			System.out.print("입력 : ");
			int choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
			case 1:
				this.stc.enrollStudent();break;
			case 2:
				this.stc.searchStudent();break;
			case 3:
				
			case 4:
				System.out.println("프로그램을 종료합니다");
				return;
			}
		}
	}

	// 학생을 생성하는 기능
	public Student enrollStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=======학생 등록=========");
		System.out.print("1. 학생 이름 : ");
		// st.setName(sc.nextLine());
		String name = sc.nextLine();
		System.out.print("2. 학년 : ");
		// st.setHak(sc.nextInt());
		int hak = sc.nextInt();
		System.out.print("3. 반 : ");
		// st.setBan(sc.nextInt());
		int ban = sc.nextInt();
		Student s = new Student(name, hak, ban, null);
		// System.out.println(st.getBan() + " " + st.getHak() + st.getName());
		// mainMenu();
		return s;
	}

	public Grade gradeStudent() {
		Scanner sc = new Scanner(System.in);

		System.out.println("======성적 등록 ======");
		System.out.print("1. 국어 성적 : ");
		int ko = sc.nextInt();
		System.out.print("2. 영어 성적 : ");
		int en = sc.nextInt();
		System.out.print("3. 수학 성적 : ");
		int ma = sc.nextInt();
		Grade gr = new Grade(ko, en, ma);

		return gr;

	}

	public void findStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생의 이름을 입력하세요 : ");

	}

	public void printStudent(Student s) {
		System.out.println("==== 검색한 학생 =====");
		System.out.println("이름 : "+s.getName());
		System.out.println("학년 : "+s.getHak());
		System.out.println("반 : "+s.getBan());
		
		
	}

}
