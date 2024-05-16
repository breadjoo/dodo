package chap17.sec00.exam05;

import java.util.Arrays;
import java.util.List;

public class Example {

	public static void main(String[] args) {

		List<String> list = Arrays.asList(
				"This is a Java book",
				"Lambda Expressions",
				"Java8 supports lambda experssions"
				);
		list.stream()
			.filter(s->s.contains("Java"))
			.forEach(n->System.out.println(n));
	}

}
