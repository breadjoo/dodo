package S0524.exam01;

import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		long result = 0;
		for(int i= 0; i<=n; i++) {
			result += i;
		}
		System.out.println(result);

	}

}
