package S0512.exam01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStreamExample {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		
		list.add("홍길동");
		list.add("신용권");
		list.add("감자바");
		list.add("람다식");
		list.add("박병렬");
		list.add("웰치스");
		list.add("아이폰");


		Stream<String> stream = list.parallelStream();
		stream.forEach(s -> System.out.println(s + Thread.currentThread().getName()));
	}

}
