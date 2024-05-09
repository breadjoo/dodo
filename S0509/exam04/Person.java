package S0509.exam04;

public class Person {
	public void action(Calcuable calcuable) {
		double result = calcuable.calc(20, 30);
		System.out.println("결과 값 : " + result);
	}

}
