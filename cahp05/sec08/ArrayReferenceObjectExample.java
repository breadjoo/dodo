package cahp05.sec08;

public class ArrayReferenceObjectExample {

	public static void main(String[] args) {
		String[] strArray = new String [4];
		strArray[0] = "Java";
		strArray[1] = "Java";
		strArray[2] = new String("Java");
		strArray[3] = "Java";
		
		System.out.println(strArray[0] == strArray[1]);
		System.out.println(strArray[0] == strArray[2]);
		System.out.println(strArray[2] == strArray[3]);
		System.out.println("Java와 new : "+strArray[0].equals(strArray[2])); // equals : 문자열 비교할 때 (번지수 상관x)
		
		

	}

}
