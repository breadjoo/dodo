package chap17.sec07.exam02;

import java.util.ArrayList;
import java.util.List;

public class SotringExample {

	public static void main(String[] args) {

		List<Student> list = new ArrayList<>();
		
		list.add(new Student("홍길동",70));
		list.add(new Student("김길동",60));
		list.add(new Student("강길동",80));
		list.add(new Student("정길동",90));
		list.add(new Student("이길동",55));
		
		list.stream()
			.sorted((s1,s2)->Integer.compare(s1.getScore(), s2.getScore()))
			.forEach(s->System.out.println(s.getName()+":"+s.getScore()));
		
		System.out.println("-----------------");
		list.stream()
			.sorted((s1,s2)->Integer.compare(s2.getScore(), s1.getScore()))
			.forEach(s->System.out.println(s.getName()+":"+s.getScore()));
		
		// Student 클래스가 Comparable을 구현하고 있지 않기 때문에 비교자를 람다식으로 제공함

	}

}
