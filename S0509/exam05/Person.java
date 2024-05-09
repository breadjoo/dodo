package S0509.exam05;

public class Person {
	public Member getMember1(Creatable1 creatable1) {
		String id = "Summer";
		Member member = creatable1.create(id);
		return member;
	}
	
	public Member getMember2(Creatable2 creatable2) {
		String id = "Summer";
		String name = "한여름";
		Member member = creatable2.create(id, name);
		return member;
	}
	

}
