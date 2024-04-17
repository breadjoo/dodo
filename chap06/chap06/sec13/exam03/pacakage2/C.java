package chap06.sec13.exam03.pacakage2;

import chap06.sec13.exam03.pacakage1.A;

public class C {
	public C() {
		//객체 생성
		A a = new A();
		
		//필드값 변경
		a.field1 = 10;
		//a.field2 = 2 ; default,private는 다른 pacakage에서 접근 불가능 public만 가능 
		//a.field3 = 2 ;
		
		a.method1(); // o
		//a.method2(); default,private는 다른 pacakage에서 접근 불가능 public만 가능
		//a.method3();
	}

}
