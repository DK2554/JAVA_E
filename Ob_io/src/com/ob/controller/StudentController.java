package com.ob.controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.ob.vo.Student;

public class StudentController {
	public void saveDate(Student s) {
		try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("student.txt"))){
			oos.writeObject(s);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	public Student loadDate() {
		Student s=new Student();
		try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("student.txt"))){
			s=(Student)ois.readObject();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		return s;
	}
	public void saveDate(Student[] s) {
		try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("student.txt"))){
			oos.writeObject(s);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	public Student[] IloadDate() {
		Student[] st=null;
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
