package com.generic.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.generic.model.vo.Member;
import com.generic.model.vo.MyGenericObj;

public class GenericTest {

	public static void main(String[] args) {
		//제네릭이란 
		//클래스 설계시에 자료형을 정하지 않고 생성시 클래스의 멤버변수 등의
		//자료형을 결정하게 하는 것, 컬렉션에 저장되는 객체를 특정 객체만
		//대입될 수 있게 관리할 수 있다.
		List members=new ArrayList();
		//members에는 Member객체만 저장하자!!!
		members.add(new Member("a","a","유저",'남'));
		members.add(new Date());//헐?? ㅡ..ㅡ 
		
		//제네릭을 선언하면 특정객체만 들어가게 설정할 수 있음
		//제네릭을 선언하는 방법 -> 자료형 옆에 <자료형>
		List<Member> genMembers=new ArrayList<Member>();
		genMembers.add(new Member());
		//genMembers.add(new Date());
		
		//Set
		Set<Integer> test=new HashSet();
		test.add(1);
		test.add(2);
		//test.add("병승");
		//test.add(new Member());
		
		//map
		Map<String,String> map=new HashMap();
		map.put("email","prince0324@naver.com");
		//map.put(1,"이거는되니?");
		
		Map<Integer,Member> mapMembers=new HashMap();
		mapMembers.put(1,new Member("admin","1234","관리자",'남'));
		mapMembers.put(2,new Member("user1","1","유저1",'남'));
		mapMembers.put(3,new Member("user2","2","유저2",'여'));
		
		Member m=(Member)members.get(0);
		m=genMembers.get(0);//형변환을 하지않아도 됨.
		//회원이름을 출력하고 싶다.
		((Member)members.get(0)).getName();
		genMembers.get(0).getName();
		
		
		//아이디 admin인 회원의 이름
		Set<Map.Entry<Integer, Member>> entry=mapMembers.entrySet();
		Iterator<Map.Entry<Integer,Member>> it=entry.iterator();
		while(it.hasNext()) {
			Map.Entry<Integer,Member> member=it.next();
			if(member.getValue().getId().equals("admin")) {
				System.out.println(member.getValue().getName());
			}
		}
		
		
		//MyGeneric이용하기
		MyGenericObj<String> obj=new MyGenericObj<String>();
		obj.getTestValue();
		MyGenericObj<Member> obj2=new MyGenericObj<Member>();
		obj2.getTestValue();
		
		
		
	}

}
