package chap15.sec03.exam02;

public class Member {
	public String name;
	public int age;
	
	public Member(String name, int age) {
		this.name =name;
		this.age = age;
	}
	//hashCode 재정의
	public int hashCode() {
		return name.hashCode() + age;
	} // name과 age값이 같으면 동일한 hashCode가 리턴됨
	
	//equals 재정의
	public boolean equals(Object obj) {
		if(obj instanceof Member member) {
			return member.name.equals(name) && (member.age==age) ;
		} else {
			return false;
		}
	}

}
