package S0423.exam01;

public class MyResource implements AutoCloseable {
	private String name;
	
	public MyResource(String name) {
		this.name=name;
		System.out.println("실행 1");
	}
	public String read1() {
		System.out.println("실행 2");
		return "456";
	}
	public String read2() {
		System.out.println("실행 3");
		return "a";
	}
	
	public void close() throws Exception {
		System.out.println("실행 4");
	}

}
