package chap09.sec02.exam02;

import chap09.sec02.exam02.A.B;

public class AExample {
	public static void main(String []args) {
		// A 객체 생성
		A a = new A();
		
		//A 인스턴스 메소드 호출
		a.usbB();
		
		System.out.println("");
		B.method2();
		
	}
	
}
