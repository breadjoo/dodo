package S0522.exam03;

import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		long a = scanner.nextLong();
		long b = scanner.nextLong();
		long c = scanner.nextLong();
		
		System.out.println((a+b)%c);
		System.out.println((a%c)+(b%c)%c);
		System.out.println((a*b)%c);
		System.out.println((a%c)*(b%c)%c);
	}

}
