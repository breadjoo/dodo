package cahp05.sec04;

public class NullPointerExceptionExample {

	public static void main(String[] args) {
		int[] intArray = null; 
		intArray[0] = 10; // NullPointerException
		intArray[1] = 5;
		intArray[2] = 7;
		intArray[3] = 3;
		
		
		String str = null;
		System.out.println(str.length()); // NullPointerException
		


	}

}
