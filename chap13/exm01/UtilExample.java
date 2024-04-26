package chap13.exm01;

public class UtilExample {
	public static void main(String [] args) {
		Pair<String, Integer>pair = new Pair<>("홍길동",35);
		Integer age = Util.getValue(pair,"홍길동");
		System.out.println(age);
		
		Pair<String, Integer>pair2 = new Pair<>("유환주",31);
		Integer age2 = Util.getValue(pair2,"유환주");
		System.out.println(age2);
		
		
		ChildPair<String, Integer> childPair = new ChildPair<>("홍삼원",20);
		Integer childAge = Util.getValue(childPair,"홍삼순");
		System.out.println(childAge);
			
		
		
	}
}
