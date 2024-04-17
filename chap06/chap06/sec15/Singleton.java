package chap06.sec15;

public class Singleton {
	//private 접근 권한을 갖는 정적 필드 선언과 초기화
	private static Singleton singleton = new Singleton();
	
	//private 접근 권한을 갖는 생성자 선언
	private Singleton() {
	//생성자를 private 접근 제한했기 때문에 외부에서 new 연산자로 생성자를 호출할수 없고, 외부에서 마음대로 객체를 생성하지 못하게 함. 
	}
	
	//public 접근 권한을 갖는 정적 메소드 선언
	public static Singleton getInstnce() {
		return singleton;
	}
}
