package com.objectArr.main;

import java.util.Scanner;

import com.objectArr.model.vo.Person;

public class ObjectArrMain {
	public static void main(String[] args) {
		// ��� 10���� ������ ������ ����� �迭��

		// Person�� �ּҰ��� �����Ҽ� �ִ� �迭
		Person[] pr = new Person[10];
		// �� �迭�� ������ Person�� �����ؼ� �־�����Ѵ�

		// nullponiter���� ��ü 0��°�� null.getName�� ����� �Ұ���������
		// �ѹ��� ��ü�� �Ҵ��ؼ� �ʱ�ȭ�� ���Ѿ� ����� �����ϴ�
		pr[0] = new Person();
		pr[1] = new Person("������ ", 19);
		System.out.println(pr[0].getName());
		System.out.println(pr[1].getName() + pr[1].getAge());

		Person[] pr2 = { new Person(), new Person("������", 19), new Person("�赵ȯ", 25)};
		System.out.println(pr2[0].getName());
		System.out.println(pr2[1].getName());
		System.out.println(pr2[2].getName());
		//for�� ����� ��ü�迭 ���
		for(int i=0;i<pr2.length;i++) {
			System.out.println(pr2[i].getName()+pr2[i].getAge());
		}
		//Person�� ������ �� �ִ�4�� ������ Ȯ���ϰ�
		//����ڷ� ���� �Է¹��� ������ �ʱ�ȭ�� �� ��� ���α׷� �ۼ�
		Scanner sc=new Scanner(System.in);
		Person[]ps3=new Person[4];
		for(int i=0;i<ps3.length;i++) {
			System.out.print("�̸��� �Է� : ");
			String name=sc.nextLine();
			System.out.print("���̸� �Է� : ");
			int age=sc.nextInt();
			sc.nextLine();
			ps3[i]=new Person(name,age);
		}
		//for each ���� :�迭�̸�
		for(Person p :ps3) {
			System.out.println(p.getName()+" "+p.getAge());
		}
		
	}

}
