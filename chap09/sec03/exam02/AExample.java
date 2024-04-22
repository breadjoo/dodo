package chap09.sec03.exam02;

public class AExample {

	public static void main (String args [] ) {
		// B객체 생성
		
		System.out.println(A.B.field2);
		
		
		A.B b = new A.B();
		System.out.println(b.field1);
		b.method1();
	
		
		// B 클래스의 정적 필드 및 메소드 사용
		System.out.println(b.field2); // <-- 좋지않은 습관, 올바른방법은 아니라고 함. 정적 사용할때는 정직하게 들어가자 ~
		System.out.println(A.B.field2);
		b.method2(); // <-- 좋지않은 습관, 올바른방법은 아니라고 함. 정적 사용할때는 정직하게 들어가자 ~
		A.B.method2();
	}
}

