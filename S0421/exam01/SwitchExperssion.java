package S0421.exam01;

public class SwitchExperssion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int num = (int)(Math.random()*12)+1;
	switch (num) {
		case 11,12->
			System.out.println("11~12 : "+num);
		case 1,2,3,4,5 -> 
			System.out.println("1~5 : "+num); 
		default -> 
			System.out.println("나머지 : "+num);
	}
	}
	/* Switch문에 case 복습
	 * math.random 할 땐 int or double 사용, 곱하기 몇~ 해줘야 숫자가 잘 나오고
	 * case는 너무 어렵게 생각하지 말자 그냥 간단한거다.
	 * case x,y -> "이거는 그냥 x,y나오면 뭐뭐해라 "
	 * 
	 */
}
