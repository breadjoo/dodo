package cahp05.sec04;

public class GarbageObjectExample {

	public static void main(String[] args) {
		String hobby = "여행";
		System.out.println(hobby);
		hobby = null;
		System.out.println(hobby);
		
		String kind1 = "자동차";
		String kind2 = kind1;
		System.out.println(kind1);
		System.out.println(kind2);
		kind1 = null;
		System.out.println(kind1);
		System.out.println(kind2);
		
		


	}

}
