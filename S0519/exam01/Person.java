package S0519.exam01;

public class Person implements Comparable<Person> {
	
	private String name;
	private int age;
	
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
		
	public int compareTo(Person o) {
		if(age<o.age) return -1;
		else if (age==o.age) return 0;
		else return 1;
	}

}
