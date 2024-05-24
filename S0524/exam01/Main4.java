package S0524.exam01;

import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		long x = sc.nextLong();
		int n = sc.nextInt();
		int i = 0;
		long result = 0;
		boolean run = true;
		
		while(run) {
			for(i=0;i<n;i++) {
				long a = sc.nextLong();
				int b = sc.nextInt();
				result += (a*b);
			} if (result==x) {
				//System.out.println(result);
				System.out.println("Yes");
				run = false;
			}else {
				System.out.println("No");
				//System.out.println(result);
				run = false;
			}
			

		}


	}

}
