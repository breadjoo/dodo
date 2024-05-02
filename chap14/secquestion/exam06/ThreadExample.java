package chap14.secquestion.exam06;

public class ThreadExample {

	public static void main(String[] args) {
		Thread thread = new MovieThread();
		thread.start();
		
		try {Thread.sleep(2000); }
		catch(InterruptedException e ) {}
		
		thread.interrupt();


	}

}
