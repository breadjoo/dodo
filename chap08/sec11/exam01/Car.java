package chap08.sec11.exam01;

public class Car {

	Tire tire1 = new HankookTire();
	Tire tire2 = new HankookTire();
	
	void run() {
		tire1.roll();
		tire2.roll();
		//인터페이스에 선언된 추상 메소드를 호출, 
	}
}
