package com.kh.comtroller;

import com.kh.moeol.vo.Driver;
import com.kh.moeol.vo.Employee;
import com.kh.moeol.vo.Person;
import com.kh.moeol.vo.Student;

public class PsersonController {
	public static void main(String[] args) {
		Person[] persons=new Person[10];
		persons[0]=new Student("유병승",19,'남',3,1,1);
		persons[1]=new Employee("김도환",29,'남',"rclass","학생",10);
		persons[2]=new Driver("강승윤",27,'남',11,true);
		persons[3]=new Student("김현주",26,'여',3,1,1);
		persons[4]=new Employee("정병호",30,'남',"rclass","학생",10);
		persons[5]=new Driver("김주은",28,'남',20,true);
		persons[6]=new Student("김민지",20,'여',1,1,1);
		persons[7]=new Employee("장대은",29,'남',"rclass","학생",10);
		persons[8]=new Driver("이성준",27,'남',11,true);
		persons[9]=new Student("한승연",22,'여',2,3,1);
		
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
		System.out.println("등록된 사람 수 : "+(studentCount+employeeCount+dirverCount));
		System.out.println("학생 : "+studentCount);
		System.out.println("사원 : "+employeeCount);
		System.out.println("기사 : "+dirverCount);
		//직업별로 출력
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
		System.out.println("======학생=======");
		System.out.println(studentMember);
		System.out.println("======사원=======");
		System.out.println(employeeMember);
		System.out.println("=======기사=======");
		System.out.println(dirverMember);
	}
	

}
