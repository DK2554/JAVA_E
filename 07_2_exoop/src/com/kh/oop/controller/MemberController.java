package com.kh.oop.controller;

import java.util.Scanner;

import com.kh.oop.model.vo.Member;

public class MemberController {
	Member[] em = new Member[1];

	// ��ɱ���
	public Member enrollMember()  {
		Scanner sc = new Scanner(System.in);
		Member m=new Member();
		for(int i=0;i<em.length;i++) {
		System.out.println("���");
		System.out.print("�̸� : ");
		m.setName(sc.nextLine());
		System.out.print("�̸��� : ");
		m.setEmail(sc.nextLine());
		System.out.print("�ּ� : ");
		m.setAddress(sc.nextLine());
		System.out.print("���� : ");
		m.setAge(sc.nextInt());
		sc.nextLine();
		System.out.print("Ű : ");
		m.setHeight(sc.nextDouble());
		System.out.print("������ : ");
		m.setWeight(sc.nextDouble());
		em[i] = m;
		}
		//Member�� ��ȯ�� m�� �����Ѵ�
		return m;
		
	}

	public void memberUpdate(Member m) {
		Scanner sc=new Scanner(System.in);
		System.out.println("��� ����");
		System.out.print("������ �̸� : ");
		m.setName(sc.nextLine());
		System.out.print("������ �̸���: ");
		m.setEmail(sc.nextLine());
		System.out.print("���� �� �ּ� : ") ;
		m.setAddress(sc.nextLine());
		System.out.print("������ ���� : ");
		m.setAge(sc.nextInt());
		sc.nextLine();
		System.out.print("������ Ű : ");
		m.setHeight(sc.nextDouble());
		System.out.print("������ ������ : ");
		m.setWeight(sc.nextDouble());
		memberPrint();
		
	}

	public void memberPrint() {
		System.out.println("��ü ȸ�� ��ȸ");
		System.out.println("�̸�\t�̸���\t�ּ�\t����\tŰ\t������  ");
		for (Member m1 : em) {
			if (m1!= null) {// 0~9��°���� ������ ���� em�� null�� �ƴϸ� ����
				System.out.println(m1.getName() + "\t" + m1.getEmail() + "\t" + m1.getAddress() + "\t" + m1.getAge()
						+ "\t" + m1.getHeight() + "\t" + m1.getWeight() + "\t");

			}
		}
	}

}
