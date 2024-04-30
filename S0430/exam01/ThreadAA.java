package S0430.exam01;

public class ThreadAA extends Thread {
	public WorkObject2 workObject2;
	
	public ThreadAA(WorkObject2 workObject2) {
		setName("TheadAA");
		this.workObject2=workObject2;
	}
	public void run () {
		for(int i=0;i<10;i++) {
			workObject2.methodA();
		}
	}

}
