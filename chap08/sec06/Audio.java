package chap08.sec06;

public class Audio implements RemoteControl {

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
		}
		else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume=RemoteControl.MIN_VOLUME;
		} else {
			this.volume=volume;
		}System.out.println("현재 볼륨 : " + this.volume);
	}
	private int memoryVolume;
	public void setMute(boolean mute) {
		if(mute) { 
			this.memoryVolume=this.volume;
			System.out.println("Mute On");
			setVolume(RemoteControl.MIN_VOLUME);
		} else {
			System.out.println("Mute Off");
			setVolume(this.memoryVolume);
		}
	}
	
	
}
