package S0501.exam01;

import java.util.Arrays;

public class ToStringExample {

	private int num;
	
	ToStringExample (int num) {
		this.num = num * 100;
	}
	
	public String toString() {
		return Integer.toString(num);
	}


	public static void main (String[] args) {
		
		Object [] arr = new Object[4];
		arr[0] = new ToStringExample(1);
		arr[1] = new ToStringExample(2);
		arr[2] = new ToStringExample(3);
		arr[3] = new ToStringExample(4);
		
		System.out.println(Arrays.toString(arr));
	}
	

	

}
