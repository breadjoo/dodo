package chap14.sec06.exam01;

public class User2Thread extends Thread {

	private Calculator calculator;
	public User2Thread() {
		setName("User2Therad");
	}
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	
	public void run() { 
		calculator.setMemory2(150); // 동기화 블록을 가진 메소드 호출
	}
}
