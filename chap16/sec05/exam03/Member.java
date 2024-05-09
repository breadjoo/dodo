package chap16.sec05.exam03;

public class Member {
	public String id;
	public String name;
	
	public Member(String id) {
		//Creatable1함수형 인터페이스의 create()메소드 이용
		this.id = id;
		System.out.println("Member(String id)");
	}
	
	public Member(String id, String name) {
		//Creatable2함수형 인터페이스의 create()메소드 이용
		this.id =id;
		this.name = name;
		System.out.println("Member(String id, String name)");
	}
	
	public String toString() {
		String info = "{ id: " + id + ", name : " + name + "]";
		return info;
	}

}
