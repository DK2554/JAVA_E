package com.substream.controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.substream.model.vo.Person;

public class ObjectSubStream {
	//������Ʈ ��Ʈ���� ��ü ��ü�� ������ϴ� ��Ʈ��
	//ObjectOutputStream,ObjectInputStream
	
	public void saveObject(Person p) {
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		try {
			fos=new FileOutputStream("object.data");
			oos=new ObjectOutputStream(fos);
			//object�� �����ϱ�
			//writeObject�޼ҵ� �̿�
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
			//�����͸� �����ö���...
			//readObject()�޼ҵ� Ȱ�� ��!
			
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
			//��ü�� ����
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
