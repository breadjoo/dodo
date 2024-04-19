package chap08.sec10.exam02;

public class CastingExample {

	public static void main(String[] args) {
		
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		
		//vehicle.checkFare() ;안나옴
		
		//강제 타입 변환 후 checkFare(); 호출 가능
		Bus bus = (Bus) vehicle;
		bus.run();
		bus.checkFare();
		
		//이것도 되는데 왜 위에 방식으로 할까 
		Bus bus1 = new Bus();
		bus1.checkFare();
	}

}
