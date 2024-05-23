package S0523.exm01;

import java.util.Scanner;

public class Main6 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		boolean run = true;
		int cbal = c/60;
		
		if((a<=23)&&(b<=59)) {
			
			switch(cbal) {
			case 1 : if(a<23) {
				System.out.println((a+1)+(b+(c-60)));
			} else {
				System.out.println("0" + c);
			}
				
			}
		}
		
		
	}

}
