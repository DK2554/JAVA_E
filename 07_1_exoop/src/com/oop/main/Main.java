package com.oop.main;

import com.oop.controller.MemberController;
import com.oop.model.vo.Employee;

public class Main {

	public static void main(String[] args) {
		//ȸ�� 3���� ����ϰ� �������� ����غ���
		Employee[] em=new Employee[3];
		
		em[0]=new Employee("Hong","Hong123","ȫ�浿",25,"����","0105555555","hong@naver.com");
		em[1]=new Employee("yong","yong123","����",32,"����","0101234567","yong@naver.com");
		em[2]=new Employee("dong","dong123","����",25,"����","01022222222","ldu0215@naver.com");
		//set�� ���� ���� ������ �������� ���ٷ� �ۼ������� Ʋ�� �κ��� �˱� ���ϰ� �ϱ����ؼ�(������)
		//if(em[i]!=null)=->�ּҰ��� ���� �ƴϸ� �����ϴ� ����;
	for(Employee em2 : em) {
		System.out.println(em2.allData());
	}
	
	
	MemberController emm=new MemberController();
	emm.enrollMember();//ȸ�����
	emm.printMembers();//��ϵ� ��� ȸ�� ���
	}
}
