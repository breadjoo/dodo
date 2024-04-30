package chap14.sec06.exam02;

public class ThreadA extends Thread {
	public WorkObject workObject;
	
	public ThreadA(WorkObject workObject) { // 공유 작업 객체 받음
		setName("ThreadA"); // 스레드 이름 변경
		this.workObject = workObject;
	}
	
	public void run() {
		for(int i=0;i<7;i++) {
			workObject.methodA();
		}
	}

}
