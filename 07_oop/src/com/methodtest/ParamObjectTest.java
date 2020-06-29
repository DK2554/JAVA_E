package com.methodtest;

public class ParamObjectTest {

	//객체를 매개변수로 받고 그 객체를 수정하기
	public void objectUpdate(Product p) {
		p.setProductName("cpu");
		p.setPrice(2000);
	}
	//원시타입 매게변수 받고 수정하기
	public void primitiveUpdate(int su) {
		su=2000;
	}
	//배열 넘기기 
	public void arrayUpdate(int[] num) {
		for(int i=0;i<num.length;i++) {
			num[i]=i*20;
		}
	}
}
