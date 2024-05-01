package S0501.exam01;

import java.util.Scanner;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("speed를 입력하세요 : ");
			int speed = scanner.nextInt();
			if(speed!=0) {
				myCar.setSpeed(speed);
				System.out.println("현재속도 : " +myCar.getSpeed());
				if(speed>200) {
					myCar.setStop(true);
				}
			} else {
				return;
			}
		}
			
		
		
	}

}
