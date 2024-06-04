package June.S0604.exam01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		sc.nextLine();
		
		for (int i=0;i<t;i++) {
			String result = sc.nextLine();
			char first = result.charAt(0);
			char last = result.charAt(result.length()-1);
			System.out.println(first+""+last);
			
			
		}

	}

}
