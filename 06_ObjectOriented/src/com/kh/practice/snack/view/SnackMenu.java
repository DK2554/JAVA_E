package com.kh.practice.snack.view;

import java.util.Scanner;

import com.kh.prcatice.snack.model.vo.Snack;
import com.kh.prcatice.snak.controller.SnakController;

public class SnackMenu {
	private Scanner sc =new Scanner(System.in);
	private SnakController scr=new SnakController();
	
	public void menu() {
		Snack sk=new Snack();
		System.out.println("�������� �Է��ϼ���");
		System.out.print("���� : ");
		String kind=sc.nextLine();
		System.out.print("�̸� : ");
		String name=sc.nextLine();
		System.out.print("�� : ");
		String flavor=sc.nextLine();
		System.out.print("���� : ");
		int num= sc.nextInt();
		sc.nextLine();
		System.out.print("���� : " );
		int price=sc.nextInt();
		System.out.println(scr.saveData(kind, name, flavor, num, price));
		System.out.print("������ ������ Ȯ���Ͻðڽ��ϱ�? ");
		System.out.print("y/n");
		char ch=sc.next().charAt(0);
		if(ch=='y') {
			System.out.println(scr.confirmData());
		}else {
			return;
		}
	}

}
