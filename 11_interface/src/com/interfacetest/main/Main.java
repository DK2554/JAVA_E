package com.interfacetest.main;

import com.interfacetest.common.Calculatorable;
import com.interfacetest.common.Functional;
import com.interfacetest.common.PrintManager;
import com.interfacetest.common.SamsungPrinter;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculatorable cal=new Functional();
		cal.calculator(20, 50);
		cal.calArea();
		
		new PrintManager(new SamsungPrinter()).print();
	}

}
