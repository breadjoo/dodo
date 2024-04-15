package cahp05.sec10;

public class AdvancedForExample {

	public static void main(String[] args) {
		int[] scores = {95,71,84,93,87} ; //배열 변수 선언
		int sum = 0;
		int sum1 = 0;
		for(int score : scores) {
			sum += score;
				System.out.println(sum);
		}
		
	}

}
