package S0525.exam01;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int max = -1000000;
		int min = 1000000;
		
		for(int i=0;i<n;i++) {
			int num = sc.nextInt();
			max = Math.max(max, num);
			min = Math.min(min, num);
		}
		
		System.out.println(min + " " + max);
		

		

	}

}
