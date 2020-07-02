package com.kh.practice.score.model.dao;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.kh.practice.score.view.ScoreMenu;
//출력부분에서 여러개 값 출력하는 부분이 아직 안댐

public class ScoreDAO {
	public void saveScore(String name, int kor, int eng, int math, int sum, double avg) {
		try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("Sscore.txt",true))) {		
				dos.writeUTF(name);
				dos.writeInt(kor);
				dos.writeInt(eng);
				dos.writeInt(math);
				dos.writeInt(sum);
				dos.writeDouble(avg);		
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public DataInputStream readScored() throws FileNotFoundException {
		FileInputStream fis = new FileInputStream("Sscore.txt");
		DataInputStream dis = new DataInputStream(fis);
		// DataInputStream dis2 = new DataInputStream(dis);
		try {
			
				String name = dis.readUTF();
				int kor = dis.readInt();
				int eng = dis.readInt();
				int math = dis.readInt();
				int sum = dis.readInt();
				double avg = dis.readDouble();
				System.out.println(name + " " + kor + " " + eng + " " + math + " " + sum + " " + avg);
		} catch (IOException e) {
			e.printStackTrace();

		} finally {
			try {
				dis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		return null;

	}

}
