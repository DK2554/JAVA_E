package com.methodtest;

public class Me {
	//심부름 하는 기능
	
	
	public Me() {
		
	}
	public Product order(String order,int money) {
		//물건사오기:콩나물,두부,감자.....
		return new Product(order,money);
	}
	public void  order(String order)
	{
		switch(order)
		{
		case "방청소":System.out.println("방청소 중 ...");break;
		case "공부" : System.out.println("공부중....");break;
		case "자라" : System.out.println("쿨쿨~");break;
		default : System.out.println("알아서 할게~");break;
		}
	
		
	}

}
