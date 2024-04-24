package chap12.sec04;

public class InExample {

	public static void main(String[] args) throws Exception {

		int speed = 0;
		int keyCode = 0;
		
		while(true) {
			//Enter 키를 입력하지 않았을 경우에만 실행 하는 명령어
			if(keyCode != 13 && keyCode != 10) { //유니코드 '13,10'->Enter
				if (keyCode == 49) { //유니코드 '49' -> 1
					speed++;
				} else if (keyCode == 50) { // 유니코드 '50' -> 2
					speed--;
				} else if (keyCode == 51) { // 유니코드 '50' -> 3
					break;
				}
				System.out.println("-----------------------------");
				System.out.println("| 1.증속 | 2. 감속  | 3. 중지 |");
				System.out.println("-----------------------------");
				System.out.println("현재속도 = " + speed );
				System.out.println("선택 : " );
				
			}
			keyCode = System.in.read();
		}
			System.out.println("프로그램 종료");
		

	}

}
