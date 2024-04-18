package chap07.sec03.exam02;

public class SmartPhone extends Phone {
	public SmartPhone(String model, String color) {
		//자식 생성자 선언
		super(model,color); // 반드시 작성해야 함
		System.out.println("SmartPhone(String model,String color");
	}
	

}
