package S0513.exam02;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingExample {

	public static void main(String[] args) {

		List<Student> studentList = new ArrayList<>();
		
		studentList.add(new Student("홍길동",33));
		studentList.add(new Student("홍짱동",73));
		studentList.add(new Student("홍왕동",53));
		studentList.add(new Student("홍킹동",83));

		studentList.stream()
			.sorted()
			.forEach(s->System.out.println(s));
		
		studentList.stream()
			.sorted(Comparator.reverseOrder())
			.forEach(s->System.out.println());

	}

}
