package chap09.sec07.exam02;

public class HomeExample {

	public static void main (String [] args) {
		Home home = new Home();
		
		home.use1();
		
		home.use2();
		
		home.use3(new RemoteControl() {
			
			public void turnOn() {
				System.out.println("Turn on the airconditional");
			} public void turnOff() {
				System.out.println("Turn off the airconditional");
			}
		});
	}
}
