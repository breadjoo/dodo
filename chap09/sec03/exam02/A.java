package chap09.sec03.exam02;

public class A {
	//정적 멤버 클래스 B 선언
	static class B {
	// 정적 멤버 클래스 B 내부에는 필드, 생성자, 메소드 선언이 올 수 있음
		//인스턴스 필드
		int field1 = 1;
		//정적 필드 (Java 17부터 사용 가능)
		static int field2 = 1;
		//생성자 선언
		B(){
			System.out.println("정적 멤버 클래스 B- 생성자 실행");
		}
		
		//인스턴스 메소드
		void method1() {
			System.out.println("B-method1() 실행");
		}
		
		//정적 메소드
		static void method2() {
			System.out.println("B-method2() 실행");
		}
		
		
	}
	
}
