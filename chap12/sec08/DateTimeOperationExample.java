package chap12.sec08;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeOperationExample {

	public static void main(String[] args) {
		// LocalDateTime : 날짜와 시간을 조작하는 클래스
		LocalDateTime now = LocalDateTime.now(); // 현재 컴퓨터의 날짜,시간
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd a HH:mm:ss");
		//날짜와 시간을 주어진 문자열 패턴으로 변환할 때 사용
		System.out.println("현재 시간 : " +now.format(dtf));
		
		LocalDateTime plusYears = now.plusYears(1);
		LocalDateTime minusMonth = now.minusMonths(2);
		LocalDateTime plusDays = now.plusDays(6);
		LocalDateTime plusHours = now.plusHours(3);
		LocalDateTime minusMinute = now.minusMinutes(22);
		
		System.out.println("1년 뒤 :"+plusYears.format(dtf));
		System.out.println("2달 전 :"+minusMonth.format(dtf));
		System.out.println("6일 뒤 :"+plusDays.format(dtf));
		System.out.println("3시간 후 :"+plusHours.format(dtf));
		System.out.println("22분 전 :"+minusMinute.format(dtf));
		
		
		
		
		

	}

}
