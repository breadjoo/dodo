package cahp05.sec05;

public class ArrayCreateByValueListExample3 {

	public static void main(String[] args) {
		int [] scores;
		scores = new int[] {83,90,87};
		int sum1 = 0;
		for(int i=0;i<3;i++) {
			sum1 += scores[i];
		}
			System.out.println("총합 : " + sum1);

		//배열을 매개값으로 주고, printItem() 메소드 호출
		printItem(new int[] {83,90,87});
		System.out.println();
		printItem(new int[] {77, 24, 90});
		
		
	}//printItem() 메소드 선언 
	public static void printItem(int[] scores) {
		for(int i=0;i<3;i++) {
			System.out.println("scores["+i+"] : "+scores[i]);
		}
	}

}
