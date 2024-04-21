package S0421.exam01;

public class SwitchValueExample {

	public static void main(String[] args) {

		String grade = "B";
		
		int score1 = 0;
		switch(grade) {
		case "A" :
			score1 = 100; break;
		case "B" : 
			int result = 100-20;
			score1 = result; break;
		default : 
			score1 = 60;
		}
			System.out.println(score1);
		
		int score2 = switch(grade) {
		case "A" -> 100;
		case "B" -> {
			int result = 100-10;
			yield result;
		}default -> 60;};
		System.out.println(score2);
		
	}
	
/*Switch문 복습
 * switch문은 간편하게 쓸 수 있는 if문 같은것 같다. 아직 잘 모르겠다 몇번안해본거라
 * yield 가 중요한것같다. 결과값을 다시 초기값?으로 돌려줘서 출력하는 방식
 */



}



