package chap15.sec03.exam03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		// iterator() : 반복자를 얻어 Set 컬렉션의 객체를 하나씩 가져옴
		// hasNext() : 가져올 객체가 있으면 true를 리턴하고, 없으면 false를 리턴
		// next() : 컬렉션에서 하나의 객체를 가져옴
		// remove():next()로 가져온 객체를 Set 컬렉션에서 제거함
	
		//HashSet 컬렉션 객체 생성
		Set<String> set = new HashSet<>();
		
		//객체 추가
		set.add("빵빵아~");
		set.add("옥지얌~");
		set.add("스타벅스");
		set.add("아이폰");
		
		//객체를 하나씩 가져와서 처리 
		Iterator<String> iterator = set.iterator(); 
		while(iterator.hasNext()) { // 가져올 객체가 있는지 확인함
			//객체를 하나 가져오기
			 String element = iterator.next(); // 객체를 가져옴
			 System.out.println(element);
			 if(element.equals("스타벅스")) {
				 iterator.remove();			 }
		}
		System.out.println();
		for(String element : set) {
			System.out.println(element);
		}
	}

}
