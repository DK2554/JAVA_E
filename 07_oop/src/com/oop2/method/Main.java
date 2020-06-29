package com.oop2.method;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// MethodTest °´Ã¼ÀÇ calculator¸Ş¼Òµå¸¦ È£­„·Á¸é;
		// 1.MethodTest°´Ã¼¸¦ »ı¼º
		MethodTest mt = new MethodTest();
		mt.calculator(1, 3, '+');// ¸Ş¼ÒµåÈ£Ãâ (½ÇÇà)
		Scanner sc = new Scanner(System.in);
		// System.out.print("Á¤¼ö 1: ");
		// int su1 = sc.nextInt();
		// System.out.print("Á¤¼ö 2: ");
		// int su2 = sc.nextInt();
		// System.out.print("¿¬»êÀÚ : ");
		// char op = sc.next().charAt(0);
		// mt.calculator(su1, su2, op);
		// ¹İÈ¯ÇüÀÌ ÀÖ°í ¸Å°³º¯¼ö°¡ ÀÖ´Â ¸Ş¼Òµå È£ÃâÇÏ±â

		// return°ªÀÌ ÀúÀåµÇ¾î¼­ È£ÃâµÈ´Ù
		// System.out.println(mt.calculator2(su1,su2,op));
		// ¹İÈ¯ÇüÀÌ ÀÖÀ»¶§ ¸®ÅÏ°ªÀ» ´Ù¸¥ º¯¼ö¿¡ ¹Ş¾Æ¼­ Ã³¸®ÇÒ¼ö ÀÖÀ½
		// double result=mt.calculator2(su1, su2, op);
		// System.out.println(result);

		// double result=mt.calculator3();
		// System.out.println(result);
		Method2 mt2 = new Method2();
		String str = mt2.plus();
		System.out.println(str);
		int num = mt2.plus2(2, 3);
		System.out.println(num);
		boolean flag = mt2.tandf('A');
		System.out.println(flag);
	}

}
