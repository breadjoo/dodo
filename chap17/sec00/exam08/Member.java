package chap17.sec00.exam08;

public class Member {
	private String name;
	private String job;
	
	public Member(String name, String job) {
		this.name = name;
		this.job = job;
	}
	public String getName() {
		return name;
	}
	public String getJob() {
		return job;
	}
	
	public String toString() {
		return "{name : " + name + " ,job : " + job + "}"; 
	}

}
