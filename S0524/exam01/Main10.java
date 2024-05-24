package S0524.exam01;

import java.util.Scanner;

public class Main10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
	
		for (int i = 1; i <= n; i++) {
            // 공백 출력
            for (int a = 0; a < n - i; a++) {
                System.out.print(" ");
            }
            // 별 출력
            for (int b = 0; b < i; b++) {
                System.out.print("*");
            }
            // 줄바꿈
            System.out.println();
        }
    }
}