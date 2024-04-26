package chap13.sec03.exam01;

public class GenericExample {
	//제네릭 메소드인 boxing 선언
	public static <T> Box<T> boxing(T t){//타입 파라미터 T정의함
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
	}

	public static void main(String[] args) {
		//
		Box<Integer> box1 = boxing(100);
		// T를 Integer로 대체함
		int value = box1.get();
		System.out.println(value);
		
		Box<String> box2 = boxing("1oo");
		String str = box2.get();
		System.out.println(str);
		
	}

}
