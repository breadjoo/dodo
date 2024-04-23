package chap12.sec03.exam02;

public class HashCodeExample {

	/* 객체 해시코드 : 객체를 식별하는 정수
	 * Object클래스의 hashCode() 메소드는 객체의 메모리 번지를 이용해서
	 * 해시코드를 생성하기 때문에 객체마다 다른 정수값을 리턴함 */
	public static void main(String[] args) {

		Student s1 = new Student(1, "홍길동");
		Student s2 = new Student(1, "홍길동");
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		if(s1.hashCode()==s2.hashCode()) { 
			if(s1.equals(s2)) {
				System.out.println("동등객체입니다.");
			} else {
				System.out.println("데이터가 달라서 동등객체가 아님.");
			} 
		} else {
			System.out.println("해시코드가 달라서 동등객체가 아님.");
		}
	}

}
 