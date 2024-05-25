package S0525.exam01;

import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		int [] arr= new int [9];
		int max = Integer.MIN_VALUE;
		int maxIndex = -1;
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
			if(arr[i] > max) {
				max = arr[i];
				maxIndex = i;
			}
		}
		System.out.println(max);
		System.out.println(maxIndex+1);

	}

}
