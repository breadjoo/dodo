package June.S0610.exam01;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
				
		for(int i=0;i<T;i++) {
			int R = sc.nextInt();
			String S = sc.next();
			
			StringBuilder fuck = new StringBuilder();
			for(int a=0;a<S.length();a++) {
				char c = S.charAt(a);
				for(int b=0;b<R;b++) {
					fuck.append(c);
				}
				
				
			}
			System.out.println(fuck.toString());
		}
		
		sc.close();


	}

}
