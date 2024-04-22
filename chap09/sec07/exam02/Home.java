package chap09.sec07.exam02;

public class Home {
	//필드에 익명 구현 객체(인터페이스를 구현한 객체) 대입
	private RemoteControl rc = new RemoteControl() {
		public void turnOn() {
			System.out.println("Turn on the tv");
		}
		public void turnOff() {
			System.out.println("Turn off the tv");
		}
	};
	//필드 이용한 메소드
	public void use1() {
		rc.turnOn();
		rc.turnOff();
	}
	//로컬 변수 이용한 메소드
	public void use2() {
		RemoteControl rc = new RemoteControl() {
			public void turnOn() {
				System.out.println("Turn on the audio");
			}
			public void turnOff() {
				System.out.println("Turn of the audio");
			}
		};
		rc.turnOn();
		rc.turnOff();
	}
	//매개변수 이용한 메소드
	public void use3(RemoteControl rc) {
		rc.turnOn();
		rc.turnOff();
	}
	
	
	
	
}
