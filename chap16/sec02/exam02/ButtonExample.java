package chap16.sec02.exam02;

public class ButtonExample {

	public static void main(String[] args) {
		// Ok버튼 객체 생성
		Button btnOk = new Button();
		
		//Ok버튼 객체에 람다식 (ClickListener 익명 구현 객체)주입
		btnOk.setClickListenser(() -> {
			//매개값으로 람다식을 대입
			System.out.println("OK 버튼을 클릭했습니다.");
		});
		btnOk.click();
		
		Button btnCancel = new Button();
		
		btnCancel.setClickListenser(() -> {
			System.out.println("Cancel 버튼을 클릭했습니다.");
		});
		
		btnCancel.click();
	}

}
