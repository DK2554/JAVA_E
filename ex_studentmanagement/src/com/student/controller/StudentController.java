package com.student.controller;

import com.strudent.model.dao.StudentDB;
import com.student.model.vo.Grade;
import com.student.model.vo.Student;
import com.student.view.MainView;

public class StudentController {
	private StudentDB db = new StudentDB();

	// ����ȭ������ �̵��� ȣ���ϴ� ���
	public void MainMenu() {
		new MainView().mainMenu(this);
	}

	// �л��� ��ϱ�� ����
	public void enrollStudent() {
		// �л����ȭ���� ���
		Student s = new MainView().enrollStudent();
		// ������ ����
		// s��� ���� studenDB�� �ȿ� �����ϴ� ��
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
