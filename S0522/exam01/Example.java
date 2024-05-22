package S0522.exam01;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		
			int no1 = scanner.nextInt();
		
			int no2 = scanner.nextInt();
			
			int no2_first = no2%10;
			int no2_second = (no2 / 10) % 10;
			int no2_third = no2/ 100;
			
			int no3 = no2_first * no1;
			int no4 = no2_second * no1*10;
			int no5 = no2_third * no1*100;
			
			int no6 = no3+no4+no5;
			
			System.out.println(no3);
			System.out.println(no4/10);
			System.out.println(no5/100);
			System.out.println(no6);
			
			
		

	}

}
