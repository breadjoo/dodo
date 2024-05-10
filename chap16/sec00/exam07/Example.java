package chap16.sec00.exam07;

public class Example {
	private static int[] scores = {10, 50, 3};
	
	public static int maxOrMin(Operator operator) {
		int result = scores[0];
		for (int score : scores) {
			result = operator.apply(result, score);
		}
		return result;
	}
	
	public static void main (String [] args) {
		int max = maxOrMin((a,b) -> {
			if(a>b) {
				return a;
			} else {
				return b;
			}
		});
		System.out.println("Max : " + max);
		
		int min = maxOrMin((a,b) -> {
			if(a<b) {
				return a;
			} else {
				return b;
			}
		});
		System.out.println("Min : " + min);
		
		int min2 = maxOrMin((a,b) -> (a<b)?a:b);
	}
	

}
