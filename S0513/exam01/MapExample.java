package S0513.exam01;

import java.util.ArrayList;
import java.util.List;

public class MapExample {

	public static void main(String[] args) {

		List<Student> list = new ArrayList<>();
		
		list.add(new Student("리신",33));
		list.add(new Student("탈리야",22));
		list.add(new Student("자르반",66));
		list.add(new Student("리븐",99));
		
		list.stream()
			.mapToInt(s->s.getScore())
			.forEach(s->System.out.println(s));

	}

}
