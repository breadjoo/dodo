package chap08.sec05;

public class Television implements RemoteControl {
	//필드 선언
	private int volume;
	
	public void turnOn() {
		System.out.println("Turn on the Tv");
	}
	public void turnOff() {
		System.out.println("Turn off the Tv");
	}
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume=RemoteControl.MAX_VOLUME;
		} else if (volume<RemoteControl.MIN_VOLUME) {
			this.volume=RemoteControl.MIN_VOLUME;
		} else {
			this.volume=volume;
		}
			System.out.println("현재 Tv 볼륨 : " + this.volume);
	}

}
