package chap08.sec12;

public class Bus implements Vehicle {

	public void run() {
		System.out.println("버스가 달려용");
	}
	
	
	//추가메소드
	public void checkFare() {
		System.out.println("승차요금 확인");
	}
}
