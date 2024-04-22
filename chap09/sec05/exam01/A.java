package chap09.sec05.exam01;

public class A {
	//A 클래스의 인스턴스 필드와 메소드 선언
	int a = 1;
	void method1() {
		
	}
	// A 클래스의 정적 필드와 메소드를 선언
	static int b = 5;
	static void method2() {
		
	}
	//인스턴스 멤버 클래스 선언
	class B {
		void method3() {
			// A클래스의 인스턴스&정적 필드,메소드 사용 가능
			a = 10;
			method1();
			b = 20;
			method2();
			
		}
	}
	//정적 멤버,필드,메소드 
	static class C {
		void method4() {
			//A클래스의 인스턴스 필드,메소드 사용불가
			method1();
			a = 1;
			//A클래스의 정적 필드,메소드 사용가능
			method2();
			b = 1;
		}
	}
	
}
