package com.collection.controller;

import java.util.Comparator;

public class OrderLogic implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		//반환값은 0,1,-1로 구성하면 됨.
		//오름차순
		//0 : 두값이 같다
		//1 : o1이 o2보다 크면
		//-1:o1이o2보다 작으면
		//내림차순
		//0 : 두값이 같다
		//1 : o1이 o2보다 작으면
		//-1:o1이o2보다 크면
		//내림차순 정렬
		if(o1>o2) return -1;//바꾸지마
		else if(o1<o2)return 1;//바꿔
		else return 0 ;//바꾸지마
			
	}	
	
}
