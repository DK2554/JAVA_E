package com.oop.controller;

import java.util.Scanner;

import com.oop.model.vo.Employee;

//��������� Ŭ����
public class MemberController {
	// ȸ���� �����ϴ� Ŭ����
	// ȸ�� ��ϱ��
	// �� ��������� ??
	private Employee[] members = new Employee[3];

	// �Է¹޾Ƽ� �����ϱ�
	public void enrollMember() {

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < members.length; i++) {
			Employee m = new Employee();
			System.out.print("���̵� �Է��Ͻÿ� : ");
			m.setId(sc.nextLine());
			System.out.print("��й�ȣ�� �Է��Ͻÿ� : ");
			m.setPwd(sc.nextLine());
			System.out.print("�̸��� �Է��Ͻÿ� : ");
			m.setName(sc.nextLine());
			System.out.print("���̸� �Է��Ͻÿ� : ");
			m.setAge(sc.nextInt());
			sc.nextLine();
			System.out.print("������ �Է��Ͻÿ� : ");
			m.setGender(sc.nextLine());
			System.out.print("��ȣ�� �Է��Ͻÿ� : ");
			m.setPhone(sc.nextLine());
			System.out.print("�̸����� �Է��Ͻÿ� : ");
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
		// System.out.print("���̵� �Է��Ͻÿ� : ");
		// members[i].setId(sc.nextLine());
		// System.out.print("��й�ȣ�� �Է��Ͻÿ� : ");
		// members[i].setPwd(sc.nextLine());
		// System.out.print("�̸��� �Է��Ͻÿ� : ");
		// members[i].setName(sc.nextLine());
		// System.out.print("���̸� �Է��Ͻÿ� : ");
		// members[i].setAge(sc.nextInt());
		// sc.nextLine();
		// System.out.print("������ �Է��Ͻÿ� : ");
		// members[i].setGender(sc.nextLine());
		// System.out.print("��ȣ�� �Է��Ͻÿ� : ");
		// members[i].setPhone(sc.nextLine());
		// System.out.print("�̸����� �Է��Ͻÿ� : ");
		// members[i].setEmail(sc.nextLine());
		//
	}

	public void printMembers() {
		System.out.println("====��üȸ����ȸ ======");
		System.out.println("���̵�\t�н�����\t�̸�\t����\t����\t��ȭ��ȣ \t�̸��� ");
		for (Employee em : members) {
			if (em != null) {// 0~9��°���� ������ ���� em�� null�� �ƴϸ� ����
				System.out.println(em.getId() + "\t" + em.getPwd() + "\t" + em.getName() + "\t" + em.getAge() + "\t"
						+ em.getGender() + "\t" + em.getPhone() + "\t" + em.getEmail());

			}
		}
	}

}
