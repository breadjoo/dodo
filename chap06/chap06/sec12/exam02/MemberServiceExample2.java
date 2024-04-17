package chap06.sec12.exam02;

public class MemberServiceExample2 {

	public static void main(String[] args) {

		MemberService2 ms = new MemberService2();
		
		boolean result = ms.login("hong", "12345");
		
		if(result) {
			System.out.println("로그인 되었습니다,");
			ms.logOut("hong");
		} else {
			System.out.println("id 또는 password가 일치하지 않습니다.");
		} 
	}

}
