package S0428.exam01;

import java.util.Arrays;

public class ArrayTest {
	public static void main (String [] args) {
		int [] array = {1,2,3,4,5};
		
		
		for (int i=0;i<array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println(Arrays.toString(array));
		int [] array2 = new int[4];
		array2 [0] = 1;
		array2 [1] = 2;
		array2 [2] = 3;
		array2 [3] = 4;
		array2 [4] = 5;
		
	//	System.out.println(Arrays.toString(array));
		for (int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		
		
		
		String [] name = {"A","B","C"} ;
		String [] name2 = new String[3];
		name2 [0] = "A";
		name2 [1] = "B";
		name2 [2] = "C";
		name2 [3] = "D";
		
		
	}

}
