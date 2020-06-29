package com.oop.controller;

import java.util.Scanner;

import com.oop.model.vo.Employee;

//기능제공용 클래스
public class MemberController {
	// 회원을 관리하는 클래스
	// 회원 등록기능
	// 왜 멤버변수로 ??
	private Employee[] members = new Employee[3];

	// 입력받아서 구현하기
	public void enrollMember() {

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < members.length; i++) {
			Employee m = new Employee();
			System.out.print("아이디를 입력하시오 : ");
			m.setId(sc.nextLine());
			System.out.print("비밀번호를 입력하시오 : ");
			m.setPwd(sc.nextLine());
			System.out.print("이름를 입력하시오 : ");
			m.setName(sc.nextLine());
			System.out.print("나이를 입력하시오 : ");
			m.setAge(sc.nextInt());
			sc.nextLine();
			System.out.print("성별을 입력하시오 : ");
			m.setGender(sc.nextLine());
			System.out.print("번호를 입력하시오 : ");
			m.setPhone(sc.nextLine());
			System.out.print("이메일을 입력하시오 : ");
			m.setEmail(sc.nextLine());
			members[i] = m;
//			for (int i = 0; i < members.length; i++) {
//				if (members[i] == null) {
//					members[i] = m;
//					break;
//				}
//			}
		}
		// for(int i=0; i<members.length;i++) {
		// members[i]=new Employee();
		// System.out.print("아이디를 입력하시오 : ");
		// members[i].setId(sc.nextLine());
		// System.out.print("비밀번호를 입력하시오 : ");
		// members[i].setPwd(sc.nextLine());
		// System.out.print("이름를 입력하시오 : ");
		// members[i].setName(sc.nextLine());
		// System.out.print("나이를 입력하시오 : ");
		// members[i].setAge(sc.nextInt());
		// sc.nextLine();
		// System.out.print("성별을 입력하시오 : ");
		// members[i].setGender(sc.nextLine());
		// System.out.print("번호를 입력하시오 : ");
		// members[i].setPhone(sc.nextLine());
		// System.out.print("이메일을 입력하시오 : ");
		// members[i].setEmail(sc.nextLine());
		//
	}

	public void printMembers() {
		System.out.println("====전체회원조회 ======");
		System.out.println("아이디\t패스워드\t이름\t나이\t성별\t전화번호 \t이메일 ");
		for (Employee em : members) {
			if (em != null) {// 0~9번째까지 무조건 접근 em이 null이 아니면 실행
				System.out.println(em.getId() + "\t" + em.getPwd() + "\t" + em.getName() + "\t" + em.getAge() + "\t"
						+ em.getGender() + "\t" + em.getPhone() + "\t" + em.getEmail());

			}
		}
	}

}
