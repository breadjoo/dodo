package S0430.exam01;

public class ThreadA extends Thread {
	WorkObject workObject = new WorkObject();
	
	public ThreadA (WorkObject workObject) {
		setName("ThreadA");
		this.workObject = workObject;
	}
	public void run() {
		for(int i=0; i<5; i++) {
			workObject.methodA();
	}
		

}
}
