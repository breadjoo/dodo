package June.S0610.exam01;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		int [] array = new int [26];
		
		for(int i=0;i<array.length;i++) {
			array[i] = -1;
		}
		
		for(int i=0;i<S.length();i++) {
			char c = S.charAt(i);
			if(array[c-'a'] == -1) {
				array[c-'a'] = i;
		}
		}
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}

	}

}