package oop.main;

import oop.method.NonStaticSample;

public class Main {

	public static void main(String[] args) {
		NonStaticSample nss=new NonStaticSample();
		System.out.println(nss.intArrayAlloction(10));
		nss.display(nss.intArrayAlloction(10));
		
	}

}
