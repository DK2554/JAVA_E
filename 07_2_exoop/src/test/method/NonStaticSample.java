package test.method;

import java.util.Arrays;

public class NonStaticSample {
	public NonStaticSample() {
	}

	public void printLottoNumbers() {
		int[] num = new int[6];
		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 45) + 1;
			for (int j = 0; j < i; j++) {
				if (num[i] == num[j]) {
					num[i]--;
				}
			}
		}
		Arrays.sort(num);
		System.out.println("============�ζǹ�ȣ ���=============");
		for (int i = 0; i < num.length; i++) {

			System.out.print(num[i] + ".");
		}
	}

	public void outputChar(char ch, int num) {
		System.out.println();
		for (int i = 0; i < num; i++) {
			System.out.print(ch);
		}

	}

	public char alphabette() {
		int ran = (int) (Math.random() * 57) + 65; 
		if (ran >= 65 && ran <= 90 || ran >= 97 && ran < 123) {
			char ch2=(char)ran;
			return ch2;
		}
		else {
			System.out.println("�����ڰ� �ƴϸ� 0���");
			return 0;
		}
		
			
		

	}

	public String mySubstring(String str, int fir, int fin) {
		if (str.equals(null)) {
			return null;
		} else {
			String str2 = str.substring(fir, fin);
			return str2;
		}

	}

}
