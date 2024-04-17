package chap06.sec07.exam05;

public class CarExample {

	public static void main(String[] args) {
		Car car1 = new Car("자가용") ; // 생성자 1호출
			System.out.println("car1.compnay : " + car1.company);
			System.out.println("car1.model : " + car1.model);
			System.out.println("car1.color : " + car1.color);
			System.out.println("car1.maxSpeed : " +car1.maxSpeed );
			System.out.println();
		
		Car car2 = new Car("화물차","빨간색");
			System.out.println("car2.copmany : " +car2.company);
			System.out.println("car2.model : " +car2.model);
			System.out.println("car2.color : " +car2.color);
			System.out.println("car2.maxSpeed : " +car2.maxSpeed);
			System.out.println();
		Car car3 = new Car("택시","하얀색",200);
			System.out.println("car3.company : " +car3.company);
			System.out.println("car3.model : " +car3.model);
			System.out.println("car3.color : " +car3.color);
			System.out.println("car3.maxSpeed : " +car3.maxSpeed);
			
		
		


	}

}
