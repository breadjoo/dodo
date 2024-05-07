package S0507.exam01;

import java.util.TreeSet;

public class ComparableExample {

	public static void main(String[] args) {

		TreeSet<Person> treeSet = new TreeSet<>();
		
		treeSet.add(new Person("빵빵아", 22));
		treeSet.add(new Person("옥지얌", 24));
		treeSet.add(new Person("홍길동", 45));
		treeSet.add(new Person("김자바", 25));
		treeSet.add(new Person("유환주", 33));
		treeSet.add(new Person("장스벅", 52));

		
		for(Person person : treeSet) {
			System.out.println(person.name+":"+person.age);
		}
	}

}
 