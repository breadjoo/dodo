package chap04.sec06;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
				System.out.println("메시지를 입력하세요.");
				System.out.println("프로그램을 종료하려면 Q를 입력하세요.");
			
			Scanner scanner = new Scanner(System.in);
			String inputString;
			do {
				System.out.print(">>>");
			inputString = scanner.nextLine();
				System.out.println(inputString);
			
				
			} while( ! inputString.equals("Q"));
			
				System.out.println("do~while 다음문장 실행 중");
			
	}

}
