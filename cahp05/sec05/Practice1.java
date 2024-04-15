package cahp05.sec05;

public class Practice1 {

	public static void main(String[] args) {

		int [] array;
		int sum = 0;
		array = new int [] {111,212,223,454,64,88};
		for (int x=0;x<array.length;x++) {
			sum += array[x];
		}
			System.out.println("배열의 합 : " + sum);
		

	}

}
