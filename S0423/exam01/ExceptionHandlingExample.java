package S0423.exam01;

public class ExceptionHandlingExample {

	public static void main(String [] args) {
		String[] array = {"20",null,"333","3333","B"};
		
		for(int i=0;i<array.length;i++) {
		try { 
			int value = Integer.parseInt(array[i]);
			System.out.println(value);
		} catch (ArrayIndexOutOfBoundsException c) {
			System.out.println("인덱스 넘어갔을 때 " +c.getMessage());
		} catch (NullPointerException | NumberFormatException c) {
			System.out.println("null이있거나, 숫자변환이 안되는 String " + c.getMessage());
		}
		}
}
}

