package silsub.sample;

import java.util.Scanner;

public class Munjae {
	public void test1() {
		Scanner sc = new Scanner(System.in);

		System.out.println("***초기 메뉴***");
		System.out.println("1.입력");
		System.out.println("2.수정");
		System.out.println("3.조회");
		System.out.println("4.삭제");
		System.out.println("7.종료");

		boolean str = false;
		int num = 0;
		while (true)

		{
			System.out.println("메뉴를 입력하시오  : ");
			num = sc.nextInt();
			switch (num) {

			case 1:
				System.out.println("입력메뉴가 선택되었습니다.");
				System.out.println("=======================");
				System.out.println("1.입력");
				System.out.println("2.수정");
				System.out.println("3.조회");
				System.out.println("4.삭제");
				System.out.println("7.종료");

				break;
			case 2:
				System.out.println("수정메뉴가 선택되었습니다.");
				System.out.println("=======================");
				System.out.println("1.입력");
				System.out.println("2.수정");
				System.out.println("3.조회");
				System.out.println("4.삭제");
				System.out.println("7.종료");

				break;
			case 3:
				System.out.println("조회메뉴가 선택되었습니다.");

				System.out.println("=======================");
				System.out.println("1.입력");
				System.out.println("2.수정");
				System.out.println("3.조회");
				System.out.println("4.삭제");
				System.out.println("7.종료");

				break;
			case 4:
				System.out.println("삭제메뉴가 선택되었습니다.");
				System.out.println("=======================");

				System.out.println("1.입력");
				System.out.println("2.수정");
				System.out.println("3.조회");
				System.out.println("4.삭제");
				System.out.println("7.종료");

				break;
			case 7:
				System.out.println("프로그램이 종료됩니다.");

				return;
			default:
				System.out.println("번호가 잘못 입력되었습니다:");
				System.out.println("=======================");
				System.out.println("다시입력하십시오");
				System.out.println("=======================");
				System.out.println("***초기 메뉴***");
				System.out.println("1.입력");
				System.out.println("2.수정");
				System.out.println("3.조회");
				System.out.println("4.삭제");
				System.out.println("7.종료");

			}
		}

	}
	public void inputTest() {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("이름을 입력하시오 : ");
		String name=sc.nextLine();
		System.out.print("나이를 입력하시오 : ");
		int age=sc.nextInt();
		System.out.print("키를 입력하시오 : ");
		double height=sc.nextDouble();
		if((name!=null&&name.length()!=0)&&(age>0&&height>0)) {
			System.out.println("이름 : "+name);
			System.out.println("나이 : "+age);
			System.out.println("키 : "+height);
			System.out.printf("확인 : %s의 나이는 %d이고 키는 %.1fcm이다",name,age,height);
			
		}else {
			return;
		}
	}
	public void test6() {
		Scanner sc=new Scanner(System.in);
		System.out.print("첫번째 정수 : ");
		int nu1=sc.nextInt();
		System.out.print("두번째 정수 : ");
		int nu2=sc.nextInt();
		if(nu1>0&&nu2>0) {
			System.out.printf("%d + %d =%d\n",nu1,nu2,nu1+nu2);
			System.out.printf("%d - %d =%d\n",nu1,nu2,nu1-nu2);
			System.out.printf("%d * %d =%d\n",nu1,nu2,nu1*nu2);
			System.out.printf("%d / %d =%d\n",nu1,nu2,nu1/nu2);
			System.out.printf("%d %% %d =%d\n",nu1,nu2,nu1%nu2);
	
		}
	}
	
}
