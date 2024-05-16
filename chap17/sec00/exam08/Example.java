package chap17.sec00.exam08;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example {

	public static void main(String[] args) {
		List<Member> list = new ArrayList<>();
		list.add(new Member("홍길동","개발자"));
		list.add(new Member("김나리","디자이너"));
		list.add(new Member("신용권","개발자"));
		
		Map<String, List<Member>> groupingMap = list.stream()
				.collect(
					Collectors.groupingBy( 
							s->s.getJob())
						);
		
		
		System.out.println("[개발자]");
		groupingMap.get("개발자").stream()
				.forEach(s->System.out.println(s));
		//List<Member> devloper = groupingMap.get("개발자");
		
		//System.out.println(devloper);
		
		List<Member> designer = groupingMap.get("디자이너");
		System.out.println("[디자이너]");
		System.out.println(designer);
		

	}

}
