package S0522.exam05;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		int no1 = a+b;
		int no2 = a-b;
		int no3 = a*b;
		int no4 = a/b;
		int no5 = a%b;
		System.out.println(no1);
		System.out.println(no2);
		System.out.println(no3);
		System.out.println(no4);
		System.out.println(no5);

	}

}
