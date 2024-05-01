package S0501.exam01;

public class SumExample {
	public static void main (String []args) {
	
	Sum sum = new Sum();
	
	int result1 = sum.sum(1,2,3,4,5);
	int result2 = sum.sum(22,33,22,11);
	
	System.out.println("1~5까지의 합 : " + result1);
	System.out.println("1122332211합 : " + result2);
	}
}
