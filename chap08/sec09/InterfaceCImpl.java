package chap08.sec09;

public class InterfaceCImpl implements InterfaceC {

	// 부모 인터페이스의 추상 메소드도 모두 재정의 해줘야 함
	
	// 추상 메소드 methodA() 재정의
	public void methodA() {
		System.out.println("InterfaceCImpl-methodA() 실행 중");
	}
	
	// 추상 메소드 methodB() 재정의
	public void methodB() {
		System.out.println("InterfaceCImpl-methodB() 실행 중");
	}
	
	// 추상 메소드 methodC() 재정의
	public void methodC() {
		System.out.println("InterfaceCImpl-methodC() 실행 중");
	}
}
