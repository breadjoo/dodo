package chap17.sec04.exam02;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		//문자열 배열과 정수 배열로 부터 스트림을 얻음
		String[] strArray = {"홍길동","강길동","이길동"};
		Stream<String> strStream = Arrays.stream(strArray);
		strStream.forEach(name ->System.out.print(name + ","));
		System.out.println();
		
		int[] intArray = {1,2,3,4,5};
		IntStream intStream = Arrays.stream(intArray);
		intStream.forEach(num -> System.out.print(num + ","));

	}

}
