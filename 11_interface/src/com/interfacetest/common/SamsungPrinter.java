package com.interfacetest.common;

public class SamsungPrinter implements PrintAble{
	public void printSam() {
		System.out.println("printSam ¿Œº‚¡ﬂ");
	}

	@Override
	public void print() {
		printSam();
		
	}
	

}
