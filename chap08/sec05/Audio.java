package chap08.sec05;

public class Audio implements RemoteControl {
	//필드 선언
	
	private int volume;
	
	public void turnOn() {
		System.out.println("Turn on the audio");
	}
	public void turnOff() {
		System.out.println("Turn off the audio");
	}
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume=RemoteControl.MAX_VOLUME;
		} else if (volume<RemoteControl.MIN_VOLUME) {
			this.volume=RemoteControl.MIN_VOLUME;
		} else {
			this.volume=volume;
		} System.out.println("현재 볼륨: " +this.volume);
	}
	private int memoryVolume;
	//디폴트 메소드 재정의
	public void setMute(boolean mute) {
		if(mute) {
			this.memoryVolume=this.volume; //현재 볼륨 변수에 저장해두기
			System.out.println("Mute on");
			setVolume(RemoteControl.MIN_VOLUME);
		}else {
			System.out.println("Mute off");
			setVolume(this.memoryVolume);
		}
	}
}
