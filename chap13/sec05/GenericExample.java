package chap13.sec05;

public class GenericExample {

	public static void main(String[] args) {
			System.out.println("<?>(와일드카드) 어떤 타입이든 가능하도록 매개변수 선언");
		Course.registerCourse1(new Applicant<Person>(new Person()));
		Course.registerCourse1(new Applicant<Worker>(new Worker()));
		Course.registerCourse1(new Applicant<Student>(new Student()));
		Course.registerCourse1(new Applicant<HighStudent>(new HighStudent()));
		Course.registerCourse1(new Applicant<MiddleStudent>(new MiddleStudent()));
			System.out.println("---------------------");
			
			System.out.println("<? extends 변수> 해당변수와, 자식클래스만 가능하도록 매개변수 선언");
		Course.registerCourse2(new Applicant<Student>(new Student()));
		Course.registerCourse2(new Applicant<HighStudent>(new HighStudent()));
		Course.registerCourse2(new Applicant<MiddleStudent>(new MiddleStudent()));
			System.out.println("---------------------");
			
			System.out.println("<? super 변수> 해당변수와, 부모클래스만 가능하도록 매개변수 선언");
		Course.registerCourse3(new Applicant<Worker>(new Worker()));
		Course.registerCourse3(new Applicant<Person>(new Person()));
			System.out.println("---------------------");
		
	}

}
