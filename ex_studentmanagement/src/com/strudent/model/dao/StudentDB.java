package com.strudent.model.dao;

import com.student.model.vo.Grade;
import com.student.model.vo.Student;

public class StudentDB {
	//Student��ü�� �����ϴ� ����
	private Student s;
	private Student s1;
	private Student s2;
	private Student[] student;
	
	public StudentDB() {
		
	}
	public void enrollStudent(Student s) {
		//��������� �л��� �����ϴ� ���
		if(this.s==null) {
			this.s=s;	
		}else if(this.s1==null) {
			this.s1=s;
		}else if(this.s2==null) {
			this.s2=s;
		}else {
			System.out.println("������ ������ �����ϴ�.");
		}
		
	}
	//��ȸ�� �л��� ������ �Ѱ��ش�
	public Student searhMember() {
		return s;
	}
	
}
