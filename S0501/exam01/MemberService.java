package S0501.exam01;

public class MemberService {
	
	public boolean login(String id,String password) {
		if(id.equals("yoo")&& password.equals("1234")) {
			System.out.println("로그인 되었습니다.");
			return true;
		} else {
			System.out.println("아이디 또는 비밀번호가 일치하지 않습니다.");
			return false;
		}
	}
	public void logOut(String id) {
		System.out.println(id+"님이 로그아웃 했습니다.");
	}

}
