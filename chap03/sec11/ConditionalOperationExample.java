package chap03.sec11;

public class ConditionalOperationExample {

	public static void main(String[] args) {
		int score = 85;
		char grade = (score>90)? 'A':'B';
			System.out.println(score + "점은 " +grade + "등급입니다.");

		int score1 = 75;
		char grade1 = (score1>90)? 'A':((score1>80)? 'B':'C');
			System.out.println(score1 + "점은 " +grade1 + "등급입니다.");
				
		int score2 = 43;
		char grade2 = (score2>90)? 'A':((score2>80)?'B':((score2>70)?'C':(score2>60)?'D':'F'));
			System.out.println(score2 +"점은 " + grade2 + "등급입니다.");

	}

}
