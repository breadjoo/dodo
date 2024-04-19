package chap08.sec10;

public class PromotionExample {

	public static void main(String[] args) {
		//구현 객체 선언
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		//인터페이스 변수
		A a;
		
		//인터페이스 변수에 구현 객체 대입
		a = b; // A <== B // 인터페이스 A로 자동 타입 변환
		a = c;
		a = d; 
		a = e;
		// B,C 클래스가 A인터페이스를 직접적으로 구현하고 있기 때문에 자동 타입변환.
		// D,E 클래스는 (A인터페이스를 구현중인) B,C를 상속받았기 때문에 자동 타입 변환

	}

}
