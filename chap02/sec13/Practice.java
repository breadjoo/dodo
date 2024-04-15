package chap02.sec13;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
			System.out.print("X값을 입력하시오. : ");
		String strX = scanner.nextLine();
			System.out.println("X : " +strX);
			System.out.print("Y값을 입력하시오. : ");
		String strY = scanner.nextLine();
			System.out.println("Y : "+strY);
			System.out.print("Z값을 입력하시오. : ");
		String strZ = scanner.nextLine() ;
			System.out.println("Z : " +strZ);
		
			while(true) { 
				System.out.print("베스킨 라빈스 31 : ");
			String data = scanner.nextInt();
				if(data.equals(31)) {
					break;
			}
			if (data >= 31)System.out.print("A : "+ data);
			System.out.println();
			System.out.print("B : "+ data);
			System.out.println();

			}
			System.out.println("게임 끝");
	}

}
