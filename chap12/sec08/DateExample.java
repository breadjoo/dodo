package chap12.sec08;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		// Date클래스 : 날짜 표현 클래스로 객체간에 날짜 정보를 주고 받을 때 사용
		// Date()생성자 : 컴퓨터의 현재 날짜를 읽어 Date 객체로 만듦
		Date now = new Date();
		String strNow1 = now.toString();
		System.out.println(strNow1);
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy년MM월dd일 HH시mm분");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy.MM.dd // HH:mm:ss");
		String strNow2 = sdf1.format(now);
		String strNow3 = sdf2.format(now);
		System.out.println(strNow2);
		System.out.println(strNow3);
		
		/* SimpleDateFormat은 날짜를 형식화된 문자열로 변화하는 기능을 제공함
		 * format 메소드로 날짜를 제공하면 패턴과 동일한 문자열을 얻음
		 */
	}

}
