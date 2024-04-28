package S0428.exam01;

import java.util.Arrays;

public class ArrayCopyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] array = {1,2,3,4};
		
		int [] array2 = new int [array.length * 2];
		
		array2= Arrays.copyOf(array, array.length);
		System.out.println(Arrays.toString(array2));
		
	}

}
