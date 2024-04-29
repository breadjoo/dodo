package S0429.exam01;

public class ThreadNameExam01 {

	public static void main(String[] args) {
		// main 실행 -> thread 3번까지 실행 -> 이름바꿔서 실행
		Thread mainThread = Thread.currentThread();
		System.out.println(mainThread.getName());
		
		for(int i=0;i<3;i++) {
			Thread threadA = new Thread() {
				public void run() {
					System.out.println(getName());
				}
			};
			threadA.start();
			
			Thread chatThread = new Thread() {
				public void run() {
					System.out.println(getName());
				}
			};
			chatThread.setName("Chat-Thread");
			chatThread.start();
		}
		
	}
}
