package com.abstracttest.model.vo;

public abstract class AbstractMethod {
	//�߻�޼ҵ�
	//�߻�޼ҵ�� 	1.�޼ҵ� ����ο� abstract���� �ִ� �޼ҵ�
	//			2.�޼ҵ��� �����ΰ� ���� �޼ҵ�
	
	public void generalMethodTest() {
		
	}
	//�߻�޼ҵ�� 
	public	abstract void abstractMethodTest();
	
	//�߻�޼ҵ尡 �ִ� Ŭ������ ��ӹ޵� �Ǵ� �ڽ�Ŭ����(���� Ŭ����)��
	//�߻�޼ҵ带 �ݵ�� �������̵��Ͽ� ������ �ؾ���
	public abstract String combineStr(String a,String b);

}
