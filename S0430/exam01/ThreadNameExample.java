package S0430.exam01;

public class ThreadNameExample {

	public static void main(String[] args) {
		//메인스레드 실행 -> 스레드 A -> 스레드 B
		Thread mainThread = Thread.currentThread();
		System.out.println(mainThread.getName()+"실행");
		
		for(int i=0;i<3;i++) {
		Thread threadA = new Thread() {
			public void run() {
				System.out.println(getName()+"실행");
			}
		};
		
		threadA.start();
		
		Thread threadB = new Thread() {
			public void run() {
				System.out.println(getName()+"실행");
			}
		};
		
		threadB.setName("Thread-B");
		threadB.start();
		}
		

	}

}
