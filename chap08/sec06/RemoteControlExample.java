package chap08.sec06;

public class RemoteControlExample {

	public static void main(String[] args) {

		RemoteControl.changeBattery();

		RemoteControl rcTv = new Television();
		RemoteControl rcAudio = new Audio();
		
		rcTv.turnOn();
		rcTv.setVolume(4);
		rcTv.turnOff();
		
		rcAudio.turnOn();
		rcAudio.setVolume(7);
		rcAudio.turnOff();
		
		rcAudio.setMute(true);
		rcAudio.setMute(false);
		
		System.out.println();
		
		RemoteControl.changeBattery();
		/* 인터페이스의 정적 메소드는 별다른 키워드 없이 불러 올 수 있다.
		static void changeBattery() {
		System.out.println("Change the battery");*/
		
		

	}

}
