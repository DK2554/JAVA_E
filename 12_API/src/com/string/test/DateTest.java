package com.string.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateTest {
	public static void main(String[] args) {
		//날짜 활용하기
		//오늘 날짜 출력
		Date today=new Date();
		System.out.println(today);
		Date day=new Date(1111196543578L);//매개변수 있는 생성자
		System.out.println(day);
		//날짜를 표시할때는 Data말고 Calendar GregorianCalender사용
		//Calendar사용하기
		//Calendar는 new연산자를 생성하지 않고 생성된것을 가져온다
		//Calendar는 생성자가 접근제한자가 protected로 되어있어ㅓ외부에서 생성자 이용이 불가능함
		//getInstace()메소드를 이용해서 객체를 가져옴
		Calendar day2=Calendar.getInstance();
		System.out.println(day2.get(Calendar.YEAR));//년도
		System.out.println(day2.get(Calendar.MONTH)+1);
		//월을 출력할때 주의 할점!!!!
		//월은 인데스와 마찮가지로 0부터 시작함.-1월
		System.out.println(day2.get(Calendar.DATE));
		System.out.println(day2.get(Calendar.YEAR)+"년"+(day2.get(Calendar.MONTH)+1)+"월"+day2.get(Calendar.DATE)+"일");
		today=new Date(day2.getTimeInMillis());
		System.out.println(today);
		//Calendar에 원하는 날짜 대입하기
		
		day2.set(1994,12-1,31);
		System.out.println(new Date(day2.getTimeInMillis()));
		
		GregorianCalendar birthday=new GregorianCalendar(1989,(7-1),18);
		System.out.println(birthday.get(Calendar.MONTH)+1);
		System.out.println(new Date(birthday.getTimeInMillis()));
		
		//날짜를 패튼으로 표현하는 객체를 이용해서 원하는 방식으로 출력하기
		//SimpleDateFormat객체 이용
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy년-MM월-dd일");
		String day3=sdf.format(new Date(birthday.getTimeInMillis()));
		System.out.println(day3);
	}
}
