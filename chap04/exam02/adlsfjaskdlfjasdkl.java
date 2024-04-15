package chap04.exam02;

import java.util.Scanner;

public class adlsfjaskdlfjasdkl {

	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
		int i = 0;
		boolean run = true;
		
		while(run) {
			
			System.out.println("=============================");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("=============================");
			
			int aaa = scanner.nextInt();
		
		switch(aaa) {
		case 1 :
			System.out.println("예금액>");
			i += scanner.nextInt();
			break;
		case 2 : 
			System.out.println("출금액>");
			i -= scanner.nextInt();
			break;
		case 3 :
			System.out.println("잔고>"+i);
			break;
		case 4 :
			System.out.println("프로그램을 종료합니다.");
			run = false;
			
			
		}
		}
		

	}

}
