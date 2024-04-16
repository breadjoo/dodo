package chap06.sec08.exam01;

public class CalculatorExample {

	public static void main(String[] args) {
		
		Calculator myCal = new Calculator();
		myCal.powerOn();
		
		int result1 = myCal.plus(30,40);
			System.out.println("plus : "+ result1);
		double result2 = myCal.divide(50, 60);
			System.out.println("divide : " + result2 );
		int result3 = myCal.minus(30, 50);
			System.out.println("minus : " + result3);
		
			
		myCal.powerOff();
		
		
		
}}
