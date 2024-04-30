package S0430.exam01;

public class WorkObject2 {
	public synchronized void methodA() {
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName()+"작업실행");
		notify();
		try {
			wait();
		} catch(InterruptedException e) {}
		}
	
	public synchronized void methodB() {
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName()+"작업 실행");
		notify() ; // 다른 스레드를 대기상태로 만들기!
		try {
			wait();
		} catch(InterruptedException e) {}
	}
	
}
