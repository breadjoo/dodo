package chap17.sec03;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPipeLineExample {

	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
				new Student("홍길동",10),
				new Student("신용권",20),
				new Student("유미선",30)
				
				);
				
				Stream<Student> studentStream = list.stream();
				
				IntStream scoreStream = studentStream.mapToInt(student -> student.getScore());
				//mapToInt()메소드 : 객체를 int값으로 매핑해서 intStream으로 변환
				double avg = scoreStream.average().getAsDouble();
				
				System.out.println("평균 점수 : " + avg);
				
						

	}

}
