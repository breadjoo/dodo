package chap02.sec13;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 
		 		System.out.print("x값 입력 : ");
		 String strX = scanner.nextLine(); // Enter 키를 누르면 입력한 모든 문자열
		 		System.out.println("X : " + strX);
		 String asdF = scanner.nextLine();
		 		System.out.print("y값 입력 : ");
		 		System.out.println(asdF);
		 	int x = Integer.parseInt(strX);
		 		System.out.print("Z값 입력 : ");
		 String strZ = scanner.nextLine();
		 	int y = Integer.parseInt(asdF);
		 	int z = Integer.parseInt(strZ);
		 		
		 	int result = x + y + z;
		 		System.out.println("x + y + z : " + result);

		 while(true) { 
			 	System.out.print("입력 문자열 : ");
		 String data = scanner.nextLine();
		 if(data.equals("끝")) {
			 break;
		 }
		 
		 		System.out.print("출력 문자열:" + data);
		 		System.out.println();
		 }
		 		
		 		System.out.println("!!종료!!");
		 

	}

}

