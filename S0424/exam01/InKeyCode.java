package S0424.exam01;

public class InKeyCode {

	public static void main (String [] args)throws Exception {

		int speed = 0;
		int keyCode = 0;
		
		while (true) {
			if(keyCode != 10 && keyCode !=13) {
				if (keyCode == 49) {
					speed += 2;
				}else if (keyCode == 50) {
					speed -= 2;
				}else if (keyCode == 51) {
					break;
				}
			
			System.out.println("----------------------");
			System.out.println("1. 증감 2. 감속 3. 종료");
			System.out.println("----------------------");
			System.out.println("현재 speed : " + speed);
			System.out.print("선택 : ");
		}
		keyCode = System.in.read();
	}
		System.out.println("프로그램 종료");
	}
}
