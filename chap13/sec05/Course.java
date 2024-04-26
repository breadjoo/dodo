package chap13.sec05;

public class Course {
	//모든 사람이면 등록 가능
	//<?> : 어떤 타입이든 가능하도록 매개변수 선언
	public static void registerCourse1(Applicant<?> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName()+
				"이(가) Course1을 등록함" );
	}//학생만 등록 가능
	// 타입 파 라미터의 대체 타입으로 Student와 자식 클래스만 가능하도록 매개변수 선언
	public static void registerCourse2(Applicant<? extends Student> applicant) { // extends : student의 자식까지가능
		System.out.println(applicant.kind.getClass().getSimpleName()+
				"이(가) Course2를 등록함");
	}//직장인 및 일반인만 등록 가능
	//Worker와 부모 클래스인 Person만 대체가능하도록 매개변수 선언
	public static void registerCourse3(Applicant<? super Worker> applicant) { //super : worker의 부모까지가능
		System.out.println(applicant.kind.getClass().getSimpleName()+ 
				"이(가) Course3를 등록함");
	}
	
	
	
}
