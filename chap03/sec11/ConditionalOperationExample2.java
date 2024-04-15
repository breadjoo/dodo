package chap03.sec11;

public class ConditionalOperationExample2 {

	public static void main(String[] args) {

		int score = 85;
			char result = (!(score>90))? '가':'나';
				System.out.println(result);
			String result1 = (!(score>90))? "가":"나";
				System.out.println(result1);
				
				
		int score1 = 95;
			String result2 = ( score1>90 )?  "참 잘했어요!":"화이팅하세요!";
				System.out.println(result2);
		int score2 = 70;
			String result3 = ( score2>90)? "참 잘했어요!":"화이팅하세요!";
				System.out.println(result3);
	}

}
