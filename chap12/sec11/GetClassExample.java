package chap12.sec11;

public class GetClassExample {

	public static void main(String[] args) throws Exception {
		// 방법1
		Class class2 = Car.class;
		
		// 방법2
		//Class class2 = Class.forName("Ch12.sec11.Car");
		
		//방법3
		//Car car = new Car();
		//Class class2 = car.getClass();
		
		System.out.println("패키지: " +class2.getPackage().getName());
		System.out.println("패키지: " +class2.getPackage());
		System.out.println("패키지: " +class2.getPackageName());
		System.out.println("클래스 간단 이름 " + class2.getSimpleName());
		System.out.println("클래스 전체 이름 " + class2.getName());
		

	}

}
