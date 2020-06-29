package com.substream.controller;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.substream.model.vo.Person;

public class PesonData {
	
	public void personsave(Person p) {
		//try with
		
		try(FileOutputStream fos=new FileOutputStream("person.data");
				BufferedOutputStream bos=new BufferedOutputStream(fos);
				DataOutputStream dos=new DataOutputStream(bos)){
			dos.writeUTF(p.getName());
			dos.writeInt(p.getAge());
			dos.writeChar(p.getGender());
			dos.writeDouble(p.getHeight());
			dos.writeDouble(p.getWeight());
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	public Person personload() {
		Person p=new Person();
		try(FileInputStream fis=new FileInputStream("person.data");
				BufferedInputStream bis=new BufferedInputStream(fis);
				DataInputStream dis=new DataInputStream(bis)){
			
			p.setName(dis.readUTF());
			p.setAge(dis.readInt());
			p.setGender(dis.readChar());
			p.setHeight(dis.readDouble());
			p.setWeight(dis.readDouble());
		
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		return p;
	}
	//객체배열을 이용하여 파일에 Person 데이터 저장하기
	public void savePersons(Person[] ps) {
		try(DataOutputStream dos=new DataOutputStream(new FileOutputStream("persons.data"))){
			for(Person pp:ps) {
				dos.writeUTF(pp.getName());
				dos.writeInt(pp.getAge());
				dos.writeChar(pp.getGender());
				dos.writeDouble(pp.getHeight());
				dos.writeDouble(pp.getWeight());
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	//다수 Person데이터 불러오기
	public Person[] loadPersons() {
		Person[] load=new Person[2];
//		load[0]=new Person();
//		load[1]=new Person();
		try(DataInputStream dis=new DataInputStream(new FileInputStream("persons.data"))){
//			for(Person p: load) {
			for(int i=0;i<load.length;i++) {
				load[i]=new Person();
				load[i].setName(dis.readUTF());
				load[i].setAge(dis.readInt());
				load[i].setGender(dis.readChar());
				load[i].setHeight(dis.readDouble());
				load[i].setWeight(dis.readDouble());
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		return load;
	}
	
	
	

}
