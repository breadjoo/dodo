package S0428.exam01;


import java.util.Arrays;
import java.util.Collections;

public class ArraySortTest {

	public static void main(String[] args) {
		int[] arr = {5,22,3,12,4};
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	
		int [] arr2 = {11,2,55,6,77};
		Arrays.sort(arr2, 1, 4);
		System.out.println(Arrays.toString(arr2));

	}

}
