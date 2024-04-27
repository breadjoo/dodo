package S0427.exam02;

public class GenericExample {
	public static void main (String [] args) {
		
		System.out.println("와일드카드");
		Course.registerCourse1(new Applicant <MidStu> (new MidStu()));
		
		
		
		System.out.println("extends");
		Course.registerCourse2(new Applicant <Student> (new Student()));
		
		
		System.out.println("super");
		Course.registerCourse3(new Applicant <Person> (new Person()));
		
		
	}

}
