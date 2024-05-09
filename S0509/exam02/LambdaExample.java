package S0509.exam02;

public class LambdaExample {

	public static void main(String[] args) {
		Person person = new Person();
		
		person.action1((name,job)-> {
			System.out.println(name+"이"+job+"을합니다.");
		});
		person.action1((name,job)-> System.out.println(name+"이"+job+"을한다니께용"));
	
	
		person.action2((speak) -> System.out.println(speak+"라고말하는중"));
		person.action2((speak) -> {
			System.out.print(speak);
			System.out.println("라고 말하는중 !@! -> 두가지 할 때는 중괄호 {}");
		});
	}
		

}
