package S0524.exam01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int cash ;
		
		if(a==b&&b==c) {
			cash = 10000+(a*1000);
			System.out.println(cash);
		} else if ((a==b)||(a==c)) {
			cash = 1000+(a*100);
			System.out.println(cash);
		} else if ((b==c)&&(a!=b)) {
			cash = 1000+(b*100);
			System.out.println(cash);
		} else {
			int max = Math.max(a, Math.max(b, c));
			cash = max*100;
			System.out.println(cash);
			/*if((a>b)&&(a>c)) {
				cash = a*100;
				System.out.println(cash);
			}else if ((b>c)&&(b>a)) {
				cash = b*100;
				System.out.println(cash);
			} else {
				cash = c*100;
				System.out.println(cash);
			}*/
			
		}
		


	}

}
