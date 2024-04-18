package chap07.sec10.exam01;

public class PhoneExample {

	public static void main(String[] args) {
		//필드
		//Phone myPhone = new Phone(); <new>를 쓸 수 없는 이유는 abstract 추상클래스라서.
		SmartPhone smartPhone = new SmartPhone("내핸드폰");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
		
		
		
		//메소드


	}

}
