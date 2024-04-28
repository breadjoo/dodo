package S0428.exam01;

public class BoxExample01 {

	public static void main(String[] args) {
		
		Box<Integer> box1 = new Box<>();
		
		box1.content = 100;
		int value = box1.content;
		System.out.println(value);
		
		
		Box<String> box2 = new Box<>();
		box2.content = "100";
		String strValue = box2.content;
		Integer.parseInt(strValue);
		
		System.out.println(strValue);
		
		if (strValue.equals(value)) {
			System.out.println("같은값");
		} else {
			System.out.println("다른값");
		}
					
	}

}
