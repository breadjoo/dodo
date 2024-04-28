package S0428.exam01;

import java.util.Arrays;
import java.util.Collections;

public class ArraysSortExample2 {

	public static void main (String [] args) {
		int [] arr = {5,2,3,4,5};
		
		Arrays.sort(arr,Collections.reverseOrder());
		
		//int는 Comparable을 구현하지 않아서 역배열을 할수가 없다는데요 ㅠㅠ
		
		
	}
}
