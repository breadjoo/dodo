package chap16.sec02.exam02;

public class Button {
	
	@FunctionalInterface
	public static interface ClickListener {
		void onClick();
	}
	//필드선언
	private ClickListener clickListener;
	
	//메소드 선언
	public void setClickListenser(ClickListener clickListener) {
		this.clickListener = clickListener;
	}
	
	public void click() {
		this.clickListener.onClick();
	}
}
