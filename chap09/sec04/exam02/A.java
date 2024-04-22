package chap09.sec04.exam02;

public class A {
	
	//메소드
	void useB() {
		// 로컬 클래스 선언
		// 로컬 클래스 B 내부에는 필드, 생성자, 메소드 선언이 올 수 있음
		class B {
			//인스턴스 필드
			int field1 = 1;
			//정적 필드 선언
			static int field2 = 10;

			//생성자 선언
			B() {
				System.out.println("로컬 클래스 생성자 B 실행중");
			}
			
			//인스턴스 메소드
			void method1 () {
				System.out.println("'인스턴스메소드'로컬 클래스 B-method1() 실행중");
			}
			//정적 메소드
			static void method2 () {
				System.out.println("'정적메소드'로컬 클래스 B-method2() 실행중");
				System.out.println("-------------------");
			
			}
			
		}
		//로컬 클래스 객체 생성
		B b = new B();
		//로컬 객체의 인스턴스 필드와 메소드 이용
		System.out.println(b.field1);
		b.method1();
		// 정적 필드,메소드 사용은 같은 클래스 내에서는 바로 호출 //
		System.out.println(b.field1);
		B.method2();
	}
}
