package com.objectArr.main;

import java.util.Scanner;

import com.objectArr.model.vo.Person;

public class ObjectArrMain {
	public static void main(String[] args) {
		// 사람 10명을 저장할 변수를 만들라 배열로

		// Person의 주소값을 저장할수 있는 배열
		Person[] pr = new Person[10];
		// 각 배열의 변수에 Person을 생성해서 넣어줘야한다

		// nullponiter오류 객체 0번째에 null.getName은 출력이 불가능함으로
		// 한번더 객체를 할당해서 초기화를 시켜야 사용이 가능하다
		pr[0] = new Person();
		pr[1] = new Person("유병승 ", 19);
		System.out.println(pr[0].getName());
		System.out.println(pr[1].getName() + pr[1].getAge());

		Person[] pr2 = { new Person(), new Person("유병승", 19), new Person("김도환", 25)};
		System.out.println(pr2[0].getName());
		System.out.println(pr2[1].getName());
		System.out.println(pr2[2].getName());
		//for문 사용해 객체배열 사용
		for(int i=0;i<pr2.length;i++) {
			System.out.println(pr2[i].getName()+pr2[i].getAge());
		}
		//Person을 저장할 수 있는4명 공간을 확보하고
		//사용자로 부터 입력받은 값으로 초기화한 후 출력 프로그램 작성
		Scanner sc=new Scanner(System.in);
		Person[]ps3=new Person[4];
		for(int i=0;i<ps3.length;i++) {
			System.out.print("이름을 입력 : ");
			String name=sc.nextLine();
			System.out.print("나이를 입력 : ");
			int age=sc.nextInt();
			sc.nextLine();
			ps3[i]=new Person(name,age);
		}
		//for each 변수 :배열이름
		for(Person p :ps3) {
			System.out.println(p.getName()+" "+p.getAge());
		}
		
	}

}
