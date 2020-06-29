package com.kh.test.controller;

import com.kh.test.model.vo.Person;

public class Test {
	public static void main(String[] args) {
		Person[] pr=new Person[3];
		
		for(int i=0;i<pr.length;i++) {
			System.out.println(pr[i].getName());
		}
	}

}
