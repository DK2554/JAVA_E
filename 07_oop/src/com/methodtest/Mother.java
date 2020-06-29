package com.methodtest;

public class Mother {
	
	//필드에는 객체도 들어갈 수 있다
	private Me son=new Me();
	
	
	public void requestOrder() {
		//me에게 심부름 시키기
		//Me son=new Me();
		Product p=son.order("콩나물", 50000);
		System.out.println(p.getProductName());
		System.out.println(p.getPrice());
		
	}
	public void requestOrder(String order) {
		//Me son=new Me();
		son.order("방청소");
		son.order("공부");
		son.order("자라");
	}
}
