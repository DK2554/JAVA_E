package com.kh.comtroller;

import com.kh.moeol.vo.Driver;
import com.kh.moeol.vo.Employee;
import com.kh.moeol.vo.Person;
import com.kh.moeol.vo.Student;

public class PsersonController {
	public static void main(String[] args) {
		Person[] persons=new Person[10];
		persons[0]=new Student("������",19,'��',3,1,1);
		persons[1]=new Employee("�赵ȯ",29,'��',"rclass","�л�",10);
		persons[2]=new Driver("������",27,'��',11,true);
		persons[3]=new Student("������",26,'��',3,1,1);
		persons[4]=new Employee("����ȣ",30,'��',"rclass","�л�",10);
		persons[5]=new Driver("������",28,'��',20,true);
		persons[6]=new Student("�����",20,'��',1,1,1);
		persons[7]=new Employee("�����",29,'��',"rclass","�л�",10);
		persons[8]=new Driver("�̼���",27,'��',11,true);
		persons[9]=new Student("�ѽ¿�",22,'��',2,3,1);
		
		int studentCount =0;
		int employeeCount=0;
		int dirverCount=0;
		for(Person p: persons) {
			if(p instanceof Student) {
				studentCount++;
			}else if(p instanceof Employee) {
				employeeCount++;
			}else if(p instanceof Driver) {
				dirverCount++;
			}
		}
		System.out.println("��ϵ� ��� �� : "+(studentCount+employeeCount+dirverCount));
		System.out.println("�л� : "+studentCount);
		System.out.println("��� : "+employeeCount);
		System.out.println("��� : "+dirverCount);
		//�������� ���
		String studentMember=" ";
		String employeeMember=" ";
		String dirverMember=" ";
		
		for(Person p:persons) {
			if(p!=null) {
				if(p instanceof Student) {
					studentMember+=p+"\n";
					
				}else if(p instanceof Employee) {
					employeeMember+=p+"\n";
					
				}else if(p instanceof Driver) {
					dirverMember+=p+"\n";
					
				}
			}
			
		}
		System.out.println("======�л�=======");
		System.out.println(studentMember);
		System.out.println("======���=======");
		System.out.println(employeeMember);
		System.out.println("=======���=======");
		System.out.println(dirverMember);
	}
	

}
