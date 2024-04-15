package chap04.sec02;

public class IfDiceExample2 {

	public static void main(String[] args) {
		int a = (int)(Math.random()*100+1);
		
		if (a <=10 ){
			System.out.println("너무 낮습니다! : " + a );
		} else if (a<=20) {
			System.out.println("운이 안좋은편이시네요 ! :" + a);
		} else if (a<=30) {
			System.out.println("그래도 최화위권은 아닌걸요? :" + a);
		} else if (a<=40) {
			System.out.println("나쁘지 않습니다 : " + a);
		} else if (a<=60) {
			System.out.println("평범하네요 : " + a);
		} else if (a<=80) {
			System.out.println("운수 좋은날입니다 : " + a);
		} else if (a<=95) {
			System.out.println("로또를 한 번 사보세요 : " + a);
		} else if (a==100) {
			System.out.println("축하드립니다 ! 1등이에요 :" + a);
		}
		
		
	}

}
