package chap14.sec09.exam01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorSeviceExample {

	public static void main(String[] args) {
		// 스레드 풀 생성(최대 5개의 스레드 운영)
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		
		executorService.shutdownNow();
		//shutdownnow() : 남아있는 작업과 상관없이 강제종료	

	}

}
