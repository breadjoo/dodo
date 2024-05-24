package S0524.exam01;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int test = sc.nextInt();
		
		
		int i=0;
		//boolean run = true;
		
		//while(run) {
			if (i<test) {
				for(i=0;i<test;i++) {
					int a = sc.nextInt();
					int b = sc.nextInt();
					System.out.println(a+b);
				}
				
			//} else {
			//	run = false;
			//}
		}
	
		

	}

}
