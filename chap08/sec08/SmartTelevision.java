package chap08.sec08;

public class SmartTelevision implements RemoteControl, Searchable{
	//turnOn() 추상 메소드 오버라이딩
	public void turnOn() {
		System.out.println("Turn on the tv");
	}
	
	//turnOff() 추상 메소드 오버라이딩
	public void turnOff() {
		System.out.println("Turn off the tv");
	
	}
	
	//search(String url) 추상 메소드 오버라이딩
	public void search(String url) {
		System.out.println(url+" 을 검색합니다");
	}
	
}
