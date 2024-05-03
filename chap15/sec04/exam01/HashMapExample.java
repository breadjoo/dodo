package chap15.sec04.exam01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		// Map 컬렉션
		/*키와 값으로 구성된 엔트리 객체
		 * 키는 중복 저장할 수 없지만 값은 중복 저장 가능
		 * put(K,V) 키(K)와 값(V)을 추가하고ㅓ, 저장이 되면 값을 리턴
		 * get(k) : 주어진 키의 값을 리턴함*/
		
		//Map 컬렉션 생성 
		Map<String, Integer> map = new HashMap<>();
		// 객체 저장
		map.put("유환주",12);
		map.put("김환주",60);
		map.put("박환주",88);
		map.put("장환주",55);
		map.put("유환주",99); // key가 동일해서 기존값은 제거하고 마지막에 저장한 값만 저장
		System.out.println("총 Entry 수 : " +map.size());

		//key로 value 얻기
		String key = "유환주";
		int value = map.get(key);
		System.out.println(key+"의 값 : " +value);
		System.out.println(key+"의 값 : " +map.get("유환주"));
		
		//key Set 컬렉션을 얻고, 반복해서 key,value 얻기
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String k = keyIterator.next();
			Integer v = map.get(k);
			System.out.println(k+"의 값 : " +v);
		}	System.out.println();
		
		//엔트리 Set 컬렉션을 얻고, 반복해서 키와 값을 얻기
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();
		//엔트리를 반복하기 위해 반복자를 얻음
		while(entryIterator.hasNext()) {
			Entry<String, Integer> entry = entryIterator.next();
			String k = entry.getKey();
			Integer v = entry.getValue();
			System.out.println(k+ " : " + v);
		} 
		System.out.println();

		map.remove(key);
		System.out.println("총 Entry 수 : " +map.size());
		System.out.println();
		 
		}

}
