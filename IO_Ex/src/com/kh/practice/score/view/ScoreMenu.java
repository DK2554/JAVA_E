package com.kh.practice.score.view;

import java.io.DataInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.sound.midi.Synthesizer;

import com.kh.practice.score.controller.ScoreController;

public class ScoreMenu {
	Scanner sc=new Scanner(System.in);
	ScoreController scr=new ScoreController();
	
	public void mainMenu() {
		while(true) {
			System.out.println("1. ���� ���� ");
			System.out.println("2. ���� ���");
			System.out.println("9. ������ ");
			System.out.print("�Է� : ");
			int num=sc.nextInt();
			switch(num) {
			case 1: saveScore();break;
			case 2: readScore();break;
			case 9:return;
			default :
				System.out.println("�߸��Է��ϼ̽��ϴ� �ٽ��Է����ּ���");
			}
		}
		
		
	}
	public void saveScore() {
		int num=0;
		while(true) {
			sc.nextLine();
			System.out.println((num+1)+"�� ° �л� ���� ���");
			System.out.print("�̸� : ");
			String name=sc.nextLine();
			System.out.print("���� ���� : ");
			int kor=sc.nextInt();
			System.out.print("���� ���� : ");
			int eng=sc.nextInt();
			System.out.print("���� ���� : ");
			int math=sc.nextInt();
			int sum=kor+eng+math;
			double avg=sum/3;
			scr.saveScore(name, kor, eng, math, sum, avg);
			System.out.println("�׸� �Է��Ͻ÷��� N�Ǵ� n �Է�"
					+ "����Ͻ÷��� �ƹ�Ű�� �����ּ���");
			char sp=sc.next().charAt(0);

			
			if(sp=='N'||sp=='n') {
				break;
			}else {
				num++;
				continue;
			}
			
		}
		
		
		
	}
	public void readScore() {
		int count =0;
		int sumAll=0;
		double avgAll=0.0;
		try {
			DataInputStream tt=scr.readScored();
			//for()
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		
	}
}
