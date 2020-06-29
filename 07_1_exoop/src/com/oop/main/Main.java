package com.oop.main;

import com.oop.controller.MemberController;
import com.oop.model.vo.Employee;

public class Main {

	public static void main(String[] args) {
		//회원 3명을 등록하고 그정보를 출력해보자
		Employee[] em=new Employee[3];
		
		em[0]=new Employee("Hong","Hong123","홍길동",25,"남성","0105555555","hong@naver.com");
		em[1]=new Employee("yong","yong123","영석",32,"남성","0101234567","yong@naver.com");
		em[2]=new Employee("dong","dong123","동욱",25,"남성","01022222222","ldu0215@naver.com");
		//set을 많이 쓰는 이유는 가독성과 한줄로 작성했을때 틀린 부분을 알기 편하게 하기위해서(가독성)
		//if(em[i]!=null)=->주소값이 널이 아니면 실행하는 구문;
	for(Employee em2 : em) {
		System.out.println(em2.allData());
	}
	
	
	MemberController emm=new MemberController();
	emm.enrollMember();//회원등록
	emm.printMembers();//등록된 모든 회원 출력
	}
}
