package com.substream.controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.substream.model.vo.Person;

public class ObjectSubStream {
	//오브젝트 스트림은 객체 자체를 입출력하는 스트림
	//ObjectOutputStream,ObjectInputStream
	
	public void saveObject(Person p) {
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		try {
			fos=new FileOutputStream("object.data");
			oos=new ObjectOutputStream(fos);
			//object를 저장하기
			//writeObject메소드 이용
			oos.writeObject(p);
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try
			{
				oos.close();
			}
			
		catch(IOException e) {
			e.printStackTrace();
		}
		}
	}
	public Person loadPerson() {
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		Person p=new Person();
		try {
			fis=new FileInputStream("object.data");
			ois=new ObjectInputStream(fis);
			//데이터를 가져올때는...
			//readObject()메소드 활용 끝!
			
		 p=(Person)ois.readObject();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				ois.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		return p;
	}
	public void savaPersons(Person[] ps) {
		try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("objects.data"))){
			//객체를 저장
			oos.writeObject(ps);
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	public Person[] loadPersons() {
		Person[]ps =null;
		try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("objects.data"))){
			ps=(Person[])ois.readObject();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		return ps;
		
	}
	

}
