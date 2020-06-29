package com.kh.practice.snack.view;

import java.util.Scanner;

import com.kh.prcatice.snack.model.vo.Snack;
import com.kh.prcatice.snak.controller.SnakController;

public class SnackMenu {
	private Scanner sc =new Scanner(System.in);
	private SnakController scr=new SnakController();
	
	public void menu() {
		Snack sk=new Snack();
		System.out.println("스낵류를 입력하세요");
		System.out.print("종류 : ");
		String kind=sc.nextLine();
		System.out.print("이름 : ");
		String name=sc.nextLine();
		System.out.print("맛 : ");
		String flavor=sc.nextLine();
		System.out.print("개수 : ");
		int num= sc.nextInt();
		sc.nextLine();
		System.out.print("가격 : " );
		int price=sc.nextInt();
		System.out.println(scr.saveData(kind, name, flavor, num, price));
		System.out.print("저장한 정보를 확인하시겠습니까? ");
		System.out.print("y/n");
		char ch=sc.next().charAt(0);
		if(ch=='y') {
			System.out.println(scr.confirmData());
		}else {
			return;
		}
	}

}
