package com.exception.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryCatchTest {

	public static void main(String[] args) {
		// ���� ����� checkExceptionó���ϱ�
		String path = TryCatchTest.class.getResource("./").getPath();
		File f = new File(path + "test.txt");
		FileInputStream fi = null;// handled���߸� ������ try catch�ؾ���
		try {
			fi = new FileInputStream(f);
		} catch (FileNotFoundException e) {
			System.out.println("������ ã�� ���մϴ�");
			e.printStackTrace();
			return;
		} finally {
			// ���帹�� Ȱ��
			try {
				fi.close();
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			System.out.println("������� �����ϴ�?");
			// ���ܰ� �߻��ص� �ݵ�� �����ؾ��ϴ� �����ۼ�
		}
		// try with resource ����
		// try{������ �߻��Ҽ��� �ִ� ����}catch(���� �̸� ����){ó�� ����}finally-���ϰ�ü�� �ݴ� �뵵�� ���
		// try(�ݾƾ��ϴ� ��ü ��������){���� �߻��� ����Ǵ� ����}catch(�����̸� ����){ó����}
		try (FileInputStream fis1=new FileInputStream(path+"text.txt")){
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
