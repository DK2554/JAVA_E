package com.collection.controller;

import java.util.Comparator;

public class OrderLogic implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		//��ȯ���� 0,1,-1�� �����ϸ� ��.
		//��������
		//0 : �ΰ��� ����
		//1 : o1�� o2���� ũ��
		//-1:o1��o2���� ������
		//��������
		//0 : �ΰ��� ����
		//1 : o1�� o2���� ������
		//-1:o1��o2���� ũ��
		//�������� ����
		if(o1>o2) return -1;//�ٲ�����
		else if(o1<o2)return 1;//�ٲ�
		else return 0 ;//�ٲ�����
			
	}	
	
}
