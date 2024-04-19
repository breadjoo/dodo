package chap08.sec04;

public class Television implements RemoteControl {
	//필드
	private int volume;
	
	//turnOn() 추상 메소드 오버라이딩
	
	public void turnOn() {
		System.out.println("Turn on the TV");
	}
	
	public void turnOff() {
		System.out.println("Turn off the TV");
	}
	
	public void setVolume(int volume) {
		// 최대 볼륨 최소볼륨 설정 후에 볼륨값 입력될수 있게.
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME ;
		} else if (volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
			System.out.println("현재 TV 볼륨 : " + this.volume);
	}
	
}
