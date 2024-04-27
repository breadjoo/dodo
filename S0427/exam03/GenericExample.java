package S0427.exam03;

public class GenericExample {

	public static void main (String [] args ) {
		
		Box box1 = new Box();
		Box box2 = new Box();
		Box box3 = new Box();
		
		
		box1.content = 10;
		
		box2.content = 20;
		
		box3.content = "hey man";
		
	
		boolean result1 = box1.compare(box2);
		System.out.println(result1);
		
	}
}
