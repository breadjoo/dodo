package chap14.sec06.exam02;

public class ThreadB extends Thread {
	public WorkObject workObject;
	
	public ThreadB(WorkObject workObject) {
		setName("ThreadB");
		this.workObject=workObject;
	}
	public void run() {
		for(int i=0;i<10;i++) {
			workObject.methodB();
		}
	}

}
