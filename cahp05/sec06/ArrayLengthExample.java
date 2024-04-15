package cahp05.sec06;

public class ArrayLengthExample {

	public static void main(String[] args) {
		int [] array = {1,3,7,9,11,13,15,17,19,21};
		int sum = 0;
		for(int i=0;i<array.length;i++) {
			sum += array[i];
			
		}	System.out.println("배열의 총 합 : "+ sum);
		double avg = (double)sum/array.length;
			System.out.println("배열의 평균 : " + avg);
		
		

	}

}
