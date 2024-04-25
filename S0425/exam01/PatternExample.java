package S0425.exam01;

import java.util.regex.Pattern;

public class PatternExample {

	public static void main(String[] args) {
		// 
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
		String email = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		
		String phoneNum = "010-1234-5555";
		String myEmail = "aksd@asdf.cos.sd";
		
		boolean result1 = Pattern.matches(regExp, phoneNum);
		
		boolean result2 = Pattern.matches(email, myEmail);
		
		System.out.print("전화번호 대조 : ");
		if (result1) {
			System.out.println("올바른 입력값");
		} else {
			System.out.println("오류");
		}
		System.out.print("이메일 대조 : ");
		if (result2) {
			System.out.println("올바른 입력값");
		} else {
			System.out.println("오류");
		}
	}

}
