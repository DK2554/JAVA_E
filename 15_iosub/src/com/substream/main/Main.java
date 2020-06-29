package com.substream.main;

import java.util.Scanner;

import com.substream.controller.DataSubstream;
import com.substream.controller.ObjectSubStream;
import com.substream.controller.PesonData;
import com.substream.model.vo.Person;

public class Main {

	public static void main(String[] args) {
		DataSubstream dss=new DataSubstream();
//		dss.saveDate("유병승", 19, '남', 180.5);
//		dss.loadData();
		PesonData psd=new PesonData();
		//데이터를 한개만 저장
		//다수의 Person을 저장하고 불러오려면??
		//객체 배열 이용해서 처리!
		
		Person p=new Person("김민지",25,'여',165.5,45.5);
		Person[] ps= {new Person("김도환",27,'남',187.3,80.5),new Person("이성준",27,'남',179.3,75.5)};
		
		//psd.personsave(p);
		psd.savePersons(ps);
		//저장된 다수의 객체를 불러오기
		Person[] saveData=psd.loadPersons();
		for(Person pp: saveData) {
			System.out.println(pp);
		}
		
		
//		Person saveDate=psd.personload();
//		System.out.println(saveDate);
		//객체자체를 저장하기
		//ObjectStream사용
		ObjectSubStream obs=new ObjectSubStream();
		obs.saveObject(p);
		Person objp=obs.loadPerson();
		System.out.println(objp);
		obs.savaPersons(ps);
		Person[] ps2=obs.loadPersons();
		System.out.println("========오브젝트 스트림으로 가져오기!-======");
		for(Person p1:ps2) {
			System.out.println(p1);
		}
		
		
	}

}
