package chap09.sec06.exam02;

public class Button {
	// 정적 인터페이스 선언
	// 정적 멤버 인터페이스
	public static interface ClickListener {
		// 추상 메소드
		void onClick();
		
	}
	// 중첩 인터페이스 타입으로 필드와 Setter를 선언
	// 필드 선언
	private ClickListener clickListener;
	
	//Setter를 선언
	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}
	
}
