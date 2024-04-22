package chap09.sec07.exam03;

public class ButtonExample {

	public static void main (String [] args) {
		// Ok 버튼 객체 생성
		Button btnOk = new Button();
		
		btnOk.setClickListener(new Button.ClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("Ok 버튼을 클릭했습니다.");
				
			}
		});
		btnOk.click();
		
		Button btnCancel = new Button();
		btnCancel.setClickListener(new Button.ClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("Cancel 버튼을 클릭했습니다.");
				
			}
		});
		btnCancel.click();
	}
}
