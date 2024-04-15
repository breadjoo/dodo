package chap04.sec03;

public class SwtichExpressionsExample {

	public static void main(String[] args) {
		char grade = 'B';
		
		switch (grade) {
			case 'A','a' -> {
				System.out.println("우수회원입니다.");
			} case 'B','b' -> {
				System.out.println("일반회원입니다.");
			} default -> {
				System.out.println("비회원입니다.");
			}
		}
				System.out.println("Swtich1 문 다음 문장 실행 중");
		switch (grade) {
			case 'A','a' ->	System.out.println("우수회원입니다.");
			case 'B','b' ->	System.out.println("일반회원입니다.");
			default ->	System.out.println("비회원입니다.");		
		}
				System.out.println("Swtich2 문 다음 문장 실행 중");
				
		int num = (int)(Math.random()*12)+1;
		switch (num) {
			case 11,12 -> {
				System.out.println("abc"); break;
			case num -> {
				System.out.println("아직 멀었다."); break;
			default -> {
				System.out.println("몰랑");
			}
			}
			}
		}
	}

}
