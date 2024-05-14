package chap17.sec10;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalExample {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		
		OptionalDouble optional = list.stream()
				.mapToInt(Integer :: intValue)
				.average();
		if(optional.isPresent()) {
			System.out.println("방법1_평균 : " + optional.getAsDouble());
		} else {
			System.out.println("방법1_평균 : 0.0");
		}
		
		double avg = list.stream()
					.mapToInt(Integer :: intValue)
					.average()
					.orElse(0.0);
		System.out.println("방법2_평균 : " +avg);
		
		list.stream()
			.mapToInt(Integer :: intValue)
			.average()
			.ifPresent( s -> System.out.println("방법3_평균 : " + s ));
	}
	/* 최종 처리에서 average 사용 시 요소가 없는 경우를 대비하는 방법
	 * 1) isPresent() 메소드가 true를 리턴할 때만 집계값을 얻는다.
	 * 2) orElse() 메소드로 집계값이 없을 경우를 대비해서 디폴트 값을 정해놓는다.
	 * 3) ifPresent() 메소드로 집계값이 있을 경우에만 동작하는 람다식을 제공한다.
	 * 
	 */

}
