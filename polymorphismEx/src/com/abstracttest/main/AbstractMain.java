package com.abstracttest.main;

import com.abstracttest.model.vo.AbstractChild;
import com.abstracttest.model.vo.AbstractTest;

public class AbstractMain {

	public static void main(String[] args) {
		
		//AbstractTest test = new AbstractTest();
		
		AbstractChild child=new AbstractChild("�ڽĿ��� ����","���߳�");
		System.out.println(child.getChild());
		System.out.println(child.getTitle());
		 //�߻�Ŭ������ Ÿ������ Ȱ���� ����
		//�߻�Ŭ������ ������ ��ӹ��� ��ü�� ������
		//�߻�Ŭ������ ������ � ��ü�� �θ� ��
		AbstractTest ab=new AbstractChild();
		//ab.getChild()//�ڽİ�ü�� ������ �Ұ���
		ab.getTitle();
		//�߻�޼ҵ尡 �ִ� Ŭ������ �ݵ��
		
	}

}
