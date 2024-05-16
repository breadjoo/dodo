package chap17.sec00.exam06;

import java.util.ArrayList;
import java.util.List;

public class Example {

	public static void main(String[] args) {
		List<Member> list = new ArrayList<>();
		
		list.add(new Member("홍길동",30));
		list.add(new Member("신용권",40));
		list.add(new Member("김자바",26));
		
		double avg = list.stream()
				.mapToInt(Member :: getAge)
				.average()
				.getAsDouble();
		System.out.println("평균나이 : " + avg);
				

	}

}
