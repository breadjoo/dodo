package chap17.sec12.exam01;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectExample {
	public static void main (String [] args) {
		List<Student> totalList = new ArrayList<>();
		
		totalList.add(new Student("홍길동","남자",92));
		totalList.add(new Student("김수영","여자",87));
		totalList.add(new Student("감자바","남자",95));
		totalList.add(new Student("오해영","여자",93));
		
		System.out.println("---남자 리스트---");
		List<Student> maleList = totalList.stream()
			.filter(s->s.getSex().equals("남자"))
			.toList();
		
		maleList.stream()
			.forEach(s->System.out.println(s.getName()+":"+s.getScore()));
	
		System.out.println("---여자 리스트---");
		List<Student> femaleList = totalList.stream()
				.filter(s->s.getSex().equals("여자"))
				.toList();
		
		femaleList.stream()
			.forEach(s->System.out.println(s.getName()+":"+s.getScore()));
		
		System.out.println("--------------");
		
	
		
		//학생 이름을 키, 학생 점수를 값으로 갖는 Map 생성
		Map<String, Integer> map = totalList.stream()
				.collect(
					Collectors.toMap(
							s-> s.getName(),
							s-> s.getScore() 
							)
						);
			System.out.println(map);	
				
	}
}
