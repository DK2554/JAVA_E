package com.oop.model.vo;

//디폴트 접근 제한자 사용->같은 패키지 내에서만 사용 가능
class Person2 {
	public void filedtest() {
		Employee emp=new Employee();
		System.out.println(emp.name);//같은 패키지 안이기때문에 접근이 가능하다;
		//System.out.println(emp.department);//public 이기때문에 어디서나 접근 가능
		//System.out.println(emp.age);//private은 접근이 불가능하다.
	}

}
