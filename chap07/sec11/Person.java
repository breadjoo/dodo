package chap07.sec11;

public sealed class Person permits Employee,Manager {
	//sealed 키워드를 사용하면 permits 키워드 뒤에 상속 가능한 클래스를 지정할 수 있다.
	
	//필드
	public String name;
	public String who;
	//메소드
	public void who() {
		System.out.print(who+"(이)가"); //방법을 모르겠음 
	}
	public void work() {
		System.out.println("하는 일이 결정되지 않음");
	}
	
		
	
	
	
}
