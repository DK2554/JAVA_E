package test.controller;

public class Test2 {
	public static void main(String[] args) {
		for (int i = 2; i <= 5; i++) {
			for (int j = 0; j < 10; j++) {
				if (i % 2 != 0) {
					if (j % 2 != 0) {
						System.out.println(i + "*" + j + "=" + i * j);
					}
				}
			}
		}
	}

}
