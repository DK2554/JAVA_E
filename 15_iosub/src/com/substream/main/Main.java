package com.substream.main;

import java.util.Scanner;

import com.substream.controller.DataSubstream;
import com.substream.controller.ObjectSubStream;
import com.substream.controller.PesonData;
import com.substream.model.vo.Person;

public class Main {

	public static void main(String[] args) {
		DataSubstream dss=new DataSubstream();
//		dss.saveDate("������", 19, '��', 180.5);
//		dss.loadData();
		PesonData psd=new PesonData();
		//�����͸� �Ѱ��� ����
		//�ټ��� Person�� �����ϰ� �ҷ�������??
		//��ü �迭 �̿��ؼ� ó��!
		
		Person p=new Person("�����",25,'��',165.5,45.5);
		Person[] ps= {new Person("�赵ȯ",27,'��',187.3,80.5),new Person("�̼���",27,'��',179.3,75.5)};
		
		//psd.personsave(p);
		psd.savePersons(ps);
		//����� �ټ��� ��ü�� �ҷ�����
		Person[] saveData=psd.loadPersons();
		for(Person pp: saveData) {
			System.out.println(pp);
		}
		
		
//		Person saveDate=psd.personload();
//		System.out.println(saveDate);
		//��ü��ü�� �����ϱ�
		//ObjectStream���
		ObjectSubStream obs=new ObjectSubStream();
		obs.saveObject(p);
		Person objp=obs.loadPerson();
		System.out.println(objp);
		obs.savaPersons(ps);
		Person[] ps2=obs.loadPersons();
		System.out.println("========������Ʈ ��Ʈ������ ��������!-======");
		for(Person p1:ps2) {
			System.out.println(p1);
		}
		
		
	}

}
