package chap08.sec11.exam01;

public class CarExample {

	public static void main(String[] args) {
		//자동차 객체 생성
		Car myCar = new Car();
		
		myCar.run();
	
		myCar.tire1 = new KumhoTire();
		myCar.tire2 = new KumhoTire();
		
		System.out.println("-------------");
		
		myCar.run();
		
		
		


	}

}
