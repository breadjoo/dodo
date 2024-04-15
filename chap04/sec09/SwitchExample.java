package chap04.sec09;

public class SwitchExample {

	public static void main(String[] args) {
		String grade = "B";
		int score1 = 0;
		switch (grade) {
		case "A" :
			score1 = 100; break;
		case "B" :
			int result = 100 - 20;
			score1 = result; break;
		default :
			score1 = 60;
		}
			System.out.println(score1);
			
		String grade2 = "C";
		int score2 = switch(grade2) {
		case "A" -> 100;
		case "B" -> {
			int result2 = 100-20;
			yield result2;
		}
		case "C" -> 100-40;
		default -> 40;
		};	System.out.println(score2);
		
			
	}

}
