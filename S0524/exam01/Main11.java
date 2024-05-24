package S0524.exam01;

import java.util.Scanner;

public class Main11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if((a>0)&&(b<10)) {
				System.out.println(a+b);
			}else {			
				break;
		}
		}
	}

}
