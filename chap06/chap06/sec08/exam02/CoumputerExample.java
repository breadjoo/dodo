package chap06.sec08.exam02;

public class CoumputerExample {

	public static void main(String[] args) {
		// Computer 객체 생성
		Computer myCom = new Computer();



		//sum() 메소드 호출 시 1,2,3,4... 을 제공
		//합산 결과를 리턴 받아서 result1 변수에 대입.
		int result1 = myCom.sum(1,2,3,4,5,6,7);
			System.out.println("7!:"+result1);


		int result2 = myCom.sum(1,2,3,4,5);
			System.out.println(result2);

		int[] values = {1,2,3,4,5,6,7,8,9,10} ;
		int result3 = myCom.sum(values);
			System.out.println(result3);
			
		int result4 = myCom.sum(new int [] {1,2,3,4,5});
			System.out.println(result4); 
		
		
	}

}
