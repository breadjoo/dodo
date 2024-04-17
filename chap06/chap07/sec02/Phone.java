package chap07.sec02;

public class Phone {
	//필드 선언
	
	public String model;
	public String color;
	public int leftBattery;
	
	// 메소드 선언
	
	public void bell() {
		System.out.println("벨이 울립니다.");
	}
	
	public void sendVoice(String message) {
		System.out.println("환주: "+message);
	}
	
	public void reveiveVoice(String message) {
		System.out.println("상대방: "+message);
	}
	
	public void hangUp() {
		System.out.println("전화를 끊습니다.");
	}
	
	public void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	public void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	public boolean usingPhone() {
		 if(leftBattery <= 0) {
			System.out.println("배터리가 부족하여 전원이 종료됩니다.");
			return true;
		} else { System.out.println("배터리 잔량 : "+ leftBattery);
			 leftBattery -= 10;
		return false;
	}}
		
	
	
	
	}
