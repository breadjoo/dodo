package chap15.sec03.exam02;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		// HashSet 켈렉션 생성
		Set<Member> set = new HashSet<>() ;
		
		set.add(new Member("유환주",30));
		set.add(new Member("유환주",30)); // set.add에서 동등객체는 저장안함
		set.add(new Member("유환쥬",30)); 
		
		System.out.println("총 객체 수 : " +set.size());

	}

}
