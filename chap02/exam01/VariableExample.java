package chap02.exam01;

public class VariableExample {

	public static void main(String[] args) {
		int hour = 5;
		int minute = 10;
		System.out.println("hour = " + hour + "시간" + "	minute =" +  minute + "분" );
		int total = (hour*60) + minute;
		System.out.println("총합=" + total + "분");
		System.out.println("+기호는 연결 기호");
	}

}
