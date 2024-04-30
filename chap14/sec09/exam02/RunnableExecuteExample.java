package chap14.sec09.exam02;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableExecuteExample {

	public static void main(String[] args) {
		/*1000개의 Runnable을 생성한 다음 execute()메소드로 작업큐에 넣음
		 * ==>ExcutorService는 최대 5개 스레드로 작업 큐에서 Runnable을 하나씩 꺼내어 run()메소드 실행 */
		
		String[][] mails = new String[1000][3];
		for(int i=0;i<mails.length;i++) {
			mails[i][0] = "admin@my.com";
			mails[i][1] = "member"+i+"my.com";
			mails[i][2] = "신상품 입고";
		}
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		
		for(int i=0; i<1000; i++) {
			final int idx = i;
			executorService.execute(new Runnable() {
				public void run() {
					Thread thread = Thread.currentThread();
					String from = mails[idx][0];
					String to = mails[idx][1];
					String content = mails[idx][2];
					System.out.println("["+thread.getName()+"]"+from+"==>"+to+":"+content);
				}
			});
		}
		
		executorService.shutdown();

	}

}
