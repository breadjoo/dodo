package S0425.exam01;

import java.util.Calendar;
import java.util.TimeZone;

public class WorldTimeExample {

	public static void main(String [] args) {
		
		String region  = "turkey";
		TimeZone timeZone = TimeZone.getTimeZone(region);
		Calendar now = Calendar.getInstance(timeZone);
		
		int amPm = Calendar.AM_PM;
		String strAmPm = null;
		if(amPm==Calendar.AM) {
			strAmPm = "오전";
		} else {
			strAmPm = "오후";
		}
		
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		
		System.out.print(region+"의 현재 시각 ");
		System.out.print(strAmPm+ " ");
		System.out.print(hour +"시 ");
		System.out.print(minute + "분");
		
		
		
	}
}
