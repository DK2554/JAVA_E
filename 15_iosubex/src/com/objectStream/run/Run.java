package com.objectStream.run;

import com.objectStream.controller.StudentController;
import com.objectStream.vo.Student;

public class Run {

	public static void main(String[] args) {
		Student s=new Student("�ӵ���",25,321,"Rclass",3);
		Student[] st= {new Student("������",35,123,"Rclass",5),new Student("�ֹμ�",26,123,"Rclass",4),
				new Student("ȫâ��",25,123,"Rclass",5)};
		StudentController sc=new StudentController();
		
		sc.saveData(s);
		Student psc=sc.loadstudent();
		System.out.println(psc);
		System.out.println("==������Ʈ ��Ʈ�� ���====");
		sc.savaData(st);
		Student[]st1=sc.loadPersons();
		for(Student s1:st1) {
			System.out.println(s1);
		}
		
	}

}
