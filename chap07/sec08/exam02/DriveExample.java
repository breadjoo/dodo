package chap07.sec08.exam02;

public class DriveExample {

	public static void main(String[] args) {
		//Driver 객체 생성
		Driver driver = new Driver () ;
		
		//매개값으로 Bus 객체를 제공하고 driver()메소드 호출
		Bus bus = new Bus();
		driver.drive(bus);
		
		Taxi taxi = new Taxi();
		driver.drive(taxi);
		
		


	}

}
