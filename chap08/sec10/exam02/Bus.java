package chap08.sec10.exam02;

public class Bus implements Vehicle{

	//추상 메소드 재정의
	public void run () {
		System.out.println("버스가 달려요");
	}
	
	//추가 메소드
	public void checkFare() {
		System.out.println("승차요금을 체크합니다.");
	}
}
