package com.kh.oop.controller;

import java.util.Scanner;

import com.kh.oop.model.vo.Member;

public class MemberController {
	Member[] em = new Member[1];

	// 기능구현
	public Member enrollMember()  {
		Scanner sc = new Scanner(System.in);
		Member m=new Member();
		for(int i=0;i<em.length;i++) {
		System.out.println("등록");
		System.out.print("이름 : ");
		m.setName(sc.nextLine());
		System.out.print("이메일 : ");
		m.setEmail(sc.nextLine());
		System.out.print("주소 : ");
		m.setAddress(sc.nextLine());
		System.out.print("나이 : ");
		m.setAge(sc.nextInt());
		sc.nextLine();
		System.out.print("키 : ");
		m.setHeight(sc.nextDouble());
		System.out.print("몸무게 : ");
		m.setWeight(sc.nextDouble());
		em[i] = m;
		}
		//Member로 변환값 m을 리턴한다
		return m;
		
	}

	public void memberUpdate(Member m) {
		Scanner sc=new Scanner(System.in);
		System.out.println("멤버 수정");
		System.out.print("수정할 이름 : ");
		m.setName(sc.nextLine());
		System.out.print("수정할 이메일: ");
		m.setEmail(sc.nextLine());
		System.out.print("수정 할 주소 : ") ;
		m.setAddress(sc.nextLine());
		System.out.print("수정할 나이 : ");
		m.setAge(sc.nextInt());
		sc.nextLine();
		System.out.print("수정할 키 : ");
		m.setHeight(sc.nextDouble());
		System.out.print("수정할 몸무게 : ");
		m.setWeight(sc.nextDouble());
		memberPrint();
		
	}

	public void memberPrint() {
		System.out.println("전체 회원 조회");
		System.out.println("이름\t이메일\t주소\t나이\t키\t몸무게  ");
		for (Member m1 : em) {
			if (m1!= null) {// 0~9번째까지 무조건 접근 em이 null이 아니면 실행
				System.out.println(m1.getName() + "\t" + m1.getEmail() + "\t" + m1.getAddress() + "\t" + m1.getAge()
						+ "\t" + m1.getHeight() + "\t" + m1.getWeight() + "\t");

			}
		}
	}

}
