package S0519.exam01;

import java.util.TreeSet;

public class ComparableExample {

	public static void main(String[] args) {
		TreeSet<Person> treeSet = new TreeSet<>();
		
		treeSet.add(new Person("빵빵아", 15));
		treeSet.add(new Person("옥지얌", 34));
		treeSet.add(new Person("이디야", 18));
		treeSet.add(new Person("홍길동", 25));
		treeSet.add(new Person("매머드", 23));
		treeSet.add(new Person("유환주", 36));
		

		
		for(Person person : treeSet) {
			System.out.println(person.getName()+":"+person.getAge());
			
		}
	}

}
 
