package com.kh.practice.list.music.compare;

import java.util.Comparator;

public class AscTitle implements Comparator <Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		//Title�� ������������ ����

		if(o1>o2)return -1;
		else  if(o1<o2)return 1;
		else return 0;
		
	}

}
