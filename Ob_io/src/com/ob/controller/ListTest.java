package com.ob.controller;

import java.util.ArrayList;
import java.util.List;

import com.ob.vo.Person;

public class ListTest {
	public void arrayListTest() {
		ArrayList<Person>list=new ArrayList<Person>();
		list.add(new Person("�ӵ���",20,"����"));
		//���׸����� Ÿ���� Person���� ����
		//list.add(180);
		list.add(1,new Person("������",20,"�����"));
		printList(list);
		for(int i=0;i<list.size();i++) {
			if(list.get(i) instanceof Person) {
				//���� ��ü�� �̿��Ϸ��� ��������ȯ�� �Ͽ� �����
				
				Person p=(Person)list.get(i);
				//��ü�� �̸��� ���̸� �������� �ҽ�
				System.out.println(p.getName()+p.getAge());
			}
		}
		System.out.println("���� �� ���=====");
		list.remove(new Person("������",20,"�����"));
		printList(list);
	}
	private void printList(List list) {
		for(Object o:list) {
			System.out.println(o);
		}
	}
	

}
