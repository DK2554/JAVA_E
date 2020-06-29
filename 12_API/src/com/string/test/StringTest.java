package com.string.test;

import java.util.StringTokenizer;

public class StringTest {

	public static void main(String[] args) {
		//String ��ü�� �Һ��� �����͸� ������
		//���ο� ����Ǿ� �ִ� ������ ��������� �����Ҽ� ����
		String name="������";
		System.out.println(name);
		System.out.println(name.hashCode());
		//���� ����ϴ� �޼ҵ�
		//1.concat():���ڿ��� ��ġ�� �޼ҵ� ��ȯ������ ����
		String a="�赵ȯ";
		String b="����";
		String c=a.concat(b);//���ڿ��� ���ļ� ��ȯ//��ȯ���� �޴´�
		System.out.println(c);
		System.out.println(a);//�������� �������� �ʴ´�
		//2.contains()���Ե� ���ڿ� ã�� ��ȯ���� ����
		String target="������ ������ ������̿��� �帶 �����ϼ���";
		boolean result= target.contains("�����");//ã���� true ��ã���� false
		System.out.println(result);
		//3.replace():Ư�����ڸ� �������ڷ� ��ü
		String email="ldu0215@naver.com";
		System.out.println(email);//������ ���� x ������ ���� ��ȯ����
		System.out.println(	email.replace(".com", ".co.kr"));
		//4.substring() :Ư�����ڿ��� �߶󳻴� ���
		String name1="������õ��";
		String name2=name1.substring(3);//�������� ���� �Ұ� (�ε��� ��ȣ���� ����)(���۹�ȣ,����ȣ)
		System.out.println(name2);
		//5.indexOf():Ư�������� �ε��� ��ġ�� �˷��ִ� ���
		String file="java.class.txt";
		System.out.println(file.indexOf("."));
		//text�� ���
		System.out.println(file.substring(file.lastIndexOf(".")+1));
		System.out.println(file.replace(".", ""));
		//6.split():���ڿ��� �迭�� �������ִ� ���
		String str2="������,�赵ȯ,�赵ȯ,�̼���,����ȣ,������,�����,�����";
		String[] strArr=str2.split(",");
		for(String s:strArr) {
			System.out.println(s);
		}
		//7. join : �迭�� Ư�����ڸ� �������� �����ִ°�
		String str3=String.join("-", strArr);
		System.out.println(str3);
		
		//StringBuffer�̿��ϱ�
		//���ڿ��� �����ϴ� ��ü,Ȯ���� ����Ҹ� ��������
		//����,����,�߰��� ������
		StringBuffer sbf=new StringBuffer("������");
		//StringBuffer�� ��ü�μ�����ϴ� ���̱⶧����
		//�����ϰų� ����....StringBuffer�޼ҵ带 �̿��ؼ�ó��
		System.out.println(sbf+":"+sbf.hashCode());
		//���� �߰��ϱ�
		sbf.append("�𸣰ڽ��ϴ�");//���ڿ� �߰� String+=����
		System.out.println(sbf+":"+sbf.hashCode());
		//���ڿ� �߰��� ������ ����
		sbf.insert(3, "��");//�������� ����
		//���ڿ� �����ϱ�: delete�޼ҵ� �̿�
		sbf.delete(0, 3);
		System.out.println(sbf);
		sbf.reverse();//�Ųٷ� ���
		
		//StringBulider�� ���ۿ� ���������� ������ safe����� ����	
		StringBuilder sb=new StringBuilder();
		
		
		//StringTokenizer
		//���ڿ��� �迭(����)�� ��ȯ�Ͽ� ����Ҽ� �ְ� �ϴ� ��ü
		String test="c#,java,c_c++_oracle,jdbc,html,css,javascript";
		StringTokenizer st=new StringTokenizer(test,",");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		
	}

}
