package chap04.sec02;

public class IfElseIfElseExample {

	public static void main(String[] args) {
		int score = 50 ;
		if (score>=90) {
			System.out.println("점수가 '100 ~ 90' 사이입니다.");
			System.out.println("등급은 A입니다.");
		} else if (score >= 80) {
			System.out.println("점수가 '80~ 89' 사이입니다.");
			System.out.println("등급은 B입니다.");
		} else if (score >= 70) {
			System.out.println("점수가 '70~ 89' 사이입니다.");
			System.out.println("등급은 C입니다.");
		} else if (score >=60) {
			System.out.println("점수가 '60~ 69'입니다.");
			System.out.println("등급은 D입니다.");
		} else {
			System.out.println("점수가 59 이하입니다.");
			System.out.println("등급은 F입니다.");
			
		}
		
		System.out.println("if 다음 문장 실행함");

		
	}

}

