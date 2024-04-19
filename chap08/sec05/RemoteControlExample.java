package chap08.sec05;

public class RemoteControlExample {

	public static void main(String[] args) {
		// 인터페이스 변수 선언
		RemoteControl rcTv;
		rcTv = new Television();
		
		rcTv.turnOn();
		rcTv.setVolume(12);
		rcTv.setMute(true);
		rcTv.setMute(false);
		rcTv.setVolume(4);
		rcTv.turnOff();
		
		RemoteControl rcAudio;
		rcAudio = new Audio();
		
		rcAudio.turnOn();
		rcAudio.setVolume(8);
		rcAudio.setMute(true);
		rcAudio.setMute(false);
		rcAudio.setVolume(2);
		rcAudio.setVolume(5);
		rcAudio.turnOff();
		
		
		

	}

}
