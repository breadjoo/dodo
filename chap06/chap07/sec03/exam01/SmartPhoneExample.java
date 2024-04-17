package chap07.sec03.exam01;

public class SmartPhoneExample {

	public static void main(String[] args) {

		SmartPhone myPhone = new SmartPhone("아이폰","회색") ;
		
		//Phone으로부터 상속받은 필드 읽기
		System.out.println("모델 : " +myPhone.model);
		System.out.println("색상 : " +myPhone.color);
		

	}

}
