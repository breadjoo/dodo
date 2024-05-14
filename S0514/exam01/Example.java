package S0514.exam01;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example {

	public static void main(String[] args) {

		List<Student> list = new ArrayList<>();
		
		list.add(new Student("아이폰","남",88));
		list.add(new Student("니베아","여",58));
		list.add(new Student("핸드폰","남",73));
		list.add(new Student("김자바","여",94));
		list.add(new Student("홍길동","남",27));
		list.add(new Student("자바다","여",74));
		list.add(new Student("마우스","남",93));
		
		 Map<String, Double> map = list.stream()
					.collect( 
						Collectors.groupingBy(s->s.getSex(),
						Collectors.averagingDouble(s->s.getScore())
					));
			
			System.out.println(map);
		
		Map<String, List<Student>> map2 = list.stream()
				.collect(
						Collectors.groupingBy(s->s.getSex()));
		
		List<Student> maleList = map2.get("남");
		maleList.stream()
		.forEach(s->System.out.println(s.getName() + ":" + s.getScore()));
		System.out.println("---------------");
		
		List<Student> femaleList = map2.get("여");
		femaleList.stream()
		.forEach(s->System.out.println(s.getName() + ":" +s.getScore()));
		
		
		

	}

}
