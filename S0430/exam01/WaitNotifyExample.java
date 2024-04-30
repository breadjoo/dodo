package S0430.exam01;

public class WaitNotifyExample {

	public static void main(String[] args) {
		WorkObject2 workObject2 = new WorkObject2();
		
		ThreadAA thAA = new ThreadAA(workObject2);
		ThreadBB thBB = new ThreadBB(workObject2);		
		thAA.start();
		thBB.start();
		
	}

}
