package com.kh.practice.score.controller;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.kh.practice.score.model.dao.ScoreDAO;

public class ScoreController {
	private ScoreDAO sd = new ScoreDAO();

	public void saveScore(String name, int kor, int eng, int math, int sum, double avg) {
		sd.saveScore(name, kor, eng, math, sum, avg);
	}

	public DataInputStream readScored() throws FileNotFoundException {
		return sd.readScored();
	}
}
