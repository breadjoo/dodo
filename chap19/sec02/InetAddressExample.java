package chap19.sec02;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressExample {

	public static void main(String[] args) {
/*자바는 IP주소를 java.net 패키지의 InetAddress로 표현
로컬 컴퓨터의 InetAddress를 얻으려면 InetAddress.getLocalHost() 메소드를 호출
getByName() 메소드는 도메인 이름으로 등록된 단 '하나'의 IP주소를 가져옴
getAllByName() 메소드는 등록된 IP 주소를 배열로 가져옴
InetAddress 객체에서 IP 주소를 얻으려면 getHostAddress() 메소드를 호출 
*/
		

		try {
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("내 컴퓨터 ip 주소 " + local.getHostAddress());
			
			InetAddress[] iaArr = InetAddress.getAllByName("www.naver.com");
			for(InetAddress remote : iaArr) {
				System.out.println("www.naver.com IP 주소 : " + remote.getHostAddress());
			}
		}catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

}

