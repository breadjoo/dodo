package S0424.exam01;

public class ExceptionHandlingExample {
	public static void main (String [] args) {
		
		
		String[] array = {"11","22","null","3a","1,4"};
		
		for(int i=0;i<=array.length;i++) {
			try {
			int value = Integer.parseInt(array[i]);
			System.out.println(value);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 튀어 나가면 오류 : " +e.getMessage());
		} catch (NullPointerException | NumberFormatException e) {
			System.out.println("Null이있거나 숫자 변환이 안될때 오류 : " + e.getMessage());
		}
		
	}}}


