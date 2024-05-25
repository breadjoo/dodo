package S0525.exam01;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int X = sc.nextInt();
		
		int [] A = new int [N];
		
		for(int i=0;i<N;i++) {
			A[i] = sc.nextInt();
		}
		
		int print = 0;

		for (int num : A) {
			if(num<X) {
				System.out.println(num);
			}
		}
		
		
		
	}

}
