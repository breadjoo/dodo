package chap03.sec03;

public class InfinityAndNaNCheckExample {

	public static void main(String[] args) {
		int x = 5;
		double y = 0.0;
		double z = x / y; // Infinity 출력
			System.out.println(z);
		double z2 = x % y ; // NaN(Not a Number) 출력
			System.out.println(z2);
			// 잘못된 코드
			System.out.println(z + 2);
			
			//알맞은 코드
		if(Double.isInfinite(z) || Double.isNaN(z2));{
			System.out.println("값을 산출할 수 없습니다.");}

		  {  
			System.out.println(z + 2);
		
		}

	}

}
