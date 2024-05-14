package chap17.sec11;

import java.util.Arrays;
import java.util.List;

public class ReductionExample {

	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(
				new Student("홍길동", 92),
				new Student("신용권", 95),
				new Student("감자바", 88)
				);
		
		int sum1 = studentList.stream()
						.mapToInt(Student :: getScore)
						.sum();
		int sum2 = studentList.stream()
						.map(Student :: getScore)
						.reduce(0, (a,b)->a+b);
						//reduce() : 다양한 집계 결과물을 만들 수 있음.
		System.out.println("sum1 : " + sum1);
		System.out.println("sum2 : " + sum2);
		
		double avg = studentList.stream()
						.mapToDouble(Student :: getScore)
						.average()
						.getAsDouble();
		System.out.println(avg);
	}

}
