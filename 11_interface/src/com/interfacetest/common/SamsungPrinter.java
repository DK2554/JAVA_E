package com.interfacetest.common;

public class SamsungPrinter implements PrintAble{
	public void printSam() {
		System.out.println("printSam �μ���");
	}

	@Override
	public void print() {
		printSam();
		
	}
	

}
