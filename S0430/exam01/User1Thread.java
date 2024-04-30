package S0430.exam01;

public class User1Thread extends Thread{
	private Calculator calculator;
	
	public User1Thread() {
		setName("1번");
	}
	
	public void setCalculator(Calculator calculator) {
		this.calculator=calculator;
	}
	
	public void run() {
		calculator.setMemory(100);
	}

}
