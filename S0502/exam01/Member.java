package S0502.exam01;

public class Member {

	public String name;
	public int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public int HashCode() {
		return name.hashCode() + age; // String으론 비교가 힘드니까 해쉬코드 + 나이 라는 숫자값으로 받아서 비교하기!
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof Member member) {
			return member.name.equals(name) && (member.age==age) ; 
		} else {
			return false;
		}
	}
}
