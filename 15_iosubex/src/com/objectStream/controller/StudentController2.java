package com.objectStream.controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.objectStream.vo.Student;
import com.objectStream.vo.Student2;

public class StudentController2 {
	public void saveDate(Student2 s2) {
		try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("students2.txt"))){
			oos.writeObject(s2);
		}catch (IOException e) {
			e.printStackTrace();
		}
}
		
	
	public Student2 loadDate() {
		Student2 st2=new Student2();
		try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("students2.txt"))){
			st2=(Student2)ois.readObject();
		}catch(IOException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		return st2;
		
	}
	

}
