package S0501.exam01;

public class MemberServiceExample {

	public static void main(String[] args) {
		MemberService ms = new MemberService();
		
		boolean result = ms.login("yoo", "1234");
		
		if(result) {
			System.out.println("할일 하는중~ ");
			ms.logOut("yoo");
		} else {
			
		}


	}

}
