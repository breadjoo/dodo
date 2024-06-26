package chap07.sec04.exam02;

public class SupersonicAirplane extends Airplane {
	//상수 선언
	public static final int NORMAL =1 ;
	public static final int SUPERSONIC = 2;
	
	//상태 필드 선언
	public int flymode = NORMAL;
	@Override
	public void fly() {
		if(flymode == 1) {
			System.out.println("초음속비행합니다.");
		} else { // Airplane 객체의 fly()메소드 호출
			super.fly();
		}
	}
	
}
