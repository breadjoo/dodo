package chap07.sec10.exam01;

public abstract class Phone {
	//필드 선언
	public String owner;
	
	//생성자 선언
	Phone(String owner){
		this.owner=owner;
	}
	
	//메소드 선언
	void turnOn () {
		System.out.println("전원 ON");
	}
	void turnOff () {
		System.out.println("전원 OFF");
	}
	
}
