package chap04.sec03;

public class SwitchCharExample {

	public static void main(String[] args) {
		char grade = 'B';
			System.out.println(grade);
		switch(grade) {
		case 'A' : 
		case 'a' :
			System.out.println("우수 회원입니다."); break;
		case 'B' : 
		case 'b' :
			System.out.println("일반 회원입니다."); break;
		default : 
			System.out.println("비회원입니다.");
		
		}
			System.out.println("Switch 문장 끝 ");

	}

}
