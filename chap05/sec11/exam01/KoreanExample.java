package chap06.sec11.exam01;

public class KoreanExample {

	public static void main(String[] args) {
		
		Korean k1 = new Korean("940402-1234567","감자바");
		
		System.out.println(k1.nation);
		System.out.println(k1.ssn);
		System.out.println(k1.name);
		
		//k1.nation = "usa"; :x // **final** 필드는 값을 변경할 수 없음
		k1.name = "이자바";
		System.out.println(k1.name);
		
		


	}

}
