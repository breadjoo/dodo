package chap14.sec06.exam02;

public class WaitNotifyExample {

	public static void main(String[] args) {
		WorkObject workObject = new WorkObject(); // 공유 작업 객체 생성
		
		ThreadA threadA = new ThreadA(workObject); // threadA 작업스레드 생성
		ThreadB threadB = new ThreadB(workObject); // threadB 작업스레드 생성
		
		threadA.start();
		threadB.start();
		
		
	}

}
