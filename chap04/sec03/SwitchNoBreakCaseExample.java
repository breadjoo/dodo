package chap04.sec03;

public class SwitchNoBreakCaseExample {

	public static void main(String[] args) {
		int time = (int)(Math.random()*4)+8;
		
			System.out.println("[현재 시각 : " + time+ "시]");
		switch(time) {
		case 8 : 
			System.out.println("출근중입니다."); break;
		case 9 : 
			System.out.println("회의중입니다."); break;
		case 10 :
			System.out.println("업무중입니다."); break;
		default : 
			System.out.println("외근중입니다.");
			
		}
			System.out.println("Switch 다음 문장");

	}

}
