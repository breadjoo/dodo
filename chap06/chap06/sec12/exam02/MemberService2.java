package chap06.sec12.exam02;

public class MemberService2 {

	boolean login(String id,String password) {
		if(id.equals("hong") && password.equals("12345")) {
			return true;
		} else {
			return false;
		}
	}void logOut(String id) {
		System.out.println(id + "님이 로그아웃되었습니다.");
	}
	
}
