package chap08.sec02;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc ;
		RemoteControl rc1;
		
		//변수'rc'에 객체 'Television'을 대입
		rc = new Television();
		rc1 = new Audio();
		/* 인터페이스를 통해 구현 객체를 사용하려면, 인터페이스 변수에 구현 객체의 번지를 대입함
		 * 
		 */
		rc.turnOn();
		rc1.turnOffAudio();
		
		
		//밑에 방식으로 하면 매번 새로 정의해야하는것 아닌가.?
		rc = new Audio();
		rc.turnOnAudio();
		
			

	}

}
