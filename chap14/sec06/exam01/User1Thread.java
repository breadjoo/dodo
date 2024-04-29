package chap14.sec06.exam01;

public class User1Thread extends Thread{
	private Calculator calculator; //필드 선언
	
	public User1Thread() {
		setName("User1Thread");
	}
	
	public void setCalculator(Calculator calculator) {
		//외부에서 공유객체인 Calculator를 받아 필드에 저장하는 setter 메소드
		this.calculator = calculator;		
	}
	
	public void run() {
		calculator.setMemory1(100); // 동기화 메소드 호출
	}

}
