package chap09.sec04.exam01;

public class A {
	//로컬 클래스는 생성자나 메소드 내부에서 
	//생성자
	A() {
		class B{}
		//A () 생성자가 실행될 동안에만 로컬 클래스 B 객체를 생성할 수 있음.
		B b = new B();
	}
	// 메소드 내부에서 로컬 클래스 선언
	void method() {
		class B{
			int filed = 1;
			void run () {
				System.out.println(filed);
			}
		} // 로컬클래스 선언
		// method()가 실행될 동안에만 로컬 클래스 B 객체를 생성할 수 있음.
		B b = new B(); // 로컬 객체 생성
	}
}
