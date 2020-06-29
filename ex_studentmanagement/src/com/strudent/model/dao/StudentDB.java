package com.strudent.model.dao;

import com.student.model.vo.Grade;
import com.student.model.vo.Student;

public class StudentDB {
	//Student객체를 저장하는 공강
	private Student s;
	private Student s1;
	private Student s2;
	private Student[] student;
	
	public StudentDB() {
		
	}
	public void enrollStudent(Student s) {
		//멤버변수에 학생을 저장하는 기능
		if(this.s==null) {
			this.s=s;	
		}else if(this.s1==null) {
			this.s1=s;
		}else if(this.s2==null) {
			this.s2=s;
		}else {
			System.out.println("저장할 공간이 없습니다.");
		}
		
	}
	//조회한 학생의 정보를 넘겨준다
	public Student searhMember() {
		return s;
	}
	
}
