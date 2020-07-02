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
			System.out.println("1. 성적 저장 ");
			System.out.println("2. 성적 출력");
			System.out.println("9. 끝내기 ");
			System.out.print("입력 : ");
			int num=sc.nextInt();
			switch(num) {
			case 1: saveScore();break;
			case 2: readScore();break;
			case 9:return;
			default :
				System.out.println("잘못입력하셨습니다 다시입력해주세요");
			}
		}
		
		
	}
	public void saveScore() {
		int num=0;
		while(true) {
			sc.nextLine();
			System.out.println((num+1)+"번 째 학생 정보 기록");
			System.out.print("이름 : ");
			String name=sc.nextLine();
			System.out.print("국어 점수 : ");
			int kor=sc.nextInt();
			System.out.print("영어 점수 : ");
			int eng=sc.nextInt();
			System.out.print("수학 점수 : ");
			int math=sc.nextInt();
			int sum=kor+eng+math;
			double avg=sum/3;
			scr.saveScore(name, kor, eng, math, sum, avg);
			System.out.println("그만 입력하시려면 N또는 n 입력"
					+ "계속하시려면 아무키나 눌러주세요");
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
