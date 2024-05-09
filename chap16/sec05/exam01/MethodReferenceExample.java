package chap16.sec05.exam01;

public class MethodReferenceExample {

	public static void main(String[] args) {
		/*1. 정적 메소드를 참조 시 클래스 이름 뒤에 :: 기호를 붙이고
		 	정적 메소드 이름을 기술(클래스 :: 정적메소드)
		  2.인스턴스 메소드일 경우에는 객체를 생성한 다음
		  	참조 변수 뒤에 :: 기호를 붙이고 인스턴스 메소드 이름을 기술
		  	(참조변수 :: 인스턴스메소드)*/
		Person person = new Person();
		
		//정적 메소드 참조
		person.action(Computer::staticMethod);
		
		//인스턴스 메소드
		Computer com = new Computer();
		person.action(com::instanceMethod);
		
	}

}
