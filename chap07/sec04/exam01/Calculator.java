package chap07.sec04.exam01;

public class Calculator {
	//메소드 선언
	public double areaCircle(double r) { 
		//메소드 오버 라이딩
		// 상속된 메소드를 자식 클래스에서 재정의하는것
		// 부모 메소드는 숨겨지고, 자식 메소드가 우선적으로 실행됨
		// 부모 메소드의 선언부(리턴타입, 메소드이름, 매개변수)
		System.out.println("Computer 객체의 areaCircle()실행");
		return Math.PI*r*r;
	}
}
