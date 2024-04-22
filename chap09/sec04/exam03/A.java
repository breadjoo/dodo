package chap09.sec04.exam03;

public class A {

	public void method1(int arg) {
		int var = 1; // 로컬 변수 선언
		//로컬 클래스 선언
		class B{
			//메소드 선언
			void method2() {
				//로컬 변수 읽기
				System.out.println(arg);
				System.out.println(var);
				//로컬 변수 수정안됨 ( 로켤 변수는 final 특성을 가짐 )
				//ex ) arg = 20; var = 30; 불가능
			}
		}
		
		//로컬 객체 생성
		B b = new B();
		b.method2(); // 로컬 객체 메소드 호출 
		//arg = 20; 밖에서도 안됨
		//var = 15;
	}
}
