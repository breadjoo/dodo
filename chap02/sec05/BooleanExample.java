package chap02.sec05;

public class BooleanExample {

	public static void main(String[] args) {
		// 
		boolean stop = true ; 
		if(stop) {
			System.out.println("중지합니다.");
		} else {
			System.out.println("시작합니다.");
		}
		boolean start = true;
		if(start) {
			System.out.println("시작합니다.");
		}
		int x = 10;
		boolean result1 = (x == 20); // == 같다
		boolean result2 = (x != 20); // != 같지않다
		boolean result3 = (0<x && x<20) ; // && -> and (그리고) 조건
		boolean result4 = (0<x || x>20) ;  // || 은 or (또는) 조건
			System.out.println("result1 : " + result1);
			System.out.println("result2 : " + result2);
			System.out.println("result3 : " + result3);
			System.out.println("result4 : " + result4);
		
	}

}
