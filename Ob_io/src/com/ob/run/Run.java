package com.ob.run;

import com.ob.controller.StudentController;
import com.ob.vo.Student;

public class Run {

	public static void main(String[] args) {
			StudentController sc=new StudentController();
			Student s=new Student("�ӵ���",21,213,"Rclass",5);
			sc.saveDate(s);
			
			System.out.println(sc.loadDate());
			Student[] st= {new Student("�ӵ���",123,312,"Rclass",2),(new Student("������",231,123,"Rclass",2))};
			sc.saveDate(st);
			Student[] psd=sc.IloadDate();
			for(Object p:psd) {
				System.out.println(p);
			}
		}
	}


