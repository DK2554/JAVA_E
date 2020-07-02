package com.collection.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import com.collectioc.model.vo.Member;
import com.collection.model.vo.Person;

public class ListTest {
	
	public void arrayListTest() {
		//List에 대해 알아보자!
		//특징:배열과 유사하다-> 인덱스로 구분, 순서가있다,중복값 저장된다
		//종류:ArrayList,LinkedList,Vector
		//ArrayList를 활용
		//객체를 보관하는 자료형 클래스(객체)==Object[]
		//ArrayList를 생성->new ArrayList();
		ArrayList list=new ArrayList();
		//배열과 사용하는 방식이 유사함,하지만 객체이기 때문에
		//데이터(객체)저장하거나 삭제, 수정을 할때 메소드를 이용해서 처리함
		//Object[] obj=new object[10]
		//ArrayList에 대한 길이를 알 수 있는것도 제공함
		System.out.println(list.size());//배열에 length랑 비슷
		//실제 list가 보관하는 객체의 갯수를 알려줌
		//ArrayList에 데이터(객체 )넣기
		//add()메소드를 이용해서 객체를 대입함 대입연산자아님!!
		list.add(new Date());
		list.add(100);
		System.out.println(list.size());
		//ArrayList에는 프로그램에 있는 모든 객체 및 기본자료형(Wrapper Class)이 다들어갈 수 있다.
		list.add(new Person("유병승",19,"경기도"));
		list.add(180.5);
		list.add(true);
		
		//ArrayList에 보관중인 데이터 출력하기
		//get()메소드를 이용해서 데이터를 가져올 수 있음
		//get(인덱스 )해당하는 인덱스를 가져올 수 있음
		list.get(0);
		//get으로 가져온 데이터를 대입된 자료형에 맞춰서 사용하려면 
		//반드시 강제형 변환을 하여 사용해야함.
		//get()메소드로 ArrayList에 있는 객체를 불러오는데
		//실제 객체가 아닌 부모자료형인Object자료형을 불러온다
		//실제 객체를 이용하려면 강제형변환을 하여 사용해야함
		//list.get(인덱스)->객체의 주소를 반환.
		
		//데이터를 가져올때 규칙적인 인덱스 번호로 데이터를 가져올수 있음
		//반복문을 이용해서 데이터를 가져올 수 있음
		//기본 반복문/for each문
		for(int i=0;i<list.size();i++) {
			
			System.out.println(list.get(i));
		}
		
	
		for(int i=0;i<list.size();i++) {
			if(list.get(i) instanceof Person) {
				Person p=(Person)list.get(i);
				System.out.println("객체가 Person 일때만 실행");
				//객체의 이름과 나이만 가져오는 소스
				System.out.println(p.getName()+p.getAge());
			}
			
		}
		//list의 원하는 위치에 객체 넣기
				//add(인덱스, 값) -> 해당 인덱스 위치에 값을 넣는것
				System.out.println("==== 원하는 list위치에 새 데이터 넣기 ====");
				
				printList(list);
				
				list.add(new Person("김도환", 27,"경기도"));
				System.out.println("add(값)으로 추가");
				printList(list);
				System.out.println("인덱스를 지정하여 add()활용 데이터 추가");
				list.add(2,new Person("김민지",25,"서울시"));
				printList(list);
				
				//ArrayList를 생성하면을 하면 생성된 배열과 유사한 저장공간 빈공간
				//데이터가 없는 상태!
				ArrayList list2=new ArrayList();
				//System.out.println(list2.get(0));//에러발생
				//list에 데이터가 있을때 접근해라!!
				System.out.println(list2.size());
				//if(list2.size()!=0) {//데이터가 있으면....
				if(list2.size()>0) {//데이터가 있으면....
					System.out.println(list2.get(0));
				}
				//isEmpty()매소드를 이용할 수 있음
				//데이터가 없으면 true, 있으면 false;
				System.out.println("=== isEmpty()확인해보기 ===");
				System.out.println(list2.isEmpty());
				list2.add("유병승");
				System.out.println(list2.isEmpty());
				if(!list2.isEmpty()) {
					//데이터가 있으면 fasle 없으면 true를 반환
					System.out.println(list2.get(0));
				}
		//for each문
		
		ArrayList names=new ArrayList();
		names.add("유병승");
		names.add("김도환");
		names.add("온영석");
		names.add("한승연");
		names.add("김민지");
		names.add("장대은");
		boolean ckeck=false;
		for(Object o: names) {
			if(o.equals("한승연")) {
				ckeck=true;
				break;
			}
		}
		System.out.println(ckeck);
		System.out.println("==========값이 있는지 찾기===");
		System.out.println(names.contains("한승연"));
		
		ArrayList persons=new ArrayList();
		persons.add(new Person("유병승",19,"경기도 시흥"));
		persons.add(new Person("박정연",26,"서울"));
		persons.add(new Person("김가남",27,"서울"));
		persons.add(new Person("유병승",19,"경기도 시흥"));

		System.out.println(persons.contains(new Person("유병승",19,"경기도 시흥")));
		printList(persons);
		//list에 대입된 값을 변경하려면
		//set()메소드를 이용
		//set(인덱스 번호,수정할 값)
		//추가와 변경
		persons.add(4,new Person("홍길동",30,"서울"));
		System.out.println("====값을 추가한 후 출력하기=====");
		printList(persons);
		persons.set(3, new Person("홍지운",28,"광주"));
		System.out.println("====값을 수정한 후 출력하기=====");
		printList(persons);
		
		//삭제
		//remove()메소드를 이용해서 삭제
		//remove(인덱스)/remove(객체)
		persons.remove(0);
		System.out.println("====값을 삭제한 후 출력하기=====");
		printList(persons);
		
		//동일한 객체 지우기
		
		persons.remove(new Person("김가남",27,"서울"));
		
		System.out.println("====동일한 객체 삭제하기====");
		printList(persons);
		
		//list에 잇는 내용을 한번에 다 지우기
		//clear()메소드 이용
		persons.clear();
		System.out.println(persons.size());
		
		
		//list의 데이터에는 중복값 저장이 가능함
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
		//순서가 있으니 정렬을 할 수 잇음
		//오름차순 /내림차순으로 정렬이 가능
		List list=new ArrayList();
		for(int i=0;i<10;i++) {
			list.add((int)(Math.random()*20));
		}
		System.out.println("===정렬전 출력====");
		printList(list);
		System.out.println("====정렬하기====");
		//collections객체의 sort()메소드를 이용하면 손쉽게
		//정렬을 할 수가 있음.
		Collections.sort(list);//오름차순 정렬);
		//기본적인 오름차순정렬
		System.out.println("====오름차순정렬하기====");
		printList(list);
		
		//내림차순정렬은??
		//Collections.sort(리스트,내림차순처리 객체)ㅈ
		//Comparator인터페이스를 구현한 객체로 처리
		//Comparator에 compare메소드를 구현하면 됨
		//Collections.reverse(list);
		//새로운 외부 클래스
		Collections.sort(list, new OrderLogic());
		
		System.out.println("====내림차순정렬하기====");
		printList(list);
		System.out.println("문자열 정렬하기");
		list.clear();
		list.add("홍지운");
		list.add("유병승");
		list.add("김도환");
		list.add("이성준");
		System.out.println("==오름차순 ====");
		Collections.sort(list);
		printList(list);
		
		Collections.sort(list,new OrderStringLow());
		System.out.println("==실행후 ====");
		printList(list);
		
		//객체를 정렬해보자
		//list에 객체가 있을대 정렬하기
		list.clear();
		list.add(new Person("유병승",19,"경기도 시흥시"));
		list.add(new Person("홍지운",28,"광주"));
		list.add(new Person("김가남",27,"서울"));
		list.add(new Person("박정연",26,"서울"));
		System.out.println("정렬전 출력");
		printList(list);
		System.out.println("정렬후 출력");
		Collections.sort(list);
		printList(list);
		
		//람다를 적용하면 좀더 쉬운 방법으로 구현이 가능함;
		list.clear();
		list.add("홍지운");
		list.add("유병승");
		list.add("김도환");
		list.add("이성준");
		Collections.sort(list,(i,j)->((String)j).compareTo((String)i));
		
		
	
		
	}
	//linkedList
	//ArrayList와 동일함, 데이터를 수정,삭제,추가가
	//번번히 일어나는 로직에서는 arrayList보다 좋은 성능을 가지고 있음
	public void linkedListTest() {
		LinkedList list=new LinkedList();
		list.add("유병승");
		list.add("김도환");
		list.add("한승연");
		printList(list);
		//처음값과 끝값을 확인 할 수 있음
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
	}
	public void setTest() {
		//Set에 대해 알아보자
		//Set동일하게 객체를 저장하는 클래스
		//종류: HashSet,TreeSet
		//특징 : 순서가 없고, 중복값을 저장하지 않음
		HashSet set=new HashSet();
		//set에 데이터 넣기
		//add()메소드를 이용함
		set.add("유병승");
		set.add("김도환");
		set.add("온영석");
		set.add("강승윤");
		set.add("강범석");
		
		//set에 있는 데이터 출력할때는 
		//get을 이용할수 없음
		//Interator객체를 이용해서 출력함
		Iterator it=set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
		//set은 for each문을 이용해서도 순회가 가능함
		for(Object o : set) {
			System.out.println(o);
		}
		
		
		HashSet random=new HashSet();
//		for(int i=0;i<7;i++) {
//			random.add((int)(Math.random()*44)+1);
//		}
		//중복값 제거하고 값받기
		while(true) {
			random.add((int)(Math.random()*44)+1);
			if(random.size()==7) {
				break;
				//메소드->size() -set에 있는 데이터 갯수 확인
			}
		}
		//Iterator 한번사용하면 다시 생성해서 사용
		// it=random.iterator();//다시 사용하는 방법
		 it=random.iterator();
			while(it.hasNext()) {
				int name=(int)it.next();
				if(name==3) {
					System.out.println(name);
				}
			}
		 
		
		//set에서 특정값을 불러오려면?
		//set객체에 유병승만 출력
		System.out.println("=================");
		Iterator dd=set.iterator();
		while(dd.hasNext()) {
			String nn=(String)dd.next();
			if(nn.equals("유병승")) {
				
				System.out.println(nn);
				}
			}
		
		
		//객체중복값 제거->equals,hashcode값
		Set member=new HashSet();
		member.add(new Member("admin","1234","관리자",'남'));
		member.add(new Member("user01","1111","유저1",'남'));
		member.add(new Member("user02","2222","유저2",'여'));
		member.add(new Member("user03","3333","유저3",'남'));
		member.add(new Member("admin","1234","관리자",'남'));
		
		printSet(member);
		
		//set에 있는 데이터 삭제하기
		//remove(객체)메소드를 이용해서 삭제 가능
		member.remove(new Member("admin","1234","관리자",'남'));
		System.out.println("삭제후 객체");
		printSet(member);
		//set에 있는 데이터를 모두 지우려면
		System.out.println("====전체 데이터 지우기 =====");
		member.clear();
		printSet(member);
		
		List list=new ArrayList();
		for(int i=0;i<10;i++) {
			list.add((int)(Math.random()*20)+1);
		}
		printList(list);
		//리스트의 중복값을 Set을이용해서 제거하는 방법
		//리스트를 해쉬셋에 매개변수로 넣고
		//해쉬셋을 통해 중복값을 제거후에 다시 리스트로 생성
		//매개변수로 해쉬셋으로 중복값 제거한 값을 넣는다
		
		HashSet test=new HashSet(list);
		list=new ArrayList(test);
		printList(list);
		
		//Set도 배열로 변환할 수 있다.
		
		printSet(set);
		Object[] objs=set.toArray();
		System.out.println(objs[0]);
//		for(Object o : objs) {
//			System.out.println(o);
//		}
		
		
	}
	private void printSet(Set s) {
		Iterator it=s.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	
	private void printList(List list) {
		for(Object o: list) {
			System.out.println(o);
		}

	}
	//list는 순서가 있다
	
}
