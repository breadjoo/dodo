package chap07.sec02;

public class SmartPhoneExample {

	public static void main(String[] args) {
		//SmartPhone 객체 생성
		SmartPhone myPhone = new SmartPhone("아이폰","그레이",50);
		
		//phone 으로 부터 상속받은 객체 읽기
		System.out.println("myPhone의 model : " + myPhone.model);
		System.out.println("myPhone의 color : " + myPhone.color);
		
		//phone의 필드 읽기
		System.out.println("myPhone의 wifi 상태 : "+ myPhone.wifi);
		
		//phone으로 부터 상속받은 메소드 호출
		myPhone.bell();
		myPhone.sendVoice("여보세요");
		myPhone.reveiveVoice("부재중입니다.");
		myPhone.hangUp();
		myPhone.powerOn();
		myPhone.powerOff();
		myPhone.usingPhone();
		myPhone.usingPhone();
		myPhone.usingPhone();
		myPhone.usingPhone();
		myPhone.usingPhone();
		myPhone.usingPhone();
		
		
		//SmartPhone 메소드 호출
		myPhone.setwifi(false);
		myPhone.setwifi(true);
		myPhone.internet();

	}

}
