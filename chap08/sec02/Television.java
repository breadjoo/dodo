package chap08.sec02;

public class Television implements RemoteControl {
	/* implements 키워드는 해당 클래스가 인터페이스를 통해서 사용할 수 있다는 표시.
	 * implements 키워드는인터페이스의 추상 메소드를 재정의한 메소드가 있다는 뜻. */
	
	public void turnOn() {
		System.out.println("Turn on the TV");
	}
	
}
