package S0427.exam04;

import java.util.regex.Pattern;

public class PatternExample {

	public static void main(String[] args) {

		//이메일, 전화번호 형식만들기
		
		String exp = "(02|010)-\\d{3,4}-\\d[{4}";
		String phone = "010-1231-1231";
		
		String emailExp = "\\w+@\\w+\\.\\w+";
		String email = "bread@git.hub";
		
		boolean result1 = Pattern.matches(exp, phone);
		boolean result2 = Pattern.matches(emailExp, email) ;
		
		if (result1) {
			System.out.println("올바른 입력입니다.");
		} else {
			System.out.println("잘못된 입력입니다.");
		}
		
		if (result2) {
			System.out.println("사용 가능한 E-mail입니다.");
		} else {
			System.out.println("잘못된 입력입니다.");
		}
		
	}

}
