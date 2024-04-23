package chap11.sec03.exam03;

public class ExceptionHandlingExample2 {

	public static void main(String []args) {
		String [] array = {"10","5",null,"a","2"};
		
		for(int i=0;i<=array.length;i++) {
			try {
				int value = Integer.parseInt(array[i]);
				System.out.println("array["+i+"]"+value);
			} catch	(ArrayIndexOutOfBoundsException e) {
				System.out.println("오류:"+e.getMessage());
			} catch (NullPointerException | NumberFormatException e) {
				System.out.println("오류오류:"+e.getMessage());
			}
		}
		
	}
}
