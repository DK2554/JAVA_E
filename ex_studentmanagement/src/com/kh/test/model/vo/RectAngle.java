package com.kh.test.model.vo;

public class RectAngle {
	private int width;
	private int height;

	public RectAngle() {

	}

	public RectAngle(int width, int height) {
		this.height = height;
		this.width = width;

	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	public void draw() {
		System.out.println("���ΰ� "+width+"Cm �̰� ���ΰ�"+height+"Cm�� �� ���");
	}
}
