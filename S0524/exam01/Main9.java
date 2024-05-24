package S0524.exam01;

import java.util.Scanner;

public class Main9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		for(int i=1;i<t+1;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println("Case #"+i+": "+a+" + "+b +" = "+(a+b));
		}

	}

}
