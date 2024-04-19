package chap08.sec08;

import chap08.sec06.RemoteControl;

public class MultiInterfaceImpExample {
	public static void main(String[] args) {
		
		RemoteControl rcSmartTv = new SmartTelevision();
		
		rcSmartTv.turnOn();
		rcSmartTv.turnOff();
		
		Searchable serachable = new SmartTelevision();
		
		serachable.search("http://www.naver.com");
	}
}
