package com.string.test;

public class WeapperTest {

	public static void main(String[] args) {
		//wrapper클래스 활용하기
		int age=10;
		Integer test;//기본 int형자료형을 표현하는 객체
		test=age;;//int형을 자동으로 Integer객체로 변환하여 넣어줌 오토박싱
		Object obj=test;
		obj=test;//기본자료형을 Interger객체로 변경해서 넘겨주기 때문에 오토박싱
		System.out.println(obj instanceof Integer);
		//객체끼리는 자동형변환이 불가능하다.
		
		//Integer형은 Double형 변수에 못넣는가?

		//웹에서 프론트단에서 데이터 전송하면 모든데이터는 String으로 넘어옴
		int age1=Integer.parseInt("19");
		//Intrger에서 활용할 수 있는 변수
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		//다른 자료형을 String으로 변경하는 방법
		//test를 문자형으로 변경하기
		String convertInteger=String.valueOf(test);
		System.out.println(convertInteger);
		
		
		//Wrapper클래스는 기본적 연산처리도 가능함
		Integer su=10;
		Double su2=3.14;
		System.out.println(su+su2);
		int intSu=su;
		double doubleSu2=su2;
		System.out.println(intSu*doubleSu2);

	}

}
