package chap09.sec07.exam03;

public class Button {

	public static interface ClickListener {
		//추상 메소드
		void onClick();
	}
	
	// 필드 선언
	private ClickListener clickListener;
	
	//메소드 선언
	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}
	
	public void click() {
		this.clickListener.onClick();
	}
	
}
