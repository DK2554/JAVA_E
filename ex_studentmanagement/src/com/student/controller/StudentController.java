package com.student.controller;

import com.strudent.model.dao.StudentDB;
import com.student.model.vo.Grade;
import com.student.model.vo.Student;
import com.student.view.MainView;

public class StudentController {
	private StudentDB db = new StudentDB();

	// 메인화면으로 이동을 호출하는 기능
	public void MainMenu() {
		new MainView().mainMenu(this);
	}

	// 학생을 등록기능 관리
	public void enrollStudent() {
		// 학생등록화면을 출력
		Student s = new MainView().enrollStudent();
		// 변수에 저장
		// s라는 값을 studenDB의 안에 저장하는 것
		db.enrollStudent(s);
	}

	public void searchStudent() {
		Student s = db.searhMember();
		new MainView().printStudent(s);
	}

	public void gradeController() {
		Grade gr = new MainView().gradeStudent();
	}
}
