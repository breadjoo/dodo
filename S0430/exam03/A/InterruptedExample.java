package S0430.exam03.A;

public class InterruptedExample {

	public static void main(String[] args) {

		PrintThread printThread = new PrintThread();
		
		printThread.start();
		
		try {
			Thread.sleep(450);
		} catch (InterruptedException e) {}
		printThread.interrupt();
		

	}

}
