package com.string.test;

import java.util.StringTokenizer;

public class StringTest {

	public static void main(String[] args) {
		//String 객체는 불변의 데이터를 가진다
		//내부에 저장되어 있는 데이터 저장공간을 수정할수 없다
		String name="유병승";
		System.out.println(name);
		System.out.println(name.hashCode());
		//자주 사용하는 메소드
		//1.concat():문자열을 합치는 메소드 반환변수에 대입
		String a="김도환";
		String b="반장";
		String c=a.concat(b);//문자열을 합쳐서 반환//반환값을 받는다
		System.out.println(c);
		System.out.println(a);//원본값을 수정하지 않는다
		//2.contains()포함된 문자열 찾기 반환값에 대입
		String target="여러분 오늘은 목요일이에요 장마 조심하세요";
		boolean result= target.contains("목요일");//찾으면 true 못찾으면 false
		System.out.println(result);
		//3.replace():특정문자를 지정문자로 교체
		String email="ldu0215@naver.com";
		System.out.println(email);//원본은 변경 x 변경후 값은 반환가능
		System.out.println(	email.replace(".com", ".co.kr"));
		//4.substring() :특정문자열을 잘라내는 기능
		String name1="유병승천재";
		String name2=name1.substring(3);//원본값은 수정 불가 (인덱스 번호부터 시작)(시작번호,끝번호)
		System.out.println(name2);
		//5.indexOf():특정문자의 인데스 위치를 알려주는 기능
		String file="java.class.txt";
		System.out.println(file.indexOf("."));
		//text만 출력
		System.out.println(file.substring(file.lastIndexOf(".")+1));
		System.out.println(file.replace(".", ""));
		//6.split():문자열을 배열로 변경해주는 기능
		String str2="유병승,김도환,김도환,이성준,정병호,김주은,김민지,장대은";
		String[] strArr=str2.split(",");
		for(String s:strArr) {
			System.out.println(s);
		}
		//7. join : 배열을 특정문자를 기준으로 합쳐주는것
		String str3=String.join("-", strArr);
		System.out.println(str3);
		
		//StringBuffer이용하기
		//문자열을 보관하는 객체,확보한 저장소를 수정가능
		//수정,삭제,추가가 가능함
		StringBuffer sbf=new StringBuffer("김현주");
		//StringBuffer는 객체로서사용하는 것이기때문에
		//변경하거나 삭제....StringBuffer메소드를 이용해서처리
		System.out.println(sbf+":"+sbf.hashCode());
		//값을 추가하기
		sbf.append("모르겠습니다");//문자열 추가 String+=동일
		System.out.println(sbf+":"+sbf.hashCode());
		//문자열 중간에 데이터 삽입
		sbf.insert(3, "잘");//원본값이 수정
		//문자열 삭제하기: delete메소드 이용
		sbf.delete(0, 3);
		System.out.println(sbf);
		sbf.reverse();//거꾸로 출력
		
		//StringBulider는 버퍼와 동일하지만 쓰레드 safe기능이 없다	
		StringBuilder sb=new StringBuilder();
		
		
		//StringTokenizer
		//문자열을 배열(형식)로 변환하여 출력할수 있게 하는 객체
		String test="c#,java,c_c++_oracle,jdbc,html,css,javascript";
		StringTokenizer st=new StringTokenizer(test,",");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		
	}

}
