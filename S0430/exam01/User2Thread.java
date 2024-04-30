package S0430.exam01;

public class User2Thread extends Thread{
	private Calculator calculator;
	
	public User2Thread() {
		setName("2번");
	} public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	} public void run() {
		calculator.setMemory2(155);
	}

}
