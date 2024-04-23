package S0422.exam01;

public class ButtonExample {

	public static void main (String [] args) {
	
		Button btnOk = new Button();
	btnOk.setClickListner(new Button.ClickListener() {
		
		@Override
		public void onClick() {
			System.out.println("Ok버튼 클릭");
			
		}
	});
	btnOk.click();
		Button btnCancel = new Button();
	btnCancel.setClickListner(new Button.ClickListener() {
		
		@Override
		public void onClick() {
			System.out.println("Cancel버튼 클릭");
			
		}
	});btnCancel.click();
		
	}
}
