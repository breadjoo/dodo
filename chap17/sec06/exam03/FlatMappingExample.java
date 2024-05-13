package chap17.sec06.exam03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlatMappingExample {

	public static void main(String[] args) {


		List<String> list1 = new ArrayList<>();
		list1.add("this is java");
		list1.add("hello, world");
		list1.add("i am a best developer");
		list1.stream()
			.flatMap(data -> Arrays.stream(data.split("")))
			//Arrays.stream():주어진 String[] 배열을 Stream<String>으로 만듦
			//flatMap() 메소드 : 하나의 요소를 복수 개의 요소들로 변환한 새로운 스트림을 리턴
			.forEach(s -> System.out.print(s));
		System.out.println();
		
		List<String> list2 = Arrays.asList("10,20,30","40,50");
		list2.stream()
			.flatMapToInt(data -> {
				String[] strArr = data.split(",");
				int[] intArr = new int[strArr.length];
				for (int i =0; i<strArr.length;i++) {
					intArr[i] = Integer.parseInt(strArr[i].trim());
				}
				return Arrays.stream(intArr);
			})
			.forEach(number -> System.out.println(number));
		
	}

}
