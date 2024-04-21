package S0421.exam01;

import java.util.Scanner;

public class Bank {

	public static void main (String []agrs) {
		
		Scanner sc = new Scanner(System.in);
		int balance = 0;
		int cash = 0;

		//int input = sc.nextInt();

		boolean run = true;
		while(run) {
			System.out.println("===========================");
			System.out.println("1.입금 |2.출금 |3.잔금 |4.종료");
			System.out.println("===========================");
			System.out.print("1,2,3,4중에 원하는 작업을 입력하시오 : ");
		String input = sc.nextLine();
		
		if(input.equals("1")) {
			System.out.print("입금하고 싶은 금액을 입력하시오 : ");
			cash = sc.nextInt();
			System.out.println("1.입금 >> "+cash);
			balance += cash;

		} else if (input.equals("2")) {
			System.out.print("출금하고 싶은 금액을 입력하시오 : ");
			cash = sc.nextInt();
			System.out.println("2.출금 >> "+cash);
			balance -= cash;
			
		} else if (input.equals("3")) {
			System.out.println("3.잔금 >> "+balance);
			
		} else if (input.equals("4")){
			run = false;
			System.out.println("프로그램 종료");
		}
		}
		

	}
}
