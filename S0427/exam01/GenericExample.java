package S0427.exam01;

public class GenericExample {

	public static void main (String [] args) {
		System.out.println("와일드카드");
		Course.registerCourse1(new Applicant <Worker> (new Worker()));
		Course.registerCourse1(new Applicant <Student> (new Student()));
		
		System.out.println("extends");
		Course.registerCourse2(new Applicant <Student> (new Student()));
		Course.registerCourse2(new Applicant <HighSchoolStudent> (new HighSchoolStudent()));
		Course.registerCourse2(new Applicant <Student> (new Student()));
		
		System.out.println("super");	
		Course.registerCourse3(new Applicant <Worker> (new Worker()));
		
	}
}
