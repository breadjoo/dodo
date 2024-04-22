package chap09.sec06.exam01;

public class Button {
	// 중첩 인터페이스는 해당 클래스와 긴밀한 관계를 맺는 구현 객체를 만들기 위해 클래스의 멤버로 선언된 인터페이스
	// 중첩 인터페이스 선언
	// 정적 멤버 인터페이스
	public static interface ClickListener {
		//추상 메소드
		void onClick();
	}
	
	/* 외부 접근이 가능하도록 public 이면서 Button 객체없이 사용할 수 있는
	 * static 중첩 인터페이스로 ClickListener를 선언함
	 */
}
