package S0509.exam04;

public class MethodReferenceExample {

	public static void main(String[] args) {
		Person person = new Person();
		
		person.action(Computer::staticSum);
		
		Computer com = new Computer();
		
		person.action(com::instanceOfMultiple);

	}

}
