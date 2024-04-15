package cahp05.sec05;

public class SubStringExample {
	
	
	public static void main(String[] args) {
		String ssn = "940402-1234567";
		
		String firstNum = ssn.substring(0,6);
			System.out.println(firstNum);
		
		String secNum = ssn.substring(7);
			System.out.println(secNum);
		
		String thirdNum = ssn.substring(0,3);
			System.out.println(thirdNum);
	}
	

}
