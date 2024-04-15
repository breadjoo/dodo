package chap04.exam02;

public class For3 {

	public static void main(String[] args) {
		int x;
		int sum = 0;
		
		for(x=1; x<=100; x++) {
			if (x%3 == 0) {
			sum += x;
			
			}
		}
		System.out.println("1~100까지 3의 배수의 총합 : "+ sum );
		
	}

}
