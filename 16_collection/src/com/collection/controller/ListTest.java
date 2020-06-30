package com.collection.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.collection.model.vo.Person;

public class ListTest {
	
	public void arrayListTest() {
		//List�� ���� �˾ƺ���!
		//Ư¡:�迭�� �����ϴ�-> �ε����� ����, �������ִ�,�ߺ��� ����ȴ�
		//����:ArrayList,LinkedList,Vector
		//ArrayList�� Ȱ��
		//��ü�� �����ϴ� �ڷ��� Ŭ����(��ü)==Object[]
		//ArrayList�� ����->new ArrayList();
		ArrayList list=new ArrayList();
		//�迭�� ����ϴ� ����� ������,������ ��ü�̱� ������
		//������(��ü)�����ϰų� ����, ������ �Ҷ� �޼ҵ带 �̿��ؼ� ó����
		//Object[] obj=new object[10]
		//ArrayList�� ���� ���̸� �� �� �ִ°͵� ������
		System.out.println(list.size());//�迭�� length�� ���
		//���� list�� �����ϴ� ��ü�� ������ �˷���
		//ArrayList�� ������(��ü )�ֱ�
		//add()�޼ҵ带 �̿��ؼ� ��ü�� ������ ���Կ����ھƴ�!!
		list.add(new Date());
		list.add(100);
		System.out.println(list.size());
		//ArrayList���� ���α׷��� �ִ� ��� ��ü �� �⺻�ڷ���(Wrapper Class)�� �ٵ� �� �ִ�.
		list.add(new Person("������",19,"��⵵"));
		list.add(180.5);
		list.add(true);
		
		//ArrayList�� �������� ������ ����ϱ�
		//get()�޼ҵ带 �̿��ؼ� �����͸� ������ �� ����
		//get(�ε��� )�ش��ϴ� �ε����� ������ �� ����
		list.get(0);
		//get���� ������ �����͸� ���Ե� �ڷ����� ���缭 ����Ϸ��� 
		//�ݵ�� ������ ��ȯ�� �Ͽ� ����ؾ���.
		//get()�޼ҵ�� ArrayList�� �ִ� ��ü�� �ҷ����µ�
		//���� ��ü�� �ƴ� �θ��ڷ�����Object�ڷ����� �ҷ��´�
		//���� ��ü�� �̿��Ϸ��� ��������ȯ�� �Ͽ� ����ؾ���
		//list.get(�ε���)->��ü�� �ּҸ� ��ȯ.
		
		//�����͸� �����ö� ��Ģ���� �ε��� ��ȣ�� �����͸� �����ü� ����
		//�ݺ����� �̿��ؼ� �����͸� ������ �� ����
		//�⺻ �ݺ���/for each��
		for(int i=0;i<list.size();i++) {
			
			System.out.println(list.get(i));
		}
		
	
		for(int i=0;i<list.size();i++) {
			if(list.get(i) instanceof Person) {
				Person p=(Person)list.get(i);
				System.out.println("��ü�� Person �϶��� ����");
				System.out.println(p.getName()+p.getAge());
			}
			
		}
		//for each��
		
		ArrayList names=new ArrayList();
		names.add("������");
		names.add("�赵ȯ");
		names.add("�¿���");
		names.add("�ѽ¿�");
		names.add("�����");
		names.add("�����");
		boolean ckeck=false;
		for(Object o: names) {
			if(o.equals("�ѽ¿�")) {
				ckeck=true;
				break;
			}
		}
		System.out.println(ckeck);
		System.out.println("==========���� �ִ��� ã��===");
		System.out.println(names.contains("�ѽ¿�"));
		
		ArrayList persons=new ArrayList();
		persons.add(new Person("������",19,"��⵵ ����"));
		persons.add(new Person("������",26,"����"));
		persons.add(new Person("�谡��",27,"����"));
		persons.add(new Person("������",19,"��⵵ ����"));

		System.out.println(persons.contains(new Person("������",19,"��⵵ ����")));
		printList(persons);
		//list�� ���Ե� ���� �����Ϸ���
		//set()�޼ҵ带 �̿�
		//set(�ε��� ��ȣ,������ ��)
		//�߰��� ����
		persons.add(4,new Person("ȫ�浿",30,"����"));
		persons.set(3, new Person("ȫ����",28,"����"));
		System.out.println("====���� ������ �� ����ϱ�=====");
		printList(persons);
		
		//����
		//remove()�޼ҵ带 �̿��ؼ� ����
		//remove(�ε���)/remove(��ü)
		persons.remove(0);
		System.out.println("====���� ������ �� ����ϱ�=====");
		printList(persons);
		
		//������ ��ü �����
		persons.remove(new Person("�谡��",27,"����"));
		System.out.println("====������ ��ü �����ϱ�====");
		printList(persons);
		
		//list�� �մ� ������ �ѹ��� �� �����
		//clear()�޼ҵ� �̿�
		persons.clear();
		System.out.println(persons.size());
		
		
		//list�� �����Ϳ��� �ߺ��� ������ ������
		ArrayList numbers=new ArrayList();
		numbers.add(1);
		numbers.add(1);
		numbers.add(1);
		numbers.add(1);
		numbers.add(1);
		numbers.add(1);
		printList(numbers);
		
		
		
		
	
	}
	public void listOrder() {
		//������ ������ ������ �� �� ����
		//�������� /������������ ������ ����
		List list=new ArrayList();
		for(int i=0;i<10;i++) {
			list.add((int)(Math.random()*20));
		}
		System.out.println("===������ ���====");
		printList(list);
		System.out.println("====�����ϱ�====");
		//collections��ü�� sort()�޼ҵ带 �̿��ϸ� �ս���
		//������ �� ���� ����.
		Collections.sort(list);//�������� ����);
		System.out.println("====�������������ϱ�====");
		printList(list);
		
		//��������������??
		//Collections.sort(����Ʈ,��������ó�� ��ü)��
		//Comparator�������̽��� ������ ��ü�� ó��
		//Comparator�� compare�޼ҵ带 �����ϸ� ��
		//Collections.reverse(list);
		//���ο� �ܺ� Ŭ����
		Collections.sort(list, new OrderLogic());
		
		System.out.println("====�������������ϱ�====");
		printList(list);
		System.out.println("���ڿ� �����ϱ�");
		list.clear();
		list.add("ȫ����");
		list.add("������");
		list.add("�赵ȯ");
		list.add("�̼���");
		System.out.println("==�������� ====");
		Collections.sort(list);
		printList(list);
		
		Collections.sort(list,new OrderStringLow());
		System.out.println("==������ ====");
		printList(list);
		
		//��ü�� �����غ���
		//list�� ��ü�� ������ �����ϱ�
		list.clear();
		list.add(new Person("������",19,"��⵵ �����"));
		list.add(new Person("ȫ����",28,"����"));
		list.add(new Person("�谡��",27,"����"));
		list.add(new Person("������",26,"����"));
		System.out.println("������ ���");
		printList(list);
		System.out.println("������ ���");
		Collections.sort(list);
		printList(list);
		
		//���ٸ� �����ϸ� ���� ���� ������� ������ ������;
		list.clear();
		list.add("ȫ����");
		list.add("������");
		list.add("�赵ȯ");
		list.add("�̼���");
		Collections.sort(list,(i,j)->((String)j).compareTo((String)i));
		
		
	
		
	}
	//linkedList
	//ArrayList�� ������, �����͸� ����,����,�߰���
	//������ �Ͼ�� ���������� arrayList���� ���� ������ ������ ����
	public void linkedListTest() {
		LinkedList list=new LinkedList();
		list.add("������");
		list.add("�赵ȯ");
		list.add("�ѽ¿�");
		printList(list);
		//ó������ ������ Ȯ�� �� �� ����
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
	}
	public void setTest() {
		//Set�� ���� �˾ƺ���
		//Set�����ϰ� ��ü�� �����ϴ� Ŭ����
		//����: HashSet,TreeSet
		//Ư¡ : ������ ����, �ߺ����� �������� ����
		HashSet set=new HashSet();
		//set�� ������ �ֱ�
		//add()�޼ҵ带 �̿���
		set.add("������");
		set.add("�赵ȯ");
		set.add("�¿���");
		set.add("������");
		set.add("������");
		
		//set�� �ִ� ������ ����Ҷ��� 
		//get�� �̿��Ҽ� ����
		//Interator��ü�� �̿��ؼ� �����
		Iterator it=set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
			
		
	}
	
	
	private void printList(List list) {
		for(Object o: list) {
			System.out.println(o);
		}

	}
	//list�� ������ �ִ�
	
}
