package com.collection.controller;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import com.collectioc.model.vo.Member;

public class MapTest {
	// map사용하기
	public void mapTest() {
		// map은 list,set과 동일한 객체를 저장하는 클래스
		// 저장하는 방식이 key:value(값:객체)형식으로 되어 있음
		// key:Object자료형으로 되어 있음 주로 String,int
		// value : Object자료형으로 되었음
		// 종류:HashMap,TreeMap,LinkedHashMap
		HashMap map = new HashMap();
		// map에 값을 대입할때는 두개값을 대입해야함.
		// key값과 value값을 대입한다.
		// put()메소드를 이용 put(key,value);
		map.put(1, "유병승");
		map.put(2, "김도환");
		map.put(3, "이성준");
		map.put("userId", "admin");
		map.put("password", "1234");

		map.put("병승", new Member("admin", "1234", "유병승", '남'));

		// 값을 출력하기->key값으로value값을 가져옴
		// get(key값)
		System.out.println(map.get(2));
		System.out.println(map.get("병승"));
		System.out.println("password : " + map.get("password"));
		
		//map에 있는 데이터 전부 호출하기
		//map데이터는 key값을 기준으로 호출이 가능하기 땜누에
		//먼저 key값을 가져와야함
		//key의 저장방식은 Set방식임으로 중복되지 않는다/
		Set keys=map.keySet();//map에 있는 모든 key값을 가져온다
		Iterator it=keys.iterator();
		while(it.hasNext()) {
			Object o=it.next();
			System.out.println("값 : "+map.get(o));
		}
		//entySet()을 이용하여 map에 잇는 key값과 value값을 동시에 가져오자
		Set mapEntry=map.entrySet();
		Iterator it2=mapEntry.iterator();
		while(it2.hasNext()) {
			Map.Entry all=(Map.Entry)it2.next();
			//Map.Entry에는 map의 key값과 value값을 모두 가지고 있음
			//key-> getKey();
			//value->getvalue();
			System.out.println("key: "+all.getKey()+" \n값 : "+all.getValue());
			
		
		}
		//map에서 key값은 중복 불가능함
		//저장되어있는 동일한 key값으로 정하면 덮어쓰기한다
		
		
//		for(Object o:keys) {
//			System.out.println(o);
//		}
	
	}
	//Properties에 대해 알아보자
	public void propertiesTest() {
		//프로퍼티스 객체는 key:value형식으로
		//저장되는 클래스로 문자열 전용
		//key : String, value : String
		//파일과 연동하여 파일에 저장하고 파일에 저장된 
		//내용을 불러올 수 있는 클래스
		Properties prop=new Properties();
		//properties객체에 데이터 넣기
		//setProperty(키,값);
		prop.setProperty("admin","유병승");
		prop.setProperty("1", "안녕");
		
		//파일로 저장하는 기능
		//store(문자열 스트림FileWriter)
		try {
			
			prop.store(new FileWriter("prop.properties"),"datasave");
		}catch(IOException e) {
			e.printStackTrace();
			
		}
		//properties파일에 있는 데이터를 불러올 수 있음
		//FileReader을 이용해서 사용
		try {
			prop.load(new FileReader("myprop.properties"));
		}catch(IOException e) {
			e.printStackTrace();
		}
		//파일에 저장된 데이터는 key값으로 불러올 수 있음
		//getProperty(문자열로 key값)
		System.out.println(prop.getProperty("user"));
		System.out.println(prop.getProperty("pw"));
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("gender"));
	}


}
