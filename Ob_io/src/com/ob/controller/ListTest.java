package com.ob.controller;

import java.util.ArrayList;
import java.util.List;

import com.ob.vo.Person;

public class ListTest {
	public void arrayListTest() {
		ArrayList<Person>list=new ArrayList<Person>();
		list.add(new Person("임동욱",20,"용인"));
		//제네릭으로 타입을 Person으로 지정
		//list.add(180);
		list.add(1,new Person("유병승",20,"시흥시"));
		printList(list);
		for(int i=0;i<list.size();i++) {
			if(list.get(i) instanceof Person) {
				//실제 객체를 이용하려면 강제형변환을 하여 사용함
				
				Person p=(Person)list.get(i);
				//객체의 이름과 나이만 가져오는 소스
				System.out.println(p.getName()+p.getAge());
			}
		}
		System.out.println("삭제 후 출력=====");
		list.remove(new Person("유병승",20,"시흥시"));
		printList(list);
	}
	private void printList(List list) {
		for(Object o:list) {
			System.out.println(o);
		}
	}
	

}
