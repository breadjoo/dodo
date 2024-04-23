package S0422.exam01;

public class Button {

	//정적 인터페이스
	public static interface ClickListener {
		void onClick();
	}
	//필드
	private ClickListener clickListener ;
	
	
	//메소드
	public void setClickListner(ClickListener clickListener) {
		this.clickListener = clickListener;
	}
	
	
	//실행 메소드
	public void click() {
		this.clickListener.onClick();
	}
	
}
