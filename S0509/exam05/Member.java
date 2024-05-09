package S0509.exam05;

public class Member {
	public String id;
	public String name;
	
	public Member (String id) {
		this.id =id;
		System.out.println("Member(String id)");
	}
	
	public Member (String id,String name) {
		this.id = id;
		this.name = name;
		System.out.println("Member(String id,String name)");
	}
	
	public String toString() {
		String info = "ID : " + id + " || name : " +name;
		return info;
	}

}
