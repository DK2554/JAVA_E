package com.network.basic;

import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class BasicNetwork {
	
	public static void main(String[] args)throws UnknownHostException{
		//기본적으로 네트워크 통신에 필요한 정보를
		//가져올 수 있는 객체를 만들었음.
		//inetAddress
		InetAddress localIp=InetAddress.getLocalHost();
		System.out.println(localIp.getHostAddress());//내컴퓨터에 대한 ip주소
		System.out.println(InetAddress.getLocalHost().getHostAddress());
	
		//내 컴퓨터에 대한 ip주소 서버에 접속하려면
		
		//서버에 접속
		//소켓을 생성해서 연결
		//clien소켓,server소켓
		//서버와 연결하기 위해서는 서버소켓을 생성해야함
		//서버ip와 포트번호를 적어라
		
		Socket socket=null;//new Socket("서버 아이피","서버 포트");
	}

}
