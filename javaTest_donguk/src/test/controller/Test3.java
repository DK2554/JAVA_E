package test.controller;

public class Test3 {

	public static void main(String[] args) {
		int i=0;
		int sum=0;
		
		while(i<=100){
			sum+=i;
			i++;
		}
		double  hvg=(double)sum/100;
		System.out.println("�հ� : "+sum);
		System.out.println("��� : "+hvg);

	}

}
