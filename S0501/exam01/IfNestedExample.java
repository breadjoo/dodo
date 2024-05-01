package S0501.exam01;

public class IfNestedExample {

	public static void main(String[] args) {
		int score = (int)(Math.random()*20);
		System.out.println("점수 : " + score);
		String grade;
		
		if(score>10) {
			if(score>15) {
				grade = "A+";
			}else {
				grade = "A";
			}	
			}else {
				if	(score>=0) {
					grade= "B+";
					} else {
						grade = "B";
			}
		}

			System.out.println("등급 : " + grade);
	}

}

	

