package chap17.sec06.exam02;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MapExample {

	public static void main(String[] args) {

		int[] intArray = {1,2,3,4,5};
		
		IntStream intStream = Arrays.stream(intArray);
		intStream
			.asDoubleStream() // 정수 스트림을 실수 스트림으로 변환
			.forEach(s -> System.out.println(s));
		
		intStream = Arrays.stream(intArray);
		intStream
			.boxed() // int ==> Integer (Wrapper 객체 요소.박싱)
			.forEach(s -> System.out.println(s));
	}

}
