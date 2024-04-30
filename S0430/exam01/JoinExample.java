package S0430.exam01;

public class JoinExample {
	public static void main(String [] args) {
		Sum sum = new Sum();
		
		sum.start();
		try {
			sum.join();
		}catch(Exception e) {}
		System.out.println("1~100합 : " +sum.getSum());
		
		
	}

}
