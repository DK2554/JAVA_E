package com.objectStream.run;

import com.objectStream.controller.StudentController;
import com.objectStream.controller.StudentController2;
import com.objectStream.vo.Student;
import com.objectStream.vo.Student2;

public class Run {

	public static void main(String[] args) {
		Student s=new Student("임동욱",25,321,"Rclass",3);
		Student2 s2=new Student2("공부하자",30,123,"Rclass",3);
		Student[] st= {new Student("강승윤",35,123,"Rclass",5),new Student("최민수",26,123,"Rclass",4),
				new Student("홍창현",25,123,"Rclass",5)};
		StudentController sc=new StudentController();
		StudentController2 sc2=new StudentController2();
		sc.saveData(s);
		sc2.saveDate(s2);
		Student2 psc2=sc2.loadDate();
		Student psc=sc.loadstudent();
		System.out.println(psc);
		System.out.println(psc2);
		System.out.println("==오브젝트 스트림 사용====");
		sc.savaData(st);
		Student[]st1=sc.loadPersons();
		for(Student s1:st1) {
			System.out.println(s1);
		}
		
	}

}
