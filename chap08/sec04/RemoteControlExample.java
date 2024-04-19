package chap08.sec04;

public class RemoteControlExample {

	public static void main(String[] args) {
		
		RemoteControl rcTv;
		rcTv = new Television();
		RemoteControl rcAudio;
		rcAudio = new Audio();
		
		rcTv.turnOn();
		rcTv.turnOff();
		rcTv.setVolume(5);
		rcTv.setVolume(15);
		rcTv.setVolume(-5);
		System.out.println("---------------------");
		
		rcAudio.turnOn();
		rcAudio.turnOff();
		rcAudio.setVolume(-4);
		rcAudio.setVolume(8);
		rcAudio.setVolume(15);
		
		
		

	}

}
