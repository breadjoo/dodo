package chap12.sec06;

public class ValueCompareExample {

	public static void main(String[] args) {
		// -128~127 초과값일 경우 
		Integer obj1 = 300;
		Integer obj2 = 300;
		System.out.println("==: " + (obj1 == obj2));
		System.out.println("equals(): " +obj1.equals(obj2));
		System.out.println();

		
		/* -128~127 범위값일 경우
		 * 포장객체의 효율적 사용을 위해 byte,short,int 타입은 == 사용가능 
		 * 하지만 그냥 정확한 비교를 해주는 equals를 사용하는 습관을 들이도록 하자. */		
		Integer obj3 = 30;
		Integer obj4 = 30;
		System.out.println("==: " + (obj3 == obj4));
		System.out.println("equals(): " +obj3.equals(obj4));
		
	}

}
