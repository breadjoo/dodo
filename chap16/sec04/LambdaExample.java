package chap16.sec04;

public class LambdaExample {

	public static void main(String[] args) {
		Person person = new Person();
		
		person.action((x,y) -> {
			double result = x+y;
			return result;
		});
		
		//return문이 하나만 있을 경우(연산식)
		person.action((x,y) -> (x+y));
		
		person.action((x,y)-> sum(x,y));
		
		
	}
	public static double sum(double x, double y) {
		return (x + y) ;
	}

}
