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
		//������ �θ�ü�� ������ �ڽİ�ü�� ���� �� �ִ°�(�����Ҽ� �ִ°�)
		a=new Dog();//����-> ��Ӱ��迡 �մ� ��ü����!!1
		//Animal Dog,Fish �ڽİ�ü�� ���� ����
		a=new Fish();
		//a=new Car();//����� �ƴϱ� ������ ������
		//���� ����ȯ�� ���� �̿��� ������
		((Fish)a).getColor();
		a=new Animal();
		//((Fish)a).getColor();//�����Ͻÿ��� ������ �߻����� ������ ��Ÿ���߿��� classcastingExecption���� �߻�
		
		//object�� ��� ��ü�� �θ� 
		//object �ڷ����� ���Ե� �� �ִ�->�������� ��Ģ������
		Object obj=new String();
		obj=new Car();
		
		
		//�θ�ü�� �پ��� �ڽĵ��� ������ �� �ִ� ���ϰ� ����� �� �ִ�.
		Car[] cars=new Car[5];
		cars[0]=new Car("�Ÿ",2020,2000,"������");
		cars[1]=new Car("Ƽ��",1990,500,"�ٿ�");
		cars[2]=new Car("����",2020,3000,"������");
		Dog[] dog=new Dog[3];
		dog[0]=new Dog("�ð����ں���","����",15,60,15,"�۸�");
		dog[1]=new Dog("������","����",15,30,20,"�տ�");
		dog[2]=new Dog("�����ڱ�","����",12,30,20,"����");
		Fish[] fish=new Fish[2];
		fish[0]=new Fish("�ݺؾ�","���",10,5,1,"����");
		fish[1]=new Fish("����","���",10,2,1,"ȲȦ�ѻ�");
		Animal[] am=new Animal[5];
		am[0]=new Dog("�ð����ں���","����",15,60,15,"�۸�");
		am[1]=new Dog("������","����",15,30,20,"�տ�");
		am[2]=new Dog("�����ڱ�","����",12,30,20,"����");
		
		//�������ε�
		//���İ�ü�� �θ�ü�� �޼ҵ带 �������̵��� ���
		//�θ�ü���� �� �� �ִ� ���� ��ü�� �޼ҵ尡 �����.
		Animal a2=new Animal("����","������",15,20,30);
		System.out.println(a2);
		a2=new Dog("������","����",10,6,3,"�۸�");
		System.out.println(a2);
		a2=new Fish("�����","���",3,2,1,"��ܻ�");
		System.out.println(a2);
		
		
	}

}
