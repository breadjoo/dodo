package June.S0606.exam01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			for (int a = 1;a<=n-i;a++) {
				System.out.print(" ");
			}
			for (int b = 1;b<=2*i-1; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=n-1; i>=1; i--) {
			for (int a=1; a<=n-i; a++) {
				System.out.print(" ");
			}
			for (int b=1; b<=2*i-1; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
