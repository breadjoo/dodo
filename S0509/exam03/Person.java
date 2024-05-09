package S0509.exam03;

public class Person {
	public void action(Calcuable calcuable) {
		double result = calcuable.calc(10.5, 20.1);
		System.out.println("결과 값 : " + result);
	}

}
