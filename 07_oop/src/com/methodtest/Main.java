package com.methodtest;

public class Main {

	public static void main(String[] args) {
		Mother m=new Mother();
		m.requestOrder();
		m.requestOrder("시키기");
		ParamObjectTest po=new ParamObjectTest();
		Product p =new Product("자동차",100);
		System.out.println(p.getProductName()+p.getPrice());
		po.objectUpdate(p);//매개변수내용 수정
		System.out.println(p.getProductName()+p.getPrice());
		//원시타입 수정
		int su=10;
		System.out.println(su);
		po.primitiveUpdate(su);//수정 매개변수값을 수정
		System.out.println(su);
		
		
		
		//배열 매개변수 활용하기
		int[] params= {1,2,3,4,5,6};
		po.arrayUpdate(params);
		for(int v:params) {
			System.out.print(v+" ");
			
		}System.out.println();
	}

}
