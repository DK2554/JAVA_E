package com.network.basic;

import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class BasicNetwork {
	
	public static void main(String[] args)throws UnknownHostException{
		//�⺻������ ��Ʈ��ũ ��ſ� �ʿ��� ������
		//������ �� �ִ� ��ü�� �������.
		//inetAddress
		InetAddress localIp=InetAddress.getLocalHost();
		System.out.println(localIp.getHostAddress());//����ǻ�Ϳ� ���� ip�ּ�
		System.out.println(InetAddress.getLocalHost().getHostAddress());
	
		//�� ��ǻ�Ϳ� ���� ip�ּ� ������ �����Ϸ���
		
		//������ ����
		//������ �����ؼ� ����
		//clien����,server����
		//������ �����ϱ� ���ؼ��� ���������� �����ؾ���
		//����ip�� ��Ʈ��ȣ�� �����
		
		Socket socket=null;//new Socket("���� ������","���� ��Ʈ");
	}

}
