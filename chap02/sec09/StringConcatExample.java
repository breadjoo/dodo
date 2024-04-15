package chap02.sec09;

public class StringConcatExample {

	public static void main(String[] args) {
		//숫자 연산 
		int result1 = 10 + 3 + 1 ;
			System.out.println("result1 : " + result1);
		//결합 연산
		String result2 = 10+ 3 + "1";
			System.out.println("result2 : " + result2);
		String result3 = 10 + "3" + 11;
			System.out.println("result3 : " + result3);
		String result4 = "10" + (3+1);
			System.out.println("result4 : " + result4);
	}

}
