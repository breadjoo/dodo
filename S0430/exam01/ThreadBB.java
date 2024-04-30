package S0430.exam01;

public class ThreadBB extends Thread{
	public WorkObject2 workObject2;
	
	public ThreadBB (WorkObject2 workObject2) {
		setName("ThreadBB"); 
		this.workObject2=workObject2;
	}
	public void run() {
		for(int i=0;i<10;i++) {
			workObject2.methodB();
		}
	}

}
