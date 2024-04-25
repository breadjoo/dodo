package S0425.exam01;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTimeOperationExample1 {

	public static void main (String [] args) {
		
		//전역 dday 계산기 만들어보쟈
		//현재시간, 시간데이터포맷, 시작일,종료일,3년뒤, before,after,equal 끝나기전인지 아닌지 5년뒤 이런걸로도 해보고
		//남은시간 ChronoUnit.MONTH 써보기
		
		
		LocalDateTime now = LocalDateTime.now();
		LocalDateTime startDateTime = LocalDateTime.of(2014, 4,15,0,0,0);
		LocalDateTime endDateTime = LocalDateTime.of(2016, 1,14,0,0,0);
		
		LocalDateTime plus1Year = startDateTime.plusYears(1);
		LocalDateTime plusMonth = startDateTime.plusMonths(15);
		
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("YYYY.MM.dd // hh:mm:ss");
				
		long remainDay = plusMonth.until(endDateTime, ChronoUnit.MONTHS);
		long remainHour= plus1Year.until(endDateTime, ChronoUnit.HOURS); 
		System.out.println("현재시간 ! : " +now.format(dtf1));
		
		
		
		if (plusMonth.isBefore(endDateTime)) {
			System.out.println("전역까지 현재 "+ remainDay+"개월 남았네요");
		}else if (plusMonth.isEqual(endDateTime)) {
			System.out.println("전역입니다!");
		}else if (plusMonth.isAfter(endDateTime)) {
			System.out.println("민간인입니다.");
		}
		
		
		System.out.println(remainHour);
		
		
	}
}
