package chap17.sec09;

import java.util.Arrays;

public class MatchingExample {

	public static void main(String[] args) {

		int[] intArr= {2,4,6};
		
		boolean result = Arrays.stream(intArr)
							.allMatch(a-> a%2 ==0);
		
		System.out.println("'allMatch'모두 짝수인가? : " + result);
		
		result = Arrays.stream(intArr)
					.anyMatch(a-> a%3 ==0);
		System.out.println("'anyMatch'하나라도 3의배수가 있는가 ? : " +result );
		
		result = Arrays.stream(intArr)
					.noneMatch(a -> a%2 !=0 );
		System.out.println("'noneMatch'홀수가 없는가? : " + result);
		
		//~~ Match : 요소들이 특정 조건에 만족하는 지 여부를 조사하는 최종 처리 기능

	}

}
