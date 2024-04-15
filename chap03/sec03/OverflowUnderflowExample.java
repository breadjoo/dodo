package chap03.sec03;

public class OverflowUnderflowExample {

	public static void main(String[] args) {
		byte var1 = 125;
		for(int i=0; i<5; i++) { // {} 를 5번 반복실행
			var1++; // var1을 1증가
				System.out.println("var1 : " + var1);
		}
			
				System.out.println("------------------");
				
		byte var2 = -125;
		for(int i=0; i<5; i++) {
			var2--; // var2를 1감소
				System.out.println("var2 : "+var2);
		}
			
		
		
		byte bar1 = 22;
		for (int i=0; i<10; i++) {
			bar1++;
			System.out.println(bar1);
		}
		
		
		

	}

}
