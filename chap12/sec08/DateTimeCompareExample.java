package chap12.sec08;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTimeCompareExample {

	public static void main(String[] args) {
		// 
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd a HH:ss:mm");
		
		LocalDateTime startDateTime = LocalDateTime.of(2021, 12,1,12,22,33);
		System.out.println("시작일: " +startDateTime.format(dtf));
		
		LocalDateTime endDateTime = LocalDateTime.of(2021, 12,31,0,0,0);
		System.out.println("종료일: " +endDateTime.format(dtf));
		
		if(startDateTime.isBefore(endDateTime)) { // 이전 날짜인지?
			System.out.println("진행 중");
		} else if(startDateTime.isEqual(endDateTime)) {
			System.out.println("종료합니다.");
		} else if(startDateTime.isAfter(endDateTime)) {
			System.out.println("이미 종료됐습니다.");
		}
		
		long remainYear = startDateTime.until(endDateTime, ChronoUnit.YEARS);
		long remainMonth = startDateTime.until(endDateTime, ChronoUnit.MONTHS);
		long remainDay = startDateTime.until(endDateTime, ChronoUnit.DAYS);
		long remainHour = startDateTime.until(endDateTime, ChronoUnit.HOURS);
		long remainMinute = startDateTime.until(endDateTime, ChronoUnit.MINUTES);
		long remainSecond = startDateTime.until(endDateTime, ChronoUnit.SECONDS);
		
		System.out.println("남은 년수 : " + remainYear);
		System.out.println("남은 달수 : " + remainMonth);
		System.out.println("남은 일수 : " + remainDay);
		System.out.println("남은 시간 : " + remainHour);
		System.out.println("남은 분 : " + remainMinute);
		System.out.println("남은 초 : " + remainSecond);
			
				

	}

}
