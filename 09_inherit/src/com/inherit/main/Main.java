package com.inherit.main;

import com.inherit.model.vo.Employee;
import com.inherit.model.vo.Student;
import com.inherit.model.vo.Teacher;
import com.inherit.model.vo.Test;

public class Main {
	public static void main(String[] args) {
		//��ü ��Ӱ��� �˾ƺ���
		//Student ,Employee��ü �⺻����
		Student st=new Student();
		Employee em=new Employee();
		Teacher t=new Teacher();
		System.out.println(st.getName());//�л� �̸�
		System.out.println(em.getName());//��� �̸�
		System.out.println(t.getName());
		
		//��ӹ��� ���� ��ü Ȯ���ϱ�
		//object��ü�� ��ӹ޴� ���� Ȯ���� �� ����
		//new Test().
		//Student s1=new Student("������",3,1,"��⵵ �����","010123","��")
		Student s1=new Student(3,1);
		//�����ڷ� ��簪�� �ʱ�ȭ�ϰ� �ʹ�
		//super.
		s1=new Student("������",3,1,"��⵵","0100000",'��');
		System.out.println(s1.infomation());
		Student s2=new Student("������",3,1,"��⵵","0100000",'��');
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		//����� ���� �޼ҵ� �������̵� �ϱ�
		Student s6=new Student("������",3,1,"��⵵","01010",'��');
		Employee e1 = new Employee("������","��⵵","1010",'��',1000,"�����","����");
		System.out.println(s6.infomation());
		System.out.println(e1.infomation());
		
		//������ ������ ����ϸ� �ּҰ�x=>objectŬ������ toString()����
				
	}

}
