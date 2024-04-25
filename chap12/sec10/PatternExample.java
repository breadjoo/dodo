package chap12.sec10;

import java.util.regex.Pattern;

public class PatternExample {

	public static void main(String[] args) {
		// 
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
		String phoneNum = "010-1234-1234";
		
		boolean result = Pattern.matches(regExp, phoneNum);
		if(result) {
			System.out.println("올바른 입력값");
		} else {
			System.out.println("오류");
		}
		
		String regExp2 = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		String email = "angel@mycompany.com";
		boolean result2 = Pattern.matches(regExp2, email);
		if(result2) {
			System.out.println("올바른 입력값");
		} else {
			System.out.println("오류");
		}

	}

}
