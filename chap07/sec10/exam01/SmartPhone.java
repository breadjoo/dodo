package chap07.sec10.exam01;

public class SmartPhone extends Phone {
	//생성자 선언
	SmartPhone(String owner) {
		super(owner);
	}
	
	//메소드 선언
	void internetSearch() {
		System.out.println("인터넷을 검색합니다.");
	}
}
