package chap16.sec03;

public class Person {
	public void action1(Workable workable) {
		//Workable을 매개변수로 갖는 action1 메소드 작성
		workable.work("홍길동", "프로그래밍");
	}
	
	public void action2(Speakable speakable) {
		//Speakable을 매개변수로 갖는 action2 메소드 작성
		speakable.speak("안녕하세요");
	}

}
