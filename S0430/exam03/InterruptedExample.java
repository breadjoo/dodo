package S0430.exam03;

public class InterruptedExample {

	public static void main(String[] args) {
		PrintThread printThread = new PrintThread();
		printThread.start();
		
		try {
			Thread.sleep(1500);
		} catch(InterruptedException e) {}
		
		printThread.interrupt();
		

	}

}
