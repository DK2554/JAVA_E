package com.kh.inherint.main;

import com.kh.inerit.vo.Animal;
import com.kh.inerit.vo.Cat;
import com.kh.inerit.vo.Checkien;
import com.kh.inerit.vo.Line;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal ct=new Cat("�׷�",4,"����̰�");
		Animal ln=new Line("ŷ",4,"����̰�");
		Animal ck=new Checkien("����",2,"����");
		
		System.out.println(ct.action());
		System.out.println(ln.action());
		System.out.println(ck.action());
		
	}

}
