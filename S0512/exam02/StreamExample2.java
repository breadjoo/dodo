package S0512.exam02;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample2 {

	public static void main(String[] args) {

		String[] strArr = {"쵸비","페이커","캡스","비디디"};
		Stream<String> strStream = Arrays.stream(strArr);
		strStream.forEach(s->System.out.print(s+" "));
		System.out.println();
		
		int[] intArr = {1,2,3,4,5,6,7,8};
		IntStream intStream = Arrays.stream(intArr);
		intStream.forEach(s->System.out.print(s +" " ));
		
			
	}

}
