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
		//���׸��̶� 
		//Ŭ���� ����ÿ� �ڷ����� ������ �ʰ� ������ Ŭ������ ������� ����
		//�ڷ����� �����ϰ� �ϴ� ��, �÷��ǿ� ����Ǵ� ��ü�� Ư�� ��ü��
		//���Ե� �� �ְ� ������ �� �ִ�.
		List members=new ArrayList();
		//members���� Member��ü�� ��������!!!
		members.add(new Member("a","a","����",'��'));
		members.add(new Date());//��?? ��..�� 
		
		//���׸��� �����ϸ� Ư����ü�� ���� ������ �� ����
		//���׸��� �����ϴ� ��� -> �ڷ��� ���� <�ڷ���>
		List<Member> genMembers=new ArrayList<Member>();
		genMembers.add(new Member());
		//genMembers.add(new Date());
		
		//Set
		Set<Integer> test=new HashSet();
		test.add(1);
		test.add(2);
		//test.add("����");
		//test.add(new Member());
		
		//map
		Map<String,String> map=new HashMap();
		map.put("email","prince0324@naver.com");
		//map.put(1,"�̰ŴµǴ�?");
		
		Map<Integer,Member> mapMembers=new HashMap();
		mapMembers.put(1,new Member("admin","1234","������",'��'));
		mapMembers.put(2,new Member("user1","1","����1",'��'));
		mapMembers.put(3,new Member("user2","2","����2",'��'));
		
		Member m=(Member)members.get(0);
		m=genMembers.get(0);//����ȯ�� �����ʾƵ� ��.
		//ȸ���̸��� ����ϰ� �ʹ�.
		((Member)members.get(0)).getName();
		genMembers.get(0).getName();
		
		
		//���̵� admin�� ȸ���� �̸�
		Set<Map.Entry<Integer, Member>> entry=mapMembers.entrySet();
		Iterator<Map.Entry<Integer,Member>> it=entry.iterator();
		while(it.hasNext()) {
			Map.Entry<Integer,Member> member=it.next();
			if(member.getValue().getId().equals("admin")) {
				System.out.println(member.getValue().getName());
			}
		}
		
		
		//MyGeneric�̿��ϱ�
		MyGenericObj<String> obj=new MyGenericObj<String>();
		obj.getTestValue();
		MyGenericObj<Member> obj2=new MyGenericObj<Member>();
		obj2.getTestValue();
		
		
		
	}

}
