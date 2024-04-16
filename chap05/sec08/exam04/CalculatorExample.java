package chap06.sec08.exam04;

public class CalculatorExample {

	public static void main(String[] args) {
		//객체 생성
		Calculator myCalcu = new Calculator();
		//정사각형 넓이 구하기
		int a = 10;
		int b = 5;
		double result1 = myCalcu.areaRectangle(a);
			System.out.println("가로의 길이가 a인 정사각형의 넓이 : " + result1);
		double result2 = myCalcu.areaRectangle(a, b) ;
			System.out.println("가로의 길이"+a+", 세로의 길이"+b+"인 직사각형의 널이:" +result2);


	}

}
