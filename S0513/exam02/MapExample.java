package S0513.exam02;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MapExample {

	public static void main(String[] args) {
		
		int [] intArray = {1,2,3,4,5};
		
		IntStream intStream = Arrays.stream(intArray);
		intStream
			.asDoubleStream()
			.forEach(s ->System.out.println(s));
		
		intStream = Arrays.stream(intArray);
		intStream
			.boxed()
			.forEach(s->System.out.println(s));
		
	}

}
