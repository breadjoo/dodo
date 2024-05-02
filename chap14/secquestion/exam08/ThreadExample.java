package chap14.secquestion.exam08;

public class ThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread = new MovieThread();
		thread.setDaemon(true);
		thread.start();
		
		try {Thread.sleep(3000);} catch(InterruptedException e) {}

	}

}
