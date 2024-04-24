package chap12.sec03.exam04;

/* record 선언  // DTO : Data Transfer Objetc
 * 데이터 전달을 위한 DTO 
 */

public class RecordExmaple {

	public static void main(String[] args) {
		Member m = new Member("winter","눈송이",25);
		System.out.println(m.id());
		System.out.println(m.name());
		System.out.println(m.age());
		System.out.println(m.toString());
		System.out.println("-----------------");
		
		Member m1 = new Member("winter","눈송이",35);
		Member m2 = new Member("winter","눈송이",35);
		
		
		System.out.println("hashCode1 : "+m1.hashCode() );
		System.out.println("hashCode2 : "+m2.hashCode());
		System.out.println("m1.equals(m2) : "+m1.equals(m2));
	}

}
