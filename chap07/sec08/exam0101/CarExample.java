package chap07.sec08.exam0101;

public class CarExample {
	public static void main(String[] args) {
		
		Car myCar = new Car();
		
		myCar.tire = new Tire();
		myCar.run();
		
		myCar.tire = new Kmtire();
		myCar.run();
		
		myCar.tire = new HkTire();
		myCar.run();
		
		
				
		
		
		
	}
	
}
