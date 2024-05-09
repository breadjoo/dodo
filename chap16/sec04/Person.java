package chap16.sec04;

public class Person {
	public void action(Calcuable calcuable) {
		double result = calcuable.calc(10, 4);
		System.out.println("결과 : " + result);
	}
	//Calcuable 을 매개변수로 갖는 action() 메소드를 작성함
	
}
