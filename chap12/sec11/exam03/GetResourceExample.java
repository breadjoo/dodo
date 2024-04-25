package chap12.sec11.exam03;

public class GetResourceExample {

	public static void main(String[] args) {
		Class class2 = Car.class;
		
		String photo1Path = class2.getResource("photo1.jpg").getPath();
		String photo2Path = class2.getResource("images/photo2.jpg").getPath();
		
		System.out.println(photo1Path);
		System.out.println(photo2Path);

	}

}
