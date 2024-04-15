package chap04.exam02;

import java.util.Scanner;

public class WhileScannerExam1 {

	public static void main(String[] args) {

		
		
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		int i = 0;
		int cash;
		while(run) {
			System.out.println("------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("------------------------------");
			System.out.print("선택> ");
		String aaa = scanner.nextLine();
		
		if (aaa.equals("1")) {
			i += 2000;
			System.out.println("예금액>"+"+2000");
			
		}else if(aaa.equals("2")) {
			i -= 2000;
			System.out.println("출금액>"+"-2000");
			
		}else if(aaa.equals("3")) {
			
			System.out.println("잔고>"+i);
				
				
		}else if (aaa.equals("4")) {
			run=false;			
			System.out.println("프로그램 종료");

			
	}			


}}}
