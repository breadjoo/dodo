package chap17.sec08;

import java.util.Arrays;

public class LoopingExample {

	public static void main(String[] args) {
		int[] intArr = {1,2,3,4,5};
		
		Arrays.stream(intArr)
			.filter(a-> a%2 == 0)
			.peek(n-> System.out.println(n)); // peek:중간처리 메소드이고, 최종처리가 없으므로 동작하지 않음
		
		int total = Arrays.stream(intArr)
				.filter(a->a%2==0)
				.peek(n->System.out.println(n))
				.sum();
		System.out.println("총합 : " +total+"\n");
		
		Arrays.stream(intArr)
			.filter(a->a%2==0)
			.forEach(s->System.out.println(s));

	}

}
