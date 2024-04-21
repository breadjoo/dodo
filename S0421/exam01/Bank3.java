package S0421.exam01;

import java.util.Scanner;

public class Bank3 {

	public static void main (String [] args) {
		
		Scanner scanner = new Scanner(System.in) ;
		
		int cash = 0;
		int balance = 0;
		boolean run = true;
		
		while (run) {
			System.out.println("============================");
			System.out.println("1.입금 |2.출금 |3.잔고 | 4.종료 |");
			System.out.println("============================");
			System.out.println("원하는 업무를 입력하세요 (한글로)");
			System.out.print("");
		String action = scanner.nextLine();
		if (action.equals("입금")) {
			System.out.print("입금액을 입력하세요 : ");
			cash = scanner.nextInt();
			balance += cash;
			System.out.println("1.입금액 : "+ cash);
			System.out.println("현재 잔고 : " + balance);
			scanner.nextLine();
			
		}else if(action.equals("출금")) {
			System.out.println("출금액을 입력하세요 : ");
			cash = scanner.nextInt();
			balance -= cash;
			System.out.println("2.출금액 : " + cash);
			System.out.println("현재 잔고 : " + balance);
			scanner.nextLine();
		} else if(action.equals("잔고")) {
			System.out.println("잔액 : "+balance);
		} else if (action.equals("종료")) {
			run = false;
			System.out.println("프로그램 종료");
			
		}
		
		}
		
	}
}
