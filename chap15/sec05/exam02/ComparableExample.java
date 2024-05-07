package chap15.sec05.exam02;

import java.util.TreeSet;

public class ComparableExample {

	public static void main(String[] args) {
		// TreeSet 컬렉션 생성
		TreeSet<Person> treeSet = new TreeSet<>();
		
		treeSet.add(new Person("홍길동", 45));
		treeSet.add(new Person("김자바", 25));
		treeSet.add(new Person("유환주", 33));
		treeSet.add(new Person("장스벅", 52));
		treeSet.add(new Person("박지원", 31));
		
		for(Person person : treeSet) {
			System.out.println(person.name+":"+person.age);
		}

	}

}
