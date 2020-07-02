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
	// map����ϱ�
	public void mapTest() {
		// map�� list,set�� ������ ��ü�� �����ϴ� Ŭ����
		// �����ϴ� ����� key:value(��:��ü)�������� �Ǿ� ����
		// key:Object�ڷ������� �Ǿ� ���� �ַ� String,int
		// value : Object�ڷ������� �Ǿ���
		// ����:HashMap,TreeMap,LinkedHashMap
		HashMap map = new HashMap();
		// map�� ���� �����Ҷ��� �ΰ����� �����ؾ���.
		// key���� value���� �����Ѵ�.
		// put()�޼ҵ带 �̿� put(key,value);
		map.put(1, "������");
		map.put(2, "�赵ȯ");
		map.put(3, "�̼���");
		map.put("userId", "admin");
		map.put("password", "1234");

		map.put("����", new Member("admin", "1234", "������", '��'));

		// ���� ����ϱ�->key������value���� ������
		// get(key��)
		System.out.println(map.get(2));
		System.out.println(map.get("����"));
		System.out.println("password : " + map.get("password"));
		
		//map�� �ִ� ������ ���� ȣ���ϱ�
		//map�����ʹ� key���� �������� ȣ���� �����ϱ� ������
		//���� key���� �����;���
		//key�� �������� Set��������� �ߺ����� �ʴ´�/
		Set keys=map.keySet();//map�� �ִ� ��� key���� �����´�
		Iterator it=keys.iterator();
		while(it.hasNext()) {
			Object o=it.next();
			System.out.println("�� : "+map.get(o));
		}
		//entySet()�� �̿��Ͽ� map�� �մ� key���� value���� ���ÿ� ��������
		Set mapEntry=map.entrySet();
		Iterator it2=mapEntry.iterator();
		while(it2.hasNext()) {
			Map.Entry all=(Map.Entry)it2.next();
			//Map.Entry���� map�� key���� value���� ��� ������ ����
			//key-> getKey();
			//value->getvalue();
			System.out.println("key: "+all.getKey()+" \n�� : "+all.getValue());
			
		
		}
		//map���� key���� �ߺ� �Ұ�����
		//����Ǿ��ִ� ������ key������ ���ϸ� ������Ѵ�
		
		
//		for(Object o:keys) {
//			System.out.println(o);
//		}
	
	}
	//Properties�� ���� �˾ƺ���
	public void propertiesTest() {
		//������Ƽ�� ��ü�� key:value��������
		//����Ǵ� Ŭ������ ���ڿ� ����
		//key : String, value : String
		//���ϰ� �����Ͽ� ���Ͽ� �����ϰ� ���Ͽ� ����� 
		//������ �ҷ��� �� �ִ� Ŭ����
		Properties prop=new Properties();
		//properties��ü�� ������ �ֱ�
		//setProperty(Ű,��);
		prop.setProperty("admin","������");
		prop.setProperty("1", "�ȳ�");
		
		//���Ϸ� �����ϴ� ���
		//store(���ڿ� ��Ʈ��FileWriter)
		try {
			
			prop.store(new FileWriter("prop.properties"),"datasave");
		}catch(IOException e) {
			e.printStackTrace();
			
		}
		//properties���Ͽ� �ִ� �����͸� �ҷ��� �� ����
		//FileReader�� �̿��ؼ� ���
		try {
			prop.load(new FileReader("myprop.properties"));
		}catch(IOException e) {
			e.printStackTrace();
		}
		//���Ͽ� ����� �����ʹ� key������ �ҷ��� �� ����
		//getProperty(���ڿ��� key��)
		System.out.println(prop.getProperty("user"));
		System.out.println(prop.getProperty("pw"));
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("gender"));
	}


}
