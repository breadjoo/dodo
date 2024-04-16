package chap06.sec07.exam04;

public class CarExample1 {

	public static void main(String[] args) {
		
		Car car1 = new Car();
		System.out.println("car1.company : "+car1.company);
		System.out.println();
		
		Car car2 = new Car("제네시스");
		System.out.println("car2.model : " +car2.model);
		System.out.println();
		
		Car car3 = new Car("캐스퍼","검정색");
		System.out.println("car3.color : " + car3.color);
		System.out.println("car3.model : " + car3.model); 
		System.out.println();
		
		Car car4 = new Car("자가용","빨간색",300);
		System.out.println("car4.maxSpeed:" + car4.maxSpeed+"km/h");
		System.out.println();
		
		Car car5 = new Car("자가용","하얀색",230,5537);
		System.out.println("car5.carNum:"+car5.carNum);
		System.out.println(car5.maxSpeed);
		System.out.println();
		
		//System.out.print("car4,car5의 비교 : ");
		System.out.println(car5.model+"="+car4.model);
		System.out.println(car5.model==car4.model);
		System.out.println(car5.model==car4.model+"");
		System.out.println(car5==car4);

	}

}
