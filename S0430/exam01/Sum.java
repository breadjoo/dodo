package S0430.exam01;

public class Sum extends Thread {
	private long sum ;
	
	public long getSum() {
		return sum;
	}
	
	public void setSum(long sum) {
		this.sum = sum;
	}
	
	public void run () {
		for(int i=0; i<100000; i++) {
			sum += i;
		}
	}
	
	
}
