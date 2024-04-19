package chap08.sec12;

public class InstanceofExample {

	public static void main (String[] args) {
		
		//구현 객체 생성
		Taxi taxi = new Taxi();
		Bus bus = new Bus();
		//ride()메소드 호출시 구현객체를 매개값으로 전달함
		ride(taxi);
		System.out.println();
		ride(bus);
		System.out.println();
	}
	
	//인터페이스를 매개변수로 갖는 메소드
	
	public static void ride(Vehicle vehicle) {
		if(vehicle instanceof Bus bus) {
			bus.checkFare();			
		} vehicle.run();
		
	}
	
}
