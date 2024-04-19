package chap08.sec12.exam00;

public class InstanceOfExample {

	public static void main(String[] args) {

		Kid kid = new Kid();
		Student student = new Student();
		Adult adult = new Adult();
			
		ride(kid);
		System.out.println("------------");
		ride(student);
		System.out.println("------------");
		ride(adult);
		System.out.println("------------");
		

	}
	
	public static void ride (Bus bus) {
		if (bus instanceof Kid kid) {
			kid.checkFare();
			bus.run();
		} else if (bus instanceof Student student) {
			student.checkFare();
			bus.run();
		} else if (bus instanceof Adult adult) {
			adult.checkFare();
			bus.run();
		}
	}

}
