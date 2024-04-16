package chap06.sec04.exam02;

public class CarExample {

	public static void main(String[] args) {
		//Car 객체 생성
		Car myCar = new Car();
		//Car 객체의 필드값 읽기
		System.out.println("제작회사 : " + myCar.comapany);
		System.out.println("차종 : " + myCar.model);
		System.out.println("색상 : " + myCar.color);
		System.out.println("최고속도 : " + myCar.maxSpeed);
		System.out.println("현재속도 : " + myCar.speed);

		//Car 객체의 필드값 변경
		myCar.speed = 60;
		myCar.color = "흰색";
		System.out.println("수정된 현재 속도 : " + myCar.speed);
		System.out.println("변경된 현재 색상 : " + myCar.color);
	}

}
