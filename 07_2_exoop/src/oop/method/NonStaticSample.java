package oop.method;

public class NonStaticSample {
	public int[] intArrayAlloction(int num) {
		int[] num2 = new int[num];
		for (int i = 0; i < num2.length; i++) {
			num2[i] = (int) (Math.random() * 100) + 1;

		}
		return num2;

	}

	public void display(int[] num) {
		for (int i = 0; i < num.length; i++) {
			System.out.print(" " + num[i]);
		}

	}

	public void swap(int[] num, int su1, int su2) {
		for (int i = su1; i < su2; i++) {
			num[i] = su1;
			su1 = su2;
			su2 = num[i];

		}
	}

}
