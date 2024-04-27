package S0427.exam01;

public class Course {

	public static void registerCourse1(Applicant <?> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName()
				+"이(가) 등록했습니다.");
		
	}
	public static void registerCourse2(Applicant <? extends Student> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName()
				+"이(가) 등록했습니다.");
	}
	
	public static void registerCourse3(Applicant <? super Worker> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName()
				+"이(가) 등록했습니다.");
		
	}

}
