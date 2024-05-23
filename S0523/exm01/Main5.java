package S0523.exm01;

import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int h = scanner.nextInt();
		int m = scanner.nextInt();
		
		if((0<=h && h<=23)&&(0<=m && m<=59)) {
			if(m>=45) {
				
				System.out.println(h+" "+(m-45));
			} else {
				if(h==0) {
					System.out.println((h+23)+" "+(m+15));
				} else {
				System.out.println((h-1) +" "+ (m+15));
			}
		
		}
		

	}
	}
}
