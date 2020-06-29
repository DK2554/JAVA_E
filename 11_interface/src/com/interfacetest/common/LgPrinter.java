package com.interfacetest.common;

public class LgPrinter implements PrintAble {
	public void print(String msg) {
		System.out.println("LG"+msg);
	}

	@Override
	public void print() {
		print("¿Œº‚");
		
	}
	

}
