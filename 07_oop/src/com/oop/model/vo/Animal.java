package com.oop.model.vo;

public class Animal {
	public static int count;
	public int aniNo;
	public String name;
	public String category;
	public String seosickge;
	public int year;
	public char gender;
	//초기화 블록 설정하기
	{//객체를 생성할때 마다 실행
		name="개코원숭이";
		category="원숭이과";
		seosickge="아프리카";
		year=20;
		gender='여';
		aniNo=count++;
				
	}
	//클래스변수 초기화
	static {//단한번만 실행
		count=0;//필드(멤버변수)가 아닌 클래스변수만 수행가능
				//이유는 static은 프로그램 실행시 저장공간 확복
				//필드는 new선언시에만 heap영역으로 올라온다
		
	}
}
