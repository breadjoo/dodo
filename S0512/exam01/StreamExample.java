package S0512.exam01;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		set.add("안경통");
		set.add("스타벅스");
		set.add("캡스");
		set.add("약국");
		set.add("기타등등");
		
		Stream<String> stream = set.stream();
		stream.forEach(s -> System.out.println(s));
		
	}
}
