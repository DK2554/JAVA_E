package com.kh.practice.score.model.dao;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ScoreDAO {
	public void saveScore(String name, int kor, int eng, int math, int sum, double avg) {
		try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("Sscore.txt"))) {
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
		DataInputStream dis = null;
		try {
			dis = new DataInputStream(new FileInputStream("Sscore.txt"));
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

		return dis;
	}

}
