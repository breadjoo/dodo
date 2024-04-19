package chap08.sec09;

public interface InterfaceC extends InterfaceA, InterfaceB {
	//인터페이스는 다른 인터페이스를 다중 상속 가능
	/*자식 인터페이스의 구현 클래스는 자식 인터페이스의 추상 메소드 뿐만 아니라
	 * 부모 인터페이스의 모둔 추상 메소드를 재정의 해야 함
	 */
	
	void methodC();
}
