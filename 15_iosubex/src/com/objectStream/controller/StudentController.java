package com.objectStream.controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.objectStream.vo.Student;

public class StudentController {
	//한명출력만 출력하면 됨
	public void saveData(Student s) {
		try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("student.txt"))){
			oos.writeObject(s);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	public Student loadstudent() {
		Student st=new Student();
		try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("student.txt"))){
			st=(Student)ois.readObject();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		return st;
	}
	public  void savaData(Student[] st) {
		try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("student.txt"))){
			//객체를 저장
			oos.writeObject(st);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	public Student[] loadPersons() {
		Student[]st=null;
		try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("student.txt"))){
			st=(Student[])ois.readObject();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		return st;
	}

}
