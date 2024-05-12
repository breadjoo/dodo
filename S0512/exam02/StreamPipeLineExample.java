package S0512.exam02;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPipeLineExample {

	public static void main(String[] args) {

		List<Student> list = Arrays.asList(
				new Student("빵빵이",67),
				new Student("옥지",44),
				new Student("끼꼬",99)
				);
		
		Stream<Student> studentStream = list.stream();
		
		IntStream scoreStream = studentStream.mapToInt(stu -> stu.getScore());
		double avg = scoreStream.average().getAsDouble();
		
		System.out.println("평균 : " + avg);
				
	}

}
