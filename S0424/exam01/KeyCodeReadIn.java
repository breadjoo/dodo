package S0424.exam01;

public class KeyCodeReadIn {
	public static void main (String [] args) throws Exception {
		int speed = 0;
		int keyCode = 0;
		
		while(true) {
			if(keyCode!=10 &&keyCode!=13) {
				if(keyCode==49) {
					speed += 10;
				}else if (keyCode==50) {
					speed -= 10;
				}else if (keyCode==51) {
					break;
				}
				System.out.println("----------------");
				System.out.println("1.증 2.감 3.종");
				System.out.println("----------------");
				System.out.println("speed : " + speed);
				System.out.print("선택 : ");
			}
			keyCode = System.in.read();
		}
		System.out.println("프로그램종료");
	}


}
