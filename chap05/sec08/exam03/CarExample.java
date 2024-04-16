package chap06.sec08.exam03;

public class CarExample {

	public static void main(String[] args) {
		
		Car myCar = new Car();
		
		myCar.setGas(8);
		myCar.isLeftGas(); {
			System.out.println("자동차가 출발합니다.");
		myCar.run();
		}	System.out.println("더 달리시려면 Gas를 충전하세요.");
		
		
		
		
		
		/*
		//Car 객체 생성
		Car myCar = new Car(); 			
		
		
		//리턴값이 없는 (void) setGas()메소드 호출
		myCar.setGas(10); 
		
		//isLeftGas() 메소드를 호출해서 받은 리턴값이 true일 경우 if 블록 실행
		if(myCar.isLeftGas()) {
			System.out.println("자동차가 출발합니다.");
			//리턴값이 없는 (void) run()메소드 호출
			myCar.run();
			
		}
			System.out.println("gas를 주입하세요");*/
	}

}
