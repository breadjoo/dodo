package S0430.exam01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {

	public static void main(String[] args) {

		String[][] mails = new String[1000][3];
		for(int i=0;i<mails.length;i++) {
			mails[i][0] = "asdf";
			mails[i][1] = "aaa" ;
			mails[i][2] = "vvv" ;
		}
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		
		for(int i=0;i<1000;i++) {
			final int idx = i;
			executorService.execute(new Runnable() {
				public void run() {
					Thread thread = Thread.currentThread();
					String from = mails[idx][0];
					String to = mails[idx][1];
					String a = mails[idx][2];
					System.out.println(thread.getName()+from+to+a);
				}
			});
		}
		
	}

}
