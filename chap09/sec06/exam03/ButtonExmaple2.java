package chap09.sec06.exam03;

public class ButtonExmaple2 {

	public static void main(String [] args) {

		Button btnOk = new Button();
		
		class OkClickListener implements Button.ClickListener { // button클래스 안에 clicklistener라는 인터페이스에 impl 시킨다.
			public void onClick() { // 추상메소드기 때문에 재정의해주고
				System.out.println("Ok 버튼 클릭");
			}
		}
		btnOk.setClickListener(new OkClickListener()); //무엇을 구현할지 구현객체 (OkClickListener라는 클래스)
		btnOk.click(); // 실행하기 
		
		System.out.println("-----------------------");
		Button btnCancel = new Button ();
		
		class CancelClickListener implements Button.ClickListener {
			public void onClick() {
				System.out.println("Cancel 버튼 클릭");
			}
		}
		btnCancel.setClickListener(new CancelClickListener());
		btnCancel.click();
		
}
}