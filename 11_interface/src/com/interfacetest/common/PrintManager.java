package com.interfacetest.common;

public class PrintManager {
//	private SamsungPrinter sam=new SamsungPrinter();
//	private LgPrinter lg=new LgPrinter();
//	
	PrintAble print;
	
	public PrintManager(PrintAble print) {
		this.print=print;
	}
//	public void print() {
//		sam.printSam();
//		lg.print("출력해라");
//	}

//	public PrintManager(SamsungPrinter sam, LgPrinter lg) {
//		this.sam = sam;
//		this.lg = lg;
//	}
	public void print() {
		print.print();
		
	}

}
