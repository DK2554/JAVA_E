package com.ploy.main;

import com.ploy.model.vo.Animal;
import com.ploy.model.vo.Car;
import com.ploy.model.vo.Dog;
import com.ploy.model.vo.Fish;

public class AnimalMain {
	public static void main(String[] args) {
		Dog d=new Dog();
		Fish f=new Fish();
		Animal a =new Animal();
		a=f;
		//다형은 부모객체의 변수가 자식객체를 받을 수 있는것(보관할수 있는것)
		a=new Dog();//조건-> 상속관계에 잇는 객체들이!!1
		//Animal Dog,Fish 자식객체로 갖고 잇음
		a=new Fish();
		//a=new Car();//상속이 아니기 때문에 오류남
		//강제 형변환을 통해 이용이 가능함
		((Fish)a).getColor();
		a=new Animal();
		//((Fish)a).getColor();//컴파일시에는 에러가 발생하지 않지만 런타임중에는 classcastingExecption오류 발생
		
		//object는 모든 객체의 부모 
		//object 자료형에 대입될 수 있다->다형성의 규칙때문에
		Object obj=new String();
		obj=new Car();
		
		
		//부모객체는 다양한 자식들을 보관할 수 있다 편리하게 사용할 수 있다.
		Car[] cars=new Car[5];
		cars[0]=new Car("쏘나타",2020,2000,"현다이");
		cars[1]=new Car("티코",1990,500,"다우");
		cars[2]=new Car("볼보",2020,3000,"볼보이");
		Dog[] dog=new Dog[3];
		dog[0]=new Dog("시고르브자브조","개과",15,60,15,"멍멍");
		dog[1]=new Dog("샤페이","개과",15,30,20,"왕왕");
		dog[2]=new Dog("웰시코기","개과",12,30,20,"컹컹");
		Fish[] fish=new Fish[2];
		fish[0]=new Fish("금붕어","어류",10,5,1,"빨강");
		fish[1]=new Fish("구피","어류",10,2,1,"황홀한색");
		Animal[] am=new Animal[5];
		am[0]=new Dog("시고르브자브조","개과",15,60,15,"멍멍");
		am[1]=new Dog("샤페이","개과",15,30,20,"왕왕");
		am[2]=new Dog("웰시코기","개과",12,30,20,"컹컹");
		
		//동적바인딩
		//지식객체가 부모객체의 메소드를 오버라이딩한 경우
		//부모객체변수 에 들어가 있는 실제 객체의 메소드가 실행됨.
		Animal a2=new Animal("동물","포유류",15,20,30);
		System.out.println(a2);
		a2=new Dog("강아지","개과",10,6,3,"멍멍");
		System.out.println(a2);
		a2=new Fish("물고기","어류",3,2,1,"비단색");
		System.out.println(a2);
		
		
	}

}
