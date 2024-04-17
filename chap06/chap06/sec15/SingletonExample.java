package chap06.sec15;

public class SingletonExample {

	public static void main(String[] args) {
		//Singleton obj1 = new Singleton();		
		//Singleton obj2 = new singleton();
		
		Singleton obj3 = Singleton.getInstnce();
		Singleton obj4 = Singleton.getInstnce();
		
		if (obj3 == obj4) {
			System.out.println("같은 객체입니다.");
		} else {
			System.out.println("다른 객체입니다.");
		}
		

	}

}
