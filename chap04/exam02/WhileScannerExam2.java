package chap04.exam02;

import java.util.Scanner;

public class WhileScannerExam2 {

	public static void main(String[] args) {
				
				Scanner scanner = new Scanner(System.in);
				
				boolean run = true;
				int i = 0;
				int cash = 0;
				
				while(run) {
					System.out.println("------------------------------");
					System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
					System.out.println("------------------------------");
					System.out.print("선택> ");
				String aaa = scanner.nextLine();
				
				if (aaa.equals("1")) {
					cash += scanner.nextInt();
					System.out.println("예금액>"+cash);
					
				}else if(aaa.equals("2")) {
					cash -= scanner.nextInt();
					System.out.println("출금액>"+cash);
					
				}else if(aaa.equals("3")) {
					
					System.out.println("잔고>"+cash);
						
						
				}else if (aaa.equals("4")) {
					run=false;			
					System.out.println("프로그램 종료");

					
			}			


		}


	}

}
