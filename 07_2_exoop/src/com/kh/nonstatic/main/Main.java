package com.kh.nonstatic.main;

import test.method.NonStaticSample;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NonStaticSample nss=new NonStaticSample();
		nss.printLottoNumbers();
		
		nss.outputChar('g', 10);
		System.out.println();
		System.out.println(nss.alphabette());
	
		System.out.println(nss.mySubstring("안녕하세요감사합니다", 0, 4));
	}

}
