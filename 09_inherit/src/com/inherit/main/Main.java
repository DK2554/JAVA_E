package com.inherit.main;

import com.inherit.model.vo.Employee;
import com.inherit.model.vo.Student;
import com.inherit.model.vo.Teacher;
import com.inherit.model.vo.Test;

public class Main {
	public static void main(String[] args) {
		//객체 상속관계 알아보기
		//Student ,Employee객체 기본생성
		Student st=new Student();
		Employee em=new Employee();
		Teacher t=new Teacher();
		System.out.println(st.getName());//학생 이름
		System.out.println(em.getName());//사원 이름
		System.out.println(t.getName());
		
		//상속받지 않은 객체 확인하기
		//object객체를 상속받는 것을 확인할 수 있음
		//new Test().
		//Student s1=new Student("유병승",3,1,"경기도 시흥시","010123","남")
		Student s1=new Student(3,1);
		//생성자로 모든값을 초기화하고 싶다
		//super.
		s1=new Student("유병승",3,1,"경기도","0100000",'남');
		System.out.println(s1.infomation());
		Student s2=new Student("유병승",3,1,"경기도","0100000",'남');
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		//사용자 정의 메소드 오버라이딩 하기
		Student s6=new Student("유병승",3,1,"경기도","01010",'남');
		Employee e1 = new Employee("유병승","경기도","1010",'남',1000,"강사부","강사");
		System.out.println(s6.infomation());
		System.out.println(e1.infomation());
		
		//참조형 변수를 출력하면 주소값x=>object클래스의 toString()실행
				
	}

}
