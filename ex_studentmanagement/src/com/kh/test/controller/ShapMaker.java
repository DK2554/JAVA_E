package com.kh.test.controller;

import com.kh.test.model.vo.Circle;
import com.kh.test.model.vo.RectAngle;

public class ShapMaker {
	public static void main(String[] args) {
		// 객체배열을 담을 배열을 생성
		Circle[] cr = new Circle[3];

		cr[0] = new Circle(20);
		cr[1] = new Circle(40);
		cr[2] = new Circle(50);

		for (int i = 0; i < cr.length; i++) {
			cr[i].draw();
		}
		RectAngle[] rg = new RectAngle[2];
		rg[0] = new RectAngle(20, 30);
		rg[1] = new RectAngle(60, 80);
		for (int i = 0; i < rg.length; i++) {
			rg[i].draw();
		}

	}

}
