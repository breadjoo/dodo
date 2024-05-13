package S0513.exam01;

import java.util.ArrayList;
import java.util.List;

public class FilteringExample {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		
		list.add("홍길동");
		list.add("감자바");
		list.add("신용권");
		list.add("신민철");
		list.add("신용권");
		list.add("감자바");
		list.add("바밤바");
		list.add("누가바");
		
		list.stream()
			.distinct()
			.forEach(s->System.out.println(s));
		System.out.println("~~~~절취선~~~~");
		
		list.stream()
			.distinct()
			.filter(s->s.startsWith("신"))
			.forEach(s->System.out.println(s));
	}

}
