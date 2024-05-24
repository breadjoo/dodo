package S0524.exam01;

import java.util.Scanner;

public class Main6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if((n%4==0)&&(n<=1000)) {
		for(int i=0;i<n;i++) {
			System.out.print("long ");
		}System.out.print("int");
		}
		
	}

}
