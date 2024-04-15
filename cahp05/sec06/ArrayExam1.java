package cahp05.sec06;

public class ArrayExam1 {

	public static void main(String[] args) {
		int [] array = {6,5,3,8,2};
		int sum = 0;
		for(int i=0;i<array.length;i++) {
			sum += array[i];
		
		}
		int max = 0;
		for (int i=0;i<array.length;i++) {
			if(max<array[i]) {
				max = array[i];
			}
		}
		int min = 10;
		for (int i=0;i<array.length;i++) {
			if(min>array[i]) {
				 min = array[i];
			}
		}
		System.out.println("최댓값 : "+max);
		System.out.println("최솟값 : " +min) ;
		System.out.println("총합:"+sum);
		double avg = (double)sum/array.length;
			System.out.println("평균:"+avg);
		
		

	}

}
