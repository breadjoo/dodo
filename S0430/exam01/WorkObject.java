package S0430.exam01;

public class WorkObject {
	public synchronized void methodA() {
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName()+" : A 작업 실행");
		notify();
		try {
			wait();
		} catch(InterruptedException e) { }
	}
		
	public synchronized void methodB () {
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName()+" : B 작업 실행");
		notify();
		try {
			wait();
		} catch(InterruptedException e) {}
		
	
		
	}

}
