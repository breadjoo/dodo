package chap16.sec00.exam05;

public class Example {
	public static void main(String [] args) {
		Button btnOk = new Button();
		btnOk.setClickListener(()->{
			System.out.println("ok버튼을 클릭했습니다.");
		});
		btnOk.click();
		
		Button btnCancel = new Button();
		btnCancel.setClickListener(()-> System.out.println("Cancel버튼을 클릭했습니다."));
		btnCancel.click();
	}

}