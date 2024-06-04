package June.S0604.exam01;

import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String ab = sc.next();
		
		StringBuilder sb = new StringBuilder(ab);
		
		String ba = sb.reverse().toString();
		
		if(ab.equals(ba)) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
		
		
		

	}

}                                                       
