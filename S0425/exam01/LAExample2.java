package S0425.exam01;

import java.util.Calendar;
import java.util.TimeZone;

public class LAExample2 {

	public static void main (String [] args) {
		
		String region = "America/LosAngeles";
		TimeZone timeZone = TimeZone.getTimeZone(region);
		Calendar now = Calendar.getInstance(timeZone);
		
		int amPm = now.get(Calendar.AM_PM);
		String strAmPm = null;
		
		if(amPm == Calendar.AM) {
			strAmPm = "AM";
		}else {
			strAmPm = "PM" ;
		}
		
		int hour = now.get(Calendar.HOUR);
		int min = now.get(Calendar.MINUTE);
		
		
		System.out.print(region+ "의 현재 시각: ");
		System.out.print(strAmPm+" ");
		System.out.print(hour+ "시 ");
		System.out.print(min+ "분 ");
		
	}
	
	
	
}
